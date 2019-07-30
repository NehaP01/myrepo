package com.t7.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port ="3306" ;
		String databasename="CJ360Credential";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+ "/"+databasename,"root" ,"root123"); 
	    Statement stmt= con.createStatement();
	    ResultSet rs=stmt.executeQuery("select * from loginInfo;");
	    while(rs.next()) {
	    	String username=rs.getString("uname");
	    	String password=rs.getString("passwd");
	    	String cc=rs.getString("comapanycode");
	    	System.out.println(username);
	    	System.out.println(password);
	    	System.out.println(cc);
	    }
	}

}
