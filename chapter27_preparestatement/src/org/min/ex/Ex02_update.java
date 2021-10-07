package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.min.db.DBconnect;

public class Ex02_update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBconnect.getConnection();
			
			// ps는 변하는 값을 사용한다.
			String sql = "update person set age=? where name='홍길동'";
			// 나중에 setter로 채울 수 있다.
			
			ps = conn.prepareStatement(sql); 
			
			ps.setInt(1,25);
			
			
			int result = ps.executeUpdate();
			
			if(result >0) {
				System.out.println("수정 성공 !");
			}else {
				System.out.println("수정 실패 !");
			}
			
			conn.commit();
			
		} catch (Exception e) {
			try {
				if(conn!=null) { conn.rollback();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {
				if(ps!=null) {ps.close();}
				if(conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
