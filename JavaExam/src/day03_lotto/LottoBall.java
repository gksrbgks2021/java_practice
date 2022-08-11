package day03_lotto;

import java.util.ArrayList;
import java.util.Collection;

public class LottoBall {
	private ArrayList<Integer> number_list;
	private int plus_number;

	LottoBall(){
		number_list = new ArrayList<>();
	}

	public ArrayList<Integer> getNumber_list() {
		return number_list;
	}

	public void setNumber_list(ArrayList<Integer> number_list) {
		this.number_list = number_list;
	}

	public int getPlus_number() {
		return plus_number;
	}

	public void setPlus_number(int plus_number) {
		this.plus_number = plus_number;
	}
	//로또번호 뽑기 
	public void add_number(int a) {
		this.number_list.add(a);
	}
	public void initball() {
		number_list.removeAll(number_list);
	}
}
