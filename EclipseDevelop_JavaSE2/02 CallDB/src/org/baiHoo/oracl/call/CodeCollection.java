package org.baiHoo.oracl.call;


/**
 * 类说明：保存系统级的常量代码和值
 * 修改记录
 */
public class CodeCollection {
	
	public static final String deptRootId="0";
	public static final String deptRootParentId="-1";
	public static final String defaultSysCustomedId = "-1";
	
	// sunqm Mgr返回值ResultValue的intResultCode使用
	public static final int SUCCESS = 0;  //成功
	public static final int FAIL = 1;     //失败
	public static final int WARN = 2;     //警告
	// 向存储过程输出日期格式  1970-01-01 23：23：23
	public static final String dateFormatForProc = "yyyy-MM-dd HH:mm:ss";
	// 向存储过程输出时间日期格式  1970-01-01 23：23：23
	public static final String dateTimeFormatForProc = "yyyy-MM-dd HH:mm:ss";
	// 调用hql查询语句使用的日期转换格式  1970-01-01 23：23：23
	public static final String dateFormatForHql  = "YYYY-MM-DD hh24:mi:ss"; 
	// 调用hql查询语句使用的日期转换格式  1970-01-01 23：00
	public static final String dateFormatForHqlNoSecond  = "YYYY-MM-DD hh24:mi"; 
	// 页面与class之间转换使用的时间日期转换格式(没有秒) 1970-01-01 23：00
	public static final String dateTimeFormatNoSecond  = "yyyy-MM-dd HH:mm"; 
	// 页面与class之间转换使用的时间日期转换格式  1970-01-01 23：23：23
	public static final String dateTimeFormatForPage = "yyyy-MM-dd HH:mm:ss";
	// 页面与class之间转换使用的日期转换格式 1970-01-01
	public static final String dateFormatForPage = "yyyy-MM-dd";
	
	public static final String dateFormatForQc = "yyyy年MM月dd日";
	
	public static final String treeNoSplit = "@";
	//地点id，配置文件使用
	public static final Long capeSiteId = 1L;
	//配置文件级别代码1
	public static final String Profile_Level_Code_1 = "1";
	//现场id卡登录密钥
	public static final String cardPasswordCommon = ""; 
}
