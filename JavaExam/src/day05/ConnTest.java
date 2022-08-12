package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnTest {
	public static void main(String[] args) throws Exception {
		// 클래스를 객체화 한다.
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";

		/* 왼쪽은 자바에서 제공하는 인터페이스, 오른쪽은 mysql객체 생성이다. 왜 ? url 에 mysql이 들어감. */
		Connection conn = DriverManager.getConnection(url, user, password);

		/* statement 대신 perparedStatement사용할것 ! */
		if (conn != null) {
			System.out.println("접속 성공");
		} else {
			System.out.println("접속 실패");
		}
		// 2.쿼리 작성
		String sql = "insert into member values(?,?,?,?,default)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "carami");
		ps.setString(2, "홍길동");
		ps.setString(3, "skupw");
		ps.setString(4, "sku@sku.ac.kr");

		// 3. 쿼리 실행
		int resultCount = ps.executeUpdate();

		// 4.쿼리 결과 확인 !
		if (resultCount > 0) {
			System.out.println(resultCount + "건의 쿼리 실행 완료.");
		} else {
			System.out.println("쿼리 실행 에러");
		}
		
		// 5.접속 종료!!(반드시 할것.) 데몬스레드 방지
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
	}
}
