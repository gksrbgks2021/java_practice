package day03;

public class Inheritance {

	public static void main(String[] args) {
		Parents p = new Parents();
		System.out.println(p.age);// 40
		System.out.println(p.getAge());// 40

		Child c = new Child();
		System.out.println(c.age);// 20
		System.out.println(c.getAge());// 20

		/* pc는 메모리에 Child타입으로 올라간다. 근데 type casting 안하면 child메소드 사용불가 */
		/* 단 오버라이드 된 메소드는 자식것을 따른다. */
		Parents pc = new Child();
		System.out.println(pc.age);// 40
		System.out.println(pc.getAge());// 20

		/* 타입 캐스팅 하기위해 타입 검사를 해준다. 왜? 부모 클래스에는 어떤 자식이 올지 몰라서 */
		if (p instanceof Child)
			((Child) pc).print();

		/* 필드는 오버라이드 되면 타입을 따른다. */

	}

}
