package com.test.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception{
		  Class.forName("org.sqlite.JDBC");
		    Connection conn =
		      DriverManager.getConnection("jdbc:sqlite:/test.db");

	}
	
    @org.junit.Test
	public void insert()throws Exception{
		Class.forName("org.sqlite.JDBC");
		/***
		 * jdbc:sqlite:/test.db --> windows系统上，test.db文件将在分区所在的根目录(如果项目文件在在d盘，则test.db将在d:\目录下创建)
		 * jdbc:sqlite:/test/test.db --> windows系统上，test.db文件将在分区所在的根目录下的test目录(如果项目文件在在d盘，则test.db将在d:\test目录下创建)
		 * jdbc:sqlite://c://test.db --> windows系统上，test.db文件将在c盘下创建。
		 */
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/test.db");
		Statement stmt = conn.createStatement();

		// 2 创建一个表tbl1，录入数据
		stmt.executeUpdate("drop table if exists euser;");
		stmt.executeUpdate("create table if not exists euser(name varchar(20), salary int);");// 创建一个表，两列
		stmt.executeUpdate("insert into euser values('ZhangSan',8000);"); // 插入数据
		stmt.executeUpdate("insert into euser values('张明',7800);");
		
		stmt.close();
		conn.close();
		System.out.println("insert finished!");
	}
    
    @org.junit.Test
    public void query()throws Exception{
    	Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/test.db");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT * from euser");
        
        while (rs.next()) {
            String name   = rs.getString("name");   // Column 1
            Integer salary = rs.getInt("salary"); // Column 2
           
            System.out.println("name: "+name+" salary: "+salary);

        }
    }

}
