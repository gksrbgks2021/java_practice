package day03;

public class Math {
	String name;
	int speed;
	static int numberOfCars;

	static int abs(int a) {
		/*static ���� this�� �ν��Ͻ� �̱� ������ ������. */
		return a > 0 ? a : a*(-1);
	}
	
	static int max(int a, int b) {
		return a > b ? a : b ;
	}
	public static void main() {
		System.out.println(numberOfCars);
	}
}
