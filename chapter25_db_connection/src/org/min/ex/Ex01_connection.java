package org.min.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// oracle jdbc를 프로젝트에 등록해야 db를 사용할 수 있다.//

public class Ex01_connection {
	public static void main(String[] args) {

		// 1. Connection 인스턴스
		Connection conn;
		
		try {
			// 2. Oracle jdbc 드라이버 로드 Class.forName("드라이버 종류")
			Class.forName("oracle.jdbc.driver.OracleDriver");  // 
			//Class.forName("com.mysql.jdbc.Driver");  //My-sql일 경우
			//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver"); // MS-sql일 경우

			
			// 3. 접속 정보 생성
			String user = "scott";
			String password = "tiger";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//url//
			// Oracle : jdbc:oracle://localhost:1521:SID
			// Mysql : jdbc:mysql://localhost:3306:DB명
			// MS-sql : jdbc:Microsoft:sqlserver://localhost:1433;databasename=DB명
			
			// 4. DriverManager : 자바를 오라클 jdbc에 연결시켜주는 클래스
			conn = DriverManager.getConnection(url,user,password);
			
			// 5. 연결 확인 메세지
			System.out.println("DB 연결 성공 !!");
			
			// 6. 접속 종료
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 드라이버 오료");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
	}
}
