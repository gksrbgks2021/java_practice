package day05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	/* 입력 리턴값 bool , resultset, int 로 한번 생각해 볼것 */
	public boolean addMember(MemberDTO member) {
		boolean resultFlag = false;
		// 1.선언
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			// 3. 접속
			conn = DBUtil.getConnection();
			// 4. 쿼리작성 -- PreparedStatement
			String sql = "insert into member values(?,?,?,?,default)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());

			// 5. 쿼리 실행
			int count = ps.executeUpdate();

			if (count == 1)
				resultFlag = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 2.닫아라!!
			DBUtil.close(conn, ps);
		}
		return resultFlag;
	}

	// 수정
	public void update(MemberDTO member) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update set name=?, password=?, email=?,join_date=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getJoinDate());
			ps.setString(5, member.getId());

			/* excute query */
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			DBUtil.close(conn, ps);
		}
	}

	// 삭제
	public void remove(MemberDTO member) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "delete from member m where m.id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());

			/* excute query */
			if (ps.execute()) {
				System.out.println("실행 완료.");
			} else {
				System.out.println("error 쿼리");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			DBUtil.close(conn, ps);
		}
	}

	// 조회(id 로 조회)
	public MemberDTO getMembers(String id) {
		MemberDTO member = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select id,name,password,email,join_date from member where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, member.getId());

			/* excute query */
			rs = ps.executeQuery();
			
			if (rs.next()) {
				System.out.println("존재합니다.");
				member = new MemberDTO();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
				member.setJoinDate(rs.getString(5));
			} else {
				System.out.println("error 쿼리");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			DBUtil.close(conn, ps);
		}
		return member;
	}
	// 전체 조회
	public List<MemberDTO> getMembers() {
		List<MemberDTO> memberList = new ArrayList();
		// 1. 선언!! -- 접속(Connection), 쿼리작성(PreparedStatement),결과(ResultSet)
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 3. 접속
			conn = DBUtil.getConnection();
			// 4. 쿼리작성
			String sql = "select id,name,password,email,join_date from member";
			ps = conn.prepareStatement(sql);
			// 5. 쿼리실행
			rs = ps.executeQuery();
			// 6. 결과값 얻어오기!!
			while (rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setId(rs.getString(1));
				member.setName(rs.getString(2));
				member.setPassword(rs.getString(3));
				member.setEmail(rs.getString(4));
				member.setJoinDate(rs.getString(5));

				memberList.add(member);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 2. 선언한 자원들을 닫아준다!!!
			DBUtil.close(conn, ps, rs);
		}
		return memberList;
	}
}
