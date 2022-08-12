package day03_lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*public class LottoBall {
private ArrayList<Integer> number_list;
private int plus_number;
LottoBall(){
	number_list = new ArrayList<>();
}
}
*/

public class LottoMachine extends LottoBall {
	private ArrayList<Integer> number_list; // 6개 번호
	private Random rand; // 랜덤
	private Set<Integer> memo; // 번호 중복 방지

	/* 로또 프로그램- 로또머신, 사용자, 로또볼 */
	LottoMachine() {
		super();
		rand = new Random();
		memo = new HashSet<Integer>();
	}

	/* 총 6개의 번호를 뽑는다. */
	public void pick() {
		int i = 0;
		int num;
		while (i < 6) {
			num = rand.nextInt(45) + 1;
			/* 중복 방지 */
			if (!memo.contains(num)) {
				memo.add(num);
				this.add_number(num);
				i++;
			}
		}
		/* set this member value */
		this.number_list = this.getNumber_list();

	}

	public void initmachine() {
		memo.clear();
	}

	/* 얼마나 일치하는지 확인한다. */
	public int check(ArrayList<Integer> person_list) {
		int i = 0;
		for (int x : person_list) {
			if (memo.contains(x))
				i++;
		}
		
		return i;
	}
	public void show() {
		System.out.println("\n로또머신 입력.. ");
		number_list.forEach(x-> System.out.print(x+ " "));
	}
}
