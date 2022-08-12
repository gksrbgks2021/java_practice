package day05;

import java.util.List;

public class MemberDAOTest {
	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> memberList = dao.getMembers();
		member.setId("yas");
		member.setPassword("1111");
		member.setName("최경준");
		member.setEmail("test1234@naver.com");
		
		
		System.out.println(memberList.size());

		for (MemberDTO memberDTO : memberList) {
			System.out.println(memberDTO);
		}
	}
}
