package org.min.ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.min.db.DBconnect;

public class Ex04_update {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			Connection conn = null;
			PreparedStatement ps = null;
			
			try {
				conn = DBconnect.getConnection();
				
				String sql = "update member set pw=? where id=?";
				
				ps= conn.prepareStatement(sql);
				
				System.out.println("pw를 바꿀 id를 입력하세요");
				String id = sc.nextLine();
				ps.setString(2, id);
				
				System.out.println("바꿀 pw를 입력하세요");
				int pw = sc.nextInt();
				ps.setInt(1, pw);
				
				int result = ps.executeUpdate();
				
				if(result >0) {
					System.out.println("수정 성공 !");
				}else {
					System.out.println("수정 실패 !");
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
