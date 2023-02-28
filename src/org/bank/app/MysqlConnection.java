package org.bank.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	
	static Connection conn=null;
	public static Connection getConnection()throws SQLException

	{
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db","root","root");
		return conn;
	}
	public static void closeConnection()
{if(conn!=null) {
	try {
		conn.close();
	}
	catch(SQLException e) {
		
		System.out.println("Something Wrong");
	}
}
		
}
}
