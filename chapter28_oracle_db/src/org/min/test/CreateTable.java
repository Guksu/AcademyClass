package org.min.test;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class CreateTable {
		
	public void createTable(String tableName) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DBConnection.getConnection();

			String sql = "create table "+tableName+
					"(imgname varchar2(30), urlname varchar2(50))";

			ps = conn.prepareStatement(sql);
			ps.execute();


		} catch (Exception e) {
			e.printStackTrace();
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
