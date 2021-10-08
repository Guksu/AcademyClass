package org.min.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.min.db.DBconnect;

public class Ex01_create {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		
		
		try {
			conn = DBconnect.getConnection();
			
			String sql = "create table member(" + 
					"no NUMBER PRIMARY key, id VARCHAR2(20) UNIQUE NOT NULL," + 
					"pw VARCHAR2(20) NOT NULL, email VARCHAR2(40)UNIQUE," + 
					"point NUMBER DEFAULT 1000 CHECK(point BETWEEN 0 and 10000) NOT NULL," + 
					"grade VARCHAR2(10) CHECK(grade in('vip','gold'))," + 
					"regdate DATE DEFAULT SYSDATE NOT NULL)";
			
			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();  // 테이블 생성 후 시퀀스 입력을 위해 닫아준다.
			
			sql = "CREATE SEQUENCE member_seq START WITH 1 INCREMENT BY 1";
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
