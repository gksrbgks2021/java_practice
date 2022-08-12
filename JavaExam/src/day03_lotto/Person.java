package day03_lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Person {
	private ArrayList<Integer> list;

	Person() {
		list = new ArrayList();
	}

	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	public void pick() throws IOException, InputZ {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val;

		System.out.println("init person_list ");
		list.removeAll(list);

		for (int i = 0; i < 6; i++) {
			String str = br.readLine();
			/* 예외 처리 */
			if (str.equals("z")) {
				throw new InputZ(); // 사용자 강제로 예외 발생
			}
			
			while(str.equals("\n")) {
				str = br.readLine();
			}
			val = Integer.parseInt(str);

			while (val < 1 || val > 45) {
				System.out.println("에러.. [1..45] 정수를 입력하시오...");
				val = Integer.parseInt(br.readLine());
			}
			/*리스트 추가*/
			list.add(val);
		}
	}
	public void show() {
		System.out.println("사용자 입력.. ");
		list.forEach(x-> System.out.print(x+ " "));
	}
}
