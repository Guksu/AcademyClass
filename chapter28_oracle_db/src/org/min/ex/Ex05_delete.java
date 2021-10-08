package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.min.db.DBconnect;

public class Ex05_delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBconnect.getConnection();
			
			String sql = "delete from member where id=?";
			
			ps= conn.prepareStatement(sql);
			
			System.out.println("삭제할 id를 입력하세요");
			String id = sc.nextLine();
			ps.setString(1, id);
			
			int result = ps.executeUpdate();
			
			if(result >0) {
				System.out.println("삭제 성공 !");
			}else {
				System.out.println("삭제 실패 !");
			}
			
			conn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
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
