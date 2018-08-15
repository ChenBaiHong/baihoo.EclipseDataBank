package org.baiHoo.excel;

import java.io.File;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.baiHoo.bean.SimcStoreIn;
import org.baiHoo.db.DataObject;
import org.baiHoo.db.DatabaseUtils;
import org.baiHoo.db.MyOraDbUtils;

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
 * 类名称:ExcelBsiToOracle.java
 * </p>
 * <p>
 * 类说明:
 *
 * excel库房台账数据导入到oracle
 * 
 * </p>
 *
 * @author baiHoo.chen
 * @date 2018年6月8日上午9:48:27
 */
public class ExcelBsiToOracle {

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
				List<DataObject> dataObjects = new ArrayList<DataObject>();
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
					if(gpn.contains(",")) {
						String [] gpns = gpn.split(",");
						for (String str : gpns) {
							DataObject storeDo = new DataObject(SimcStoreIn.class);
							storeDo.set("GPN", str);
							DataObject resutl = DatabaseUtils.expandEntity("default",storeDo);
							if(resutl == null){
								continue;
							}
							SimcStoreIn storeIn = (SimcStoreIn) resutl.getBean();
							incrementStoreInGPNCount(map , str);
							orgExcelStoreInEntitys(dataObjects , storeIn , map , number , customName, str);
						}
					}else {
						DataObject storeDo = new DataObject(SimcStoreIn.class);
						storeDo.set("GPN", gpn);
						DataObject resutl = DatabaseUtils.expandEntity("default",storeDo);
						if(resutl == null){
							continue;
						}
						SimcStoreIn storeIn = (SimcStoreIn) resutl.getBean();
						incrementStoreInGPNCount(map , gpn);
						orgExcelStoreInEntitys(dataObjects , storeIn , map , number , customName, gpn);
					}
					System.out.println(i+"="+rsRows);
					if(dataObjects.size()== 500) {
						DatabaseUtils.insertEntityBatch("default", dataObjects.toArray(new DataObject[dataObjects.size()]));
						dataObjects =  new ArrayList<DataObject>();
					}else if(i  == rsRows-1){
						DatabaseUtils.insertEntityBatch("default", dataObjects.toArray(new DataObject[dataObjects.size()]));
						dataObjects =  new ArrayList<DataObject>();
					}
				}
		}
		return 1;
	}	
	/**
	 * 
	 *  组织导入库房台账导入附件功能模块代码
	 * @param dataObjects
	 * @param storeIn
	 * @param map
	 * @param number
	 * @param customName
	 * @param gpn
	 * @throws Exception
	 */
	private void orgExcelStoreInEntitys(List<DataObject> dataObjects  , SimcStoreIn storeIn , 
			Map<String , Integer> map,String number ,  String customName , String gpn) throws Exception{
		SimcStoreIn storeInClo = (SimcStoreIn) storeIn.clone();
		storeInClo.setCustomName(customName);
		storeInClo.setPid(storeInClo.getObjectId());
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
				SimcStoreIn subClo = (SimcStoreIn) storeInClo.clone();
				String gpnClo = gpn +"-"+map.get(gpn)+"-"+i;
				subClo.setGpn(gpnClo);
				subClo.setObjectId(MyOraDbUtils.generateUuid());
				dataObjects.add(new DataObject(subClo));
				i++;
			}
		}else {
			String gpnClo = gpn+"-"+map.get(gpn)+"-"+1;
			storeInClo.setGpn(gpnClo);
			storeInClo.setObjectId(MyOraDbUtils.generateUuid());
			dataObjects.add(new DataObject(storeInClo));
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
