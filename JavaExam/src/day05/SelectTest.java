package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
	public static void main(String[] args) throws Exception{
		//1. 선언! 접속, 쿼리, 결과값 (resultset) 객체 받고 종료.
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		 
		try {
			conn = DBUtil.getConnection();
			//4.쿼리 작성
			String sql = "select * from member";
			ps = conn.prepareStatement(sql);
			//5.쿼리 실행
			rs = ps.executeQuery();
			//6.결과값 얻어오기 !
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//2. 선언한 자원들을 닫아준다.
			DBUtil.close(conn, ps,rs);
	}
	}
}

