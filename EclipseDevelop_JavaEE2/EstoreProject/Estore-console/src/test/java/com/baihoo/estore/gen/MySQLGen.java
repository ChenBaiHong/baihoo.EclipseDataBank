package com.baihoo.estore.gen;

import com.baihoo.estore.core.utils.GenEntityMySQLHbm;

public class MySQLGen {
	public static void main(String[] args) throws Exception {
        // TODO 需要修改的地方
        String uRL ="jdbc:mysql://192.168.1.15:3306/EstoreBS";    
        String nAME = "root";    
        String pASS = "root";    
        String packageOutPath = "com.baihoo.estore.pojo";// 指定实体生成所在包的路径
        String authorName = "baiHoo.chen";// 作者名字
        GenEntityMySQLHbm genSql =  new GenEntityMySQLHbm( uRL,  nAME,  pASS,  packageOutPath,  authorName);
    	genSql.generate();
       System.out.println("generate classes success!");
	}
}
