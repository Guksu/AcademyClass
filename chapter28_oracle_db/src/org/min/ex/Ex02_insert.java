package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.min.db.DBconnect;

public class Ex02_insert {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBconnect.getConnection();
			
			String[] sql = {
					"insert into member(no, id, pw, email, grade)"+
					"values(member_seq.nextval, 'id01', '1111', 'id01@aa.com', 'vip')",
					"insert into member(no, id, pw, email, grade)"+
					"values(member_seq.nextval, 'id02', '1111', 'id02@aa.com', 'gold')",
					"insert into member(no, id, pw, email, grade)"+
					"values(member_seq.nextval, 'id03', '1111', 'id03@aa.com', 'vip')",
					"insert into member(no, id, pw, email, grade)"+
					"values(member_seq.nextval, 'id04', '1111', 'id04@aa.com', 'gold')",
					"insert into member(no, id, pw, email, grade)"+
					"values(member_seq.nextval, 'id05', '1111', 'id05@aa.com', 'vip')"
			};
			
			for(int i =0; i<sql.length; i++) {
				ps = conn.prepareStatement(sql[i]); 
				int result = ps.executeUpdate();
				if(result >0) {
					System.out.println("삽입 성공 !");
				}else {
					System.out.println("삽입 실패 !");
				}
				
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
