package day03;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayUtils {
	// int 배열을 double 배열로 변환
	static double [] intToDouble( int[] source ) {
		return IntStream
				.of(source)
				.mapToDouble(i -> (double) i)
				.toArray();
	}
	// double 배열을 int 배열로 변환
	static int [] doubleToInt( double[] source ) {
		return DoubleStream
				.of(source)
				.mapToInt(d -> (int) d)
				.toArray();
	}
	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int [] concat( int[] s1, int[] s2 ) {
		return IntStream
				.concat( IntStream.of(s1), IntStream.of(s2))
				.toArray();
	}
}
