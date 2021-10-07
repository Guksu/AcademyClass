package org.min.ex2;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionMain {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			conn = DBConnect.getConnection();
			System.out.println("DB 연결 성공 !!");
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 오료");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
