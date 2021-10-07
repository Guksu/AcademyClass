package org.min.ex;

import java.sql.Connection;
import java.sql.Statement;

import org.min.db.DBConnect;

public class Ex02_Update {
	public static void main(String[] args) {
		Connection conn =null;
		Statement st = null;

		try {
		 conn = DBConnect.getConnection();
		 
		 st =  conn.createStatement();
		 
		 // 쿼리 작성
		 String sql = "update person set age=28 where name='스콧'";

		 // 쿼리 보내기
		 // executeUpdate : insert, update, delete 문 날릴 때 사용   - > 리턴타입은 int
		 int result = st.executeUpdate(sql);
		 
		 if(result >0  ) {
			 System.out.println("레코드 수정 성공 !");
		 }else {
			 System.out.println("레코드 수정 실패 !");
		 }
		 
		 //커밋(저장)
		 conn.commit();
		 
		} catch (Exception e) {
			e.printStackTrace();
			
			//문제가 있으면 롤백
			try {
				if(conn != null) {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
	
		} finally {
			try {
				// 닫을 때 생성의 역순
				if(st != null) {
					st.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
