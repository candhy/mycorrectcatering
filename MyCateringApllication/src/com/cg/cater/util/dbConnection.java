package com.cg.cater.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {
	public static Connection getconnection() throws IOException,SQLException, ClassNotFoundException
	{
		try
		{
			FileInputStream fs=new FileInputStream("resources/db.properties");
			Properties pro=new Properties();
			pro.load(fs);
			String driver=pro.getProperty("driver");
			String url=pro.getProperty("url");
			String username=pro.getProperty("username");
			String password=pro.getProperty("password");
		     Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			return con;
		}
			
		
	catch(FileNotFoundException fe)
		{
		System.out.println(fe);
		}
		return null;
	}

}



