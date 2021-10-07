package org.min.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	// 1.  getConnection()은 매개변수가 없다
	// 2.  getConnection() 리턴타입은 Connection이다.
	// 3.  new DBconnect()의 호출 없이(인스턴스 없이)  getConnection 메소드가 호출되므로 static처리한다.
	// 4.  예외 클래스를 던진다.
	
	public static Connection getConnection() throws ClassNotFoundException , SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = DriverManager.getConnection(url,user,password);
		
		return conn;
	}
}
