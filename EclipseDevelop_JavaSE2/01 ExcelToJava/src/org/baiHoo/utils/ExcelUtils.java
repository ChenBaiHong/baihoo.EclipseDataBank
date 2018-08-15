package org.baiHoo.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.baiHoo.db.DataObject;
import org.baiHoo.excel.ExcelTemplate;
import org.baiHoo.excel.batchProblem.UtilConfiguration;

/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:ExcelUtils.java </p>
 *<p>类说明: 
 *
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年6月8日上午9:20:37
 */
public class ExcelUtils {
	 private ExcelUtils(){
	  //工具类不允许实例化
	 }

	 /**
	  * 将Excel数据导入到数据库指定的表，默认每500条数据执行一次批处理导入
	  *
	  * @param excelFile Excel文件名
	  * @param entityFullName 导入的实体全名
	  * @return
	  * @throws Exception
	  */

	 public static int importExcel(String excelFile,String entityFullName)throws Exception{
	  ExcelTemplate template=new ExcelTemplate();
	  return template.importData(excelFile, entityFullName, 500);
	 }
	 
	 

	 /**
	  * 将Excel数据导入到数据库指定的表
	  * @param excelFile
	  * @param entityFullName
	  * @return
	  * @throws Exception
	  */
	public static int importExcelStoreIn(String excelFile, String entityFullName) throws Exception {
		ExcelTemplate template = new ExcelTemplate();
		return template.importDataStoreIn(excelFile, entityFullName, 500);
	}

	 /**
	  * 将指定的对象数组exportObjects导出到指定模板的Excel文件
	  *
	  * @param exportObjects 待导出的对象数组
	  * @param exportInfo  模板文件的其他附加信息(非结果集内容)
	  * @param templateFilename 模板文件名(不带扩展名),对应到在user-config.xml配置路径下的模板文件
	  * @return 返回生成的Excel文件下载路径
	  * @throws Exception
	  */

	 public static String exportExcel(DataObject[] exportObjects,DataObject exportInfo,String templateFilename) throws Exception{
	  return exportExcel(exportObjects,exportInfo,templateFilename,false,false);
	 }
	 
	 /**
	  * 分页将对象数组导出到指定的模板Excel文件,注意：此时模板文件必需包含Excel表格的分页符
	  * @param exportObjects 待导出的对象数组
	  * @param exportInfo  模板文件的其他附加信息(非结果集内容)
	  * @param templateFilename 模板文件名(不带扩展名),对应到在user-config.xml配置路径下的模板文件
	  * @return 返回生成的Excel文件下载路径
	  * @throws Exception
	  */

	 public static String exportExcelWithPagnation(DataObject[] exportObjects,DataObject exportInfo,String templateFilename)throws Exception{
	  return exportExcel(exportObjects,exportInfo,templateFilename,true,false);
	 }
	 
	 /**
	  * 分工作表将对象数组导出到指定的模板Excel文件，默认情况下输出工作表最大行:20000
	  * @param exportObjects 待导出的对象数组
	  * @param exportInfo  模板文件的其他附加信息(非结果集内容)
	  * @param templateFilename 模板文件名(不带扩展名),对应到在user-config.xml配置路径下的模板文件
	  * @return 返回生成的Excel文件下载路径
	  * @throws Exception
	  */

	 public static String exportExcelWithSheet(DataObject[] exportObjects,DataObject exportInfo,String templateFilename)throws Exception{
	  return exportExcel(exportObjects,exportInfo,templateFilename,false,true);
	 }
	 
	 /**
	  * 导出Excel文件,根据指定路径下的模板生成输出的Excel文件
	  *
	  * @param exportObjects 待导出的对象数组
	  * @param exportInfo 模板文件的其他附加信息(非结果集内容)
	  * @param templateFilename 模板文件名(不带扩展名),对应到在user-config.xml配置路径下的模板文件
	  * @param autoPagination 是否分页
	  * @param autoSheet 是否分工作表
	  * @return 返回生成的Excel文件下载路径
	  * @throws Exception
	  */
	 private static String exportExcel(Object[] exportObjects,DataObject exportInfo,String templateFilename,boolean autoPagination,boolean autoSheet) throws Exception{
		 String filename=templateFilename;
		 if(filename.indexOf(".xls")==-1){
		     filename+=".xls";
		 }
		 
		 
		 
		 
		  //临时路径是服务器当前war下面的excel-config目录
		  String templateDir= UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS;
				  			/*
				  			ApplicationContext.getInstance().getWarRealPath()+ConfigurationUtil.getContributionConfig
							   (UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS,
							    UtilConfiguration.MODULE_ABFRAME,
							    UtilConfiguration.GROUP_EXCEL,
							    UtilConfiguration.EXCEL_TEMPLATE_PATH);
		  					*/
		  String excelExportMaxnum=500+"";
				  			/*
				  			ConfigurationUtil.getContributionConfig(UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS,
							    UtilConfiguration.MODULE_ABFRAME,
							    UtilConfiguration.GROUP_EXCEL,
							    UtilConfiguration.EXCEL_EXPORT_MAXNUM);
		  					*/
		  
		  
		  
		  
		  
		  
		  
		  if(!templateDir.endsWith("/")){
		   templateDir+="/";
		  }
		  String tempDir=templateDir+"temp/";
		  File file=new File(tempDir);
		  if(!file.exists()){
		   //创建临时目录
		   file.createNewFile();
		  }
		  String templateFile=templateDir+filename;
		  String outputFile=tempDir+generateOutputExcelFile(filename);
		  ExcelTemplate template=new ExcelTemplate(templateFile,outputFile);
		  template.setAutoPagination(autoPagination);
		  template.setAutoSheet(autoSheet);
		  int excelExportMaxnumInt = 0;
		  try{
		   excelExportMaxnumInt = Integer.parseInt(excelExportMaxnum);
		  }catch (Exception e){
		   e.printStackTrace();
		  }
		  template.setMaxRow(excelExportMaxnumInt);
		  template.generate(Arrays.asList(exportObjects),exportInfo);
		  return outputFile;
	 }
	 
	 /**
	  * 生成EXCEL输出文件，默认带时间戳
	  * @param templateFilename 文件名
	  * @return
	  */
	 private static String generateOutputExcelFile(String templateFilename){
		  String filename=templateFilename;
		  if(templateFilename.endsWith(".xls")){
		   filename=templateFilename.substring(0,templateFilename.length()-4);
		  }
		  SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		  String datetimeString=format.format(new Date());
		  filename=filename+"_"+datetimeString+".xls";
		  return filename;
	 }
	 
	 
	 /**
	  * 将指定的对象数组导出到指定模板的Excel文件
	  * @param map
	  * @param exportInfo
	  * @param templateFilename
	  * @return
	  * @throws Exception
	  */
	 public static String exportExcelBySheet(Map<String, List> map,DataObject exportInfo,String templateFilename) throws Exception{
		  return exportExcelBySheet(map,exportInfo,templateFilename,false,false);
		 }
	 
	 private static String exportExcelBySheet(Map<String, List> map,DataObject exportInfo,String templateFilename,boolean autoPagination,boolean autoSheet) throws Exception{
		 String filename=templateFilename;
		 if(filename.indexOf(".xls")==-1){
		     filename+=".xls";
		 }

		 
		 
		 
		  //临时路径是服务器当前war下面的excel-config目录
		  String templateDir= UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS;
				  			/*
				  			ApplicationContext.getInstance().getWarRealPath()+ConfigurationUtil.getContributionConfig
							   (UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS,
							    UtilConfiguration.MODULE_ABFRAME,
							    UtilConfiguration.GROUP_EXCEL,
							    UtilConfiguration.EXCEL_TEMPLATE_PATH);
		  					*/
		  String excelExportMaxnum=500+"";
				  			/*
				  			ConfigurationUtil.getContributionConfig(UtilConfiguration.CONTRIBUTION_ABFRAME_UTILS,
							    UtilConfiguration.MODULE_ABFRAME,
							    UtilConfiguration.GROUP_EXCEL,
							    UtilConfiguration.EXCEL_EXPORT_MAXNUM);
		  					*/
		  
		  
		  
		  
		  
		  
		  
		  if(!templateDir.endsWith("/")){
		   templateDir+="/";
		  }
		  String tempDir=templateDir+"temp/";
		  File file=new File(tempDir);
		  if(!file.exists()){
		   //创建临时目录
		   file.createNewFile();
		  }
		  String templateFile=templateDir+filename;
		  String outputFile=tempDir+generateOutputExcelFile(filename);
		  ExcelTemplate template=new ExcelTemplate(templateFile,outputFile);
		  template.setAutoPagination(autoPagination);
		  template.setAutoSheet(autoSheet);
		  int excelExportMaxnumInt = 0;
		  try{
		   excelExportMaxnumInt = Integer.parseInt(excelExportMaxnum);
		  }catch (Exception e){
		   e.printStackTrace();
		  }
		  template.setMaxRow(excelExportMaxnumInt);
		  template.generateBySheet(map,exportInfo);
		  return outputFile;
	 }
	 
}
