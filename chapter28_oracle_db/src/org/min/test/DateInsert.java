package org.min.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class DateInsert<T> {

	public void dataInsert(ArrayList<T> arr, String tableName) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBConnection.getConnection();
			String[] sql = new String[arr.size()] ;
		
		for(int i =0; i<arr.size(); i++) {
			String [] items = ((String) arr.get(i)).split(",");
			sql[i]="insert into "+ tableName+" values(?,?)";
			ps = conn.prepareStatement(sql[i]); 
			ps.setString(1, items[1]);
			ps.setString(2, items[2]);
			int result = ps.executeUpdate();
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
