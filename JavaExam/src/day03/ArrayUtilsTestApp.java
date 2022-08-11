package day03;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayUtilsTestApp {
	public static void main(String[] args) {
		ArrayUtils t = new ArrayUtils();

		int[] int_arr1 = {1,2,3,4,5};
		int[] int_arr2 = {8,9,10};
		double[] double_arr1 = {1.0,2.4,5.9};
		
		int[] new_int_arr1  = t.doubleToInt(double_arr1);
		double[] new_double_arr1 = t.intToDouble(int_arr1);
		
		System.out.println("new_double_arr1");
		DoubleStream
		.of(new_double_arr1)
		.forEach(i-> System.out.print(i+" "));
		
		System.out.println("\n new_int_arr1");
		IntStream
		.of(new_int_arr1)
		.forEach(i -> System.out.print(i+" "));
		
		System.out.println("\n concat");
		IntStream
		.of(t.concat(int_arr1, int_arr2))
		.forEach(i -> System.out.print(i+" "));
	}
}

