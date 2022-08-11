package day03_lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Person{
	ArrayList<Integer> list ;
	Person(){
		list = new ArrayList();
	}
	
	public void pick()  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val ;
		for(int i = 0; i< 7; i++) {
			 Integer.parseInt( br.readLine() );
		}
		
	}
}
