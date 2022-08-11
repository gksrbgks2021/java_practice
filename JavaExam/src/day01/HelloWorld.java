package day01;

public class HelloWorld {
	//Java HelloWorld test 123 carami
	public static void main(String args[]) {
		
		System.out.println("Hi");
		//자바 예약어란? --> 이클립스 자주색. | 식별자란 ? --> 명령규칙.
		//main문은 누가 호출 ? JVM이 실행 
		//JVM이 예약어를 실행한다. javac 컴파일, 인터프리팅 (한줄한줄 실행 ) 
		//접근 지정자 4가지. 
		//public private protected (package) 같은 패키지에서 사용가능하다 
		/*객체 지향에 대한 이해가 필요하다. 
		 * system.out 표준 출력 추상화 , 콘솔 가리킴 
		 * 자바는 생성자 뺴고 리턴 타입 있어야 한다 .  
		 * 장치 추상화 system | 출력 추상화 in 
		 * 첫글자를 대문자로 카넬 표기법. 스네이크 표기법 대문자 대신 언더바 사용 
		 * */
		System.out.println(args[0]);
	}
}
