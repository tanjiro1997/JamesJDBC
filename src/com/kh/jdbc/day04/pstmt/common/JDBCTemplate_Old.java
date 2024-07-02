package com.kh.jdbc.day04.pstmt.common;

import java.sql.*;

public class JDBCTemplate_Old {
	private static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "JAMESJDBC";
	private static final String PASSWORD = "JAMESJDBC";
	
	private static Connection conn;
	
	public static Connection getConnection() 
						throws SQLException, ClassNotFoundException {
		if(conn == null || conn.isClosed()) {
			Class.forName(DRIVER_NAME);
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		return conn;
	}
}
