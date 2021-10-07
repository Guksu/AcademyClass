package org.min.ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.min.db.DBConnect;

public class Ex04_Select {
	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		
		// select의 결과는 ResultSet이다.
		ResultSet rs = null;
		
		try {
			
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			String sql = "select * from person";
			
			// select 는 excuteQuery()를 사용한다.
			
			rs = st.executeQuery(sql);
			// rs에 저장된 데이터 출력
			// 1. row 단위로 데이터를 읽어들인다.
			// 2. 남아있는 row의 확인 next() 메소드 이용( true : 남아있다)
			// 3. row는 column의 집합이므로 각 column별로 분리하기 위한 getter가 존재한다.
			// name varchar2(10) : rs.getString(1) 또는 rs.getString("name") // 컬럼 인덱스는 1 부터 시작
			// age number : rs.getInt(2) 또는 rs.getInt("age")
			// region varchar2(20) : rs.getString(3) 또는 rs. getString("region")
			
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
				if(st!=null) {st.close();}
				if(conn!=null) {conn.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
			
		
		
		
	}
}
