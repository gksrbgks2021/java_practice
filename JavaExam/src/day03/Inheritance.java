package day03;

public class Inheritance {

	public static void main(String[] args) {
		Parents p = new Parents();
		System.out.println(p.age);// 40
		System.out.println(p.getAge());// 40

		Child c = new Child();
		System.out.println(c.age);// 20
		System.out.println(c.getAge());// 20

		/* pc�� �޸𸮿� ChildŸ������ �ö󰣴�. �ٵ� type casting ���ϸ� child�޼ҵ� ���Ұ� */
		/* �� �������̵� �� �޼ҵ�� �ڽİ��� ������. */
		Parents pc = new Child();
		System.out.println(pc.age);// 40
		System.out.println(pc.getAge());// 20

		/* Ÿ�� ĳ���� �ϱ����� Ÿ�� �˻縦 ���ش�. ��? �θ� Ŭ�������� � �ڽ��� ���� ���� */
		if (p instanceof Child)
			((Child) pc).print();

		/* �ʵ�� �������̵� �Ǹ� Ÿ���� ������. */

	}

}
