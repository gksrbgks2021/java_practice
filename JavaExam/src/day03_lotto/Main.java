package day03_lotto;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		m.menu();
	}

	public void menu() {
		boolean flag = true;
		Person person = new Person();
		LottoMachine machine = new LottoMachine();
		
		while (flag) {
			System.out.println("===============");
			System.out.println("lotto 프로그램\n7 개의 [1..45] 정수를 입력하세요...\n종료하려면 z입력할것.");
			System.out.println("===============");
			/*사용자 번호 입력*/
			try {
				person.pick();
			} catch (IOException e) {//입력오류
				e.printStackTrace();
			} catch(InputZ z) { //종료
				flag = false;
			}
			/*로또 번호 생성*/
			machine.initmachine();
			machine.pick();
			
			person.show();
			machine.show();
			System.out.printf("총 %d 개 숫자가 일치합니다. ", machine.check(person.getList()));
			
		}
		
	}
}