package com.test.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqliteTest {

	public static void main(String[] args) {
		  try {
	          
	            String fileName = "./test.db";
	            
	            Class.forName("org.sqlite.JDBC");
	           
	            Connection conn = DriverManager.getConnection("jdbc:sqlite:c:/test.db");
	         
	            Statement stmt = conn.createStatement();
	         
	         // 2 创建一个表tbl1，录入数据
	            stmt.executeUpdate("drop table if exists euser;");
	            stmt.executeUpdate("create table if not exists euser(name varchar(20), salary int);");//创建一个表，两列
	            stmt.executeUpdate("insert into euser values('ZhangSan',8000);"); // 插入数据
	            stmt.executeUpdate("insert into euser values('张明',7800);");
	            conn.commit();
	           /* ResultSet rs = stmt.executeQuery("SELECT * from euser");
	           
	            while (rs.next()) {
	                String name   = rs.getString("name");   // Column 1
	                Integer salary = rs.getInt("salary"); // Column 2
	               
	                System.out.println("name: "+name+" salary: "+salary);

	            }*/
	          
	            stmt.close();
	            conn.close();
	        }
	        catch (Exception e) {
	            // Print some generic debug info
	            System.out.println(e.getMessage());
	            System.out.println(e.toString());
	        }
	}
}
