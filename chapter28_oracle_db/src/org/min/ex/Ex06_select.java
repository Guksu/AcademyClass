package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.min.db.DBconnect;

public class Ex06_select {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBconnect.getConnection();
			
			String sql = "select * from member where grade=?";
			
			ps = conn.prepareStatement(sql); 
			
			System.out.println("조회할 등급을 입력하세요");
			String grade = sc.nextLine();
			ps.setString(1, grade);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print("["+rs.getInt(1)+" , ");
				System.out.print(rs.getString(2)+" , ");
				System.out.print(rs.getString(3)+" , ");
				System.out.print(rs.getString(4)+" , ");
				System.out.print(rs.getInt(5)+" , ");
				System.out.print(rs.getString(6)+" , ");
				System.out.print(rs.getDate(7)+"]");
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {rs.close();}
				if(ps!=null) {ps.close();}
				if(conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
