package day03_lotto;

import java.util.ArrayList;
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
	private ArrayList<Integer> number_list; //6개 번호 
	private int plus_number; //추가 번호
	private Random rand ; //랜덤
	private Set<Integer> memo; //번호 중복 방지 
	
	/*로또 프로그램- 로또머신, 사용자, 로또볼*/
	LottoMachine(){
		super();
		rand = new Random();
	}
	
	/*총 7개의 번호를 뽑는다.*/
	public void pick() {
		int i = 0 ;
		int num;
		while(i <7) {
			num = rand.nextInt(45)+1;
			if(!memo.contains(num)) {
				memo.add(num);
				if(i < 6) {
					this.add_number(num);
				}else if(i == 6) {
					this.setPlus_number(num);
				}
				i++;
			}
		}
		/*set this member value*/
		this.number_list = this.getNumber_list();
		this.plus_number = this.getPlus_number();
		
	}
	public void initmachine() {
		memo.clear();
	}
	
	/*얼마나 일치하는지 확인한다.*/
	public void check(ArrayList<Integer> person_list) {
		int i = 0 ;
		for(int x : person_list) {
			if(memo.contains(x))
				i++;
		}
		System.out.printf("총 %d 개 숫자가 일치합니다. ",i);
	}
}

