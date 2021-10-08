package org.min.ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.min.db.DBconnect;

public class Ex03_insert2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBconnect.getConnection();
			
			String[] sql = new String[5];
			
			for(int i =0; i<sql.length; i++) {
				sql[i] = "insert into member values(member_seq.nextval, ? ,? ,? ,? ,?, ?)";
				ps = conn.prepareStatement(sql[i]); 
				int result = ps.executeUpdate();
				
				System.out.println("id 입력하세요");
				String id = sc.nextLine();
				ps.setString(1,id);
				
				System.out.println("pw 입력하세요");
				String pw = sc.nextLine();
				ps.setString(2, pw);

				System.out.println("email 입력하세요");
				String email = sc.nextLine();
				ps.setString(3, email);
		
				System.out.println("point 입력하세요");
				int point = sc.nextInt();
				sc.nextLine();
				ps.setInt(4, point);
			
				System.out.println("grade 입력하세요");
				String grade = sc.nextLine();
				ps.setString(5, grade);
				
				System.out.println("regdate 입력하세요");
				String date = sc.nextLine();
				Date regdate = Date.valueOf(date);
				ps.setDate(6, regdate);
				
				
				if(result >0) {
					System.out.println("삽입 성공 !");
				}else {
					System.out.println("삽입 실패 !");
				}
				
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
