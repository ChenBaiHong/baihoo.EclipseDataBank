package org.estore.common.excel;

import java.io.File;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.estore.common.bean.BaseBean;
import org.estore.common.bean.FdmpStoreIn;
import org.estore.common.myDbUtils.MyOraDbUtils;
import org.estore.common.myDbUtils.OraQueryRunner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * 
 *
 * <p>
 * 项目名称：baiHoo 电子商城
 * </p>
 * <p>
 * 类名称:ExcelToOracle.java
 * </p>
 * <p>
 * 类说明:
 *
 * excel数据导入到oracle
 * 
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018年6月8日上午9:48:27
 */
public class ExcelToOracle {

	/**
	 * 
	 * @param targetFile  excel 文件路径
	 * @param entityName  excel 关联实体全名
	 * @param submitCount excel 上限提交数量
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("all")
	public int importDataStoreIn(String targetFile, int submitCount)throws Exception {
		File file = new File(targetFile);
		// 创建新的Excel 工作簿
		Workbook rwb  = Workbook.getWorkbook(file);
		//遍历Excel表格片数量, 工作簿中的第一个表索引即为excel下的sheet1,sheet2,sheet3...
		for (int sheetCount = 0; sheetCount < rwb.getSheets().length; sheetCount++) {
				Sheet sheet = rwb.getSheets()[sheetCount];
				int rsColumns = sheet.getColumns();// 列数
				int rsRows = sheet.getRows();// 行数
				List<FdmpStoreIn> dataObjects = new ArrayList<FdmpStoreIn>();
				// 第一行为#字段名 下标-0
				// 第二行为字段标题 下标-1
				if(rsColumns ==0) {
					return 0 ;
				}
				String [] 	fieldNames = new String[rsColumns]; 
				for (int j = 0; j < rsColumns; j++) {
					Cell cell = sheet.getCell(j, 0);
					fieldNames[j] = cell.getContents();
				}
				String GPN = fieldNames[0];
				String CUSTOM_NAME = fieldNames[1];
				//String QUANTITY = ew.getFieldNames()[2];
				//遍历Excel 表格每行的数据
				Map<String , Integer> map = new HashMap<String , Integer>();
				for (int i = 2; i < rsRows; i++) {
					
					Cell cell1 = sheet.getCell(0, i);
					Cell cell2 = sheet.getCell(1, i);
					Cell cell3 = sheet.getCell(2, i);
					
					String gpn = cell1.getContents();
					String customName = cell2.getContents();
					String number = cell3.getContents();
					if(gpn == null || customName==null || number==null){
						continue;
					}
					OraQueryRunner oraRunner = new OraQueryRunner();
					String sql = "SELECT * FROM FDMP_STORE_IN WHERE GPN = ?";
					String [] params = new String[]{gpn};
					FdmpStoreIn storeIn = oraRunner.queryBean(MyOraDbUtils.getConnection(), sql, params, FdmpStoreIn.class);
					if(storeIn == null){
						continue;
					}
					incrementStoreInGPNCount(map , gpn);
					orgExcelStoreInEntitys(dataObjects , storeIn , map , number , customName, gpn);
					
					System.out.println(dataObjects);
					if(dataObjects.size()== 500) {
						MyOraDbUtils.startTranscation();
						int flag= oraRunner.insertBatchBean(MyOraDbUtils.getConnection() , dataObjects );
						MyOraDbUtils.commitTranscation();
					}else if(i  == rsRows - 1){
						MyOraDbUtils.startTranscation();
						int flag= oraRunner.insertBatchBean(MyOraDbUtils.getConnection() , dataObjects );
						MyOraDbUtils.commitTranscation();
					}
				}
		}
		return 1;
	}	

	private void orgExcelStoreInEntitys(List<FdmpStoreIn> dataObjects  , FdmpStoreIn storeIn , 
			Map<String , Integer> map,String number ,  String customName , String gpn) throws Exception{
		
		FdmpStoreIn storeInClo = (FdmpStoreIn) storeIn.clone();
		storeInClo.setCustomName(customName);
		storeInClo.setPid(storeInClo.getStoreInId());
		storeInClo.setCreationDate(new java.util.Date());
		storeInClo.setLastUpdateDate(new java.util.Date());
		InetAddress myIp= InetAddress.getLocalHost();//获取IP地址
		storeInClo.setLastUpdateIp(myIp.getHostAddress());
		int quantity = 1;
		if(number !=null){
			quantity = Integer.parseInt(number);
		}
		if(quantity >1){
			int i = 1;
			while(i <= quantity){
				FdmpStoreIn subClo = (FdmpStoreIn) storeInClo.clone();
				String gpnClo = gpn +"-"+map.get(gpn)+"-"+i;
				subClo.setGpn(gpnClo);
				subClo.setStoreInId(MyOraDbUtils.generateUuid());
				dataObjects.add(subClo);
				i++;
			}
		}else {
			String gpnClo = gpn+"-"+map.get(gpn)+"-"+1;
			storeInClo.setGpn(gpnClo);
			storeInClo.setStoreInId(MyOraDbUtils.generateUuid());
			dataObjects.add(storeInClo);
		}
	}
	private void incrementStoreInGPNCount(Map<String , Integer> map , String gpn){
		Integer increQun = map.get(gpn);
		if(increQun==null){
			map.put(gpn, 1);
		}else{
			map.put(gpn, increQun+1);
		}
	}
}
