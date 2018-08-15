package org.estore.bs.bean.genbean;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 *
 *<p> 项目名称：baiHoo 电子商城</p>
 *<p>类名称:GenEntityMysql.java </p>
 *<p>类说明: 
 *		从MySql数据库动态生成java类
 *
 *</p>
 *
 * @author baiHoo.chen
 * @date 2018年3月21日上午9:19:29
 */
public class GenEntityMySQL {
    private static final GenEntityMySQL INSTANCE = new GenEntityMySQL();

    private String tableName;// 表名
    private String[] colNames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private String[] colComments ;// 获取表和字段注释
    private String tableComment; //表注释
    private int[] colSizes; // 列名大小数组
    private boolean needUtil = false; // 是否需要导入包java.util.*
    private boolean needSql = false; // 是否需要导入包java.sql.*
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final String SQL = "SELECT * FROM ";// 数据库操作

    // TODO 需要修改的地方
    private static final String URL = "jdbc:mysql://localhost:3306/eStore_db";
    private static final String DATABASE = "eStore_db";
    private static final String NAME = "root";
    private static final String PASS = "root";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private String packageOutPath = "edu.baiHoo.estore.bs.bean.bean";// 指定实体生成所在包的路径
    private String authorName = "baiHoo.chen";// 作者名字

    /**
     * 类的构造方法
     */
    private GenEntityMySQL() {
    }

    /**
     * @return
     * @description 生成class的所有内容
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private String parse() {
        StringBuffer sb = new StringBuffer();
        sb.append("package " + packageOutPath + ";\r\n");
        sb.append("\r\n");
        sb.append("import edu.baiHoo.estore.bs.bean.baseBean.BaseBean;\r\n");
        // 判断是否导入工具包
        if (needUtil) {
            sb.append("import java.util.Date;\r\n");
        }
        if (needSql) {
            sb.append("import java.sql.*;\r\n");
        }
        // 注释部分
		sb.append("/**\r\n");
		sb.append(" *\r\n");
		sb.append(" *\r\n");
		sb.append(" * <p> 项目名称：baiHoo 电子商城</p>\r\n");
		sb.append(" * <p>表名称: " + tableName + " </p>\n");
		sb.append(" * <p>表说明: \r\n");
		sb.append(" *\r\n");
		sb.append(" *		"+tableComment+"\r\n");
		sb.append(" *\r\n");
		sb.append(" * </p>\r\n");
		sb.append(" * <p>类名称: "+getTransStr(tableName, true)+".java </p>\r\n");
		sb.append(" * <p>类说明: \r\n");
		sb.append(" *\r\n");
		sb.append(" *\r\n");
		sb.append(" * </p>\r\n");
		sb.append(" *\r\n");
		sb.append(" * @author " + authorName + "\r\n");
		sb.append(" * @date " + SDF.format(new Date()) + "\r\n");
		sb.append(" */\r\n");
		// 实体部分
		sb.append("public class " + getTransStr(tableName, true) + " extends BaseBean {\r\n\r\n");
		processAllAttrs(sb);// 属性
		sb.append("\r\n");
		processAllMethod(sb);// get set方法
		sb.append("}\r\n");
		return sb.toString();
    }

    /**
     * @param sb
     * @description 生成所有成员变量
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private void processAllAttrs(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
        	String colName = colNames[i].toLowerCase();
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + getTransStr(colName, false) + ";	//"+colComments[i]+"\r\n");
        }
    }

    /**
     * @param sb
     * @description 生成所有get/set方法
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private void processAllMethod(StringBuffer sb) {
        for (int i = 0; i < colNames.length; i++) {
        	String colName = colNames[i].toLowerCase();
            sb.append("\tpublic void set" + getTransStr(colName, true) + "(" + sqlType2JavaType(colTypes[i]) + " "
                    + getTransStr(colName, false) + "){\r\n");
            sb.append("\t\tthis." + getTransStr(colName, false) + "=" + getTransStr(colName, false) + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + getTransStr(colName, true) + "(){\r\n");
            sb.append("\t\treturn " + getTransStr(colName, false) + ";\r\n");
            sb.append("\t}\r\n");
        }
    }

    /**
     * @param str 传入字符串
     * @return
     * @description 将传入字符串的首字母转成大写
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private String initCap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] = (char) (ch[0] - 32);
        return new String(ch);
    }

    /**
     * @return
     * @description 将mysql中表名和字段名转换成驼峰形式
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private String getTransStr(String before, boolean firstChar2Upper) {
        //不带"_"的字符串,则直接首字母大写后返回
        if (!before.contains("_"))
            return firstChar2Upper ? initCap(before) : before;
        String[] strs = before.split("_");
        StringBuffer after = null;
        if (firstChar2Upper) {
            after = new StringBuffer(initCap(strs[0]));
        } else {
            after = new StringBuffer(strs[0]);
        }
        if (strs.length > 1) {
            for (int i=1; i<strs.length; i++)
                after.append(initCap(strs[i]));
        }
        return after.toString();
    }

    /**
     * @return
     * @description 查找sql字段类型所对应的Java类型
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private String sqlType2JavaType(String sqlType) {
        if (sqlType.equalsIgnoreCase("bit")) {
            return "boolean";
        } else if (sqlType.equalsIgnoreCase("tinyint")) {
            return "byte";
        } else if (sqlType.equalsIgnoreCase("smallint")) {
            return "short";
        } else if (sqlType.equalsIgnoreCase("int")) {
            return "int";
        } else if (sqlType.equalsIgnoreCase("bigint")) {
            return "long";
        } else if (sqlType.equalsIgnoreCase("float")) {
            return "float";
        } else if (sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("numeric")
                || sqlType.equalsIgnoreCase("real") || sqlType.equalsIgnoreCase("money")
                || sqlType.equalsIgnoreCase("smallmoney")) {
            return "double";
        } else if (sqlType.equalsIgnoreCase("varchar") || sqlType.equalsIgnoreCase("char")
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nchar")
                || sqlType.equalsIgnoreCase("text")) {
            return "String";
        } else if (sqlType.equalsIgnoreCase("datetime")) {
            return "Date";
        } else if (sqlType.equalsIgnoreCase("image")) {
            return "Blod";
        }
        return null;
    }

    /**
     * 
     * @description 生成方法
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    private void generate() throws Exception {
        //与数据库的连接
        Connection con;
        PreparedStatement pStemt = null;
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL, NAME, PASS);
        System.out.println("connect database success...");
        //获取数据库的元数据
        DatabaseMetaData db = con.getMetaData();
        //从元数据中获取到所有的表名
        ResultSet rs = db.getTables(null, null, null, new String[] { "TABLE" });
        String tableSql;
        PrintWriter pw = null;
        while (rs.next()) {
            tableName = rs.getString(3);
            tableSql = SQL + tableName;
            pStemt = con.prepareStatement(tableSql);
            ResultSetMetaData rsmd = pStemt.getMetaData();
            int size = rsmd.getColumnCount();
            colNames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            //从数据库获取列注释
            ResultSet rst = pStemt.executeQuery("show full columns from " + tableName);
            int count=0;
            colComments = new String[size];
            while (rst.next()) {
            	colComments[count]=(rst.getString("Comment"));
            	count++;
            }
          //从数据库获取表注释
            ResultSet rst2 = pStemt.executeQuery("Select TABLE_NAME ,TABLE_COMMENT from INFORMATION_SCHEMA.TABLES Where table_schema = '"+DATABASE+"' AND TABLE_NAME='" + tableName+"'");
            while (rst2.next()) {
                tableComment = rst2.getString("TABLE_COMMENT");
            }
            //获取所需的信息
            for (int i = 0; i < size; i++) {
                colNames[i] = rsmd.getColumnName(i + 1);
                colTypes[i] = rsmd.getColumnTypeName(i + 1);
                if (colTypes[i].equalsIgnoreCase("datetime")) {
                    needUtil = true;
                }
                if (colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")) {
                    needSql = true;
                }
                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
            }
            //解析生成class的所有内容
            String content = parse();
            //输出生成文件
            File directory = new File("");
            String outputPath = directory.getAbsolutePath() + "/src/main/java/" + packageOutPath.replace(".", "/");
            if(!new File(outputPath).exists()) {
            	new File(outputPath).mkdirs();
            }
            outputPath = outputPath + "/" + getTransStr(tableName, true) + ".java";
            FileWriter fw = new FileWriter(outputPath);
            pw = new PrintWriter(fw);
            pw.println(content);
            pw.flush();
            System.out.println("create class >>>>> " + tableName);
        }
        if (pw != null)
            pw.close();
    }

    /**
     * @param args
     * @description 执行方法
     * @author baiHoo.chen
     * @date 2018年3月21日 上午9:16:17
     * @update 2018年3月21日 上午9:16:17 
     * @version V1.0
     */
    public static void main(String[] args) {
        try {
            INSTANCE.generate();
            System.out.println("generate classes success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
