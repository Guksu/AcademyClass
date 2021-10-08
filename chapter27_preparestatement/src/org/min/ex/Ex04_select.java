package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.min.db.DBconnect;

public class Ex04_select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBconnect.getConnection();
			
			// ps는 변하는 값을 사용한다.
			String sql = "select * from person";
			// 나중에 setter로 채울 수 있다.
			
			ps = conn.prepareStatement(sql); 
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+",");
				System.out.println(rs.getInt(2)+",");
				System.out.println(rs.getString(3));
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
