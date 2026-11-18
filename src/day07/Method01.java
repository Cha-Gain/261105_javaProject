package day07;

public class Method01 {

	// 메서드 작성 위치
	/* 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 매개변수 : int a, int b
	 * 메서드명 : sum
	 * 리턴타입 : int
	 * */
	public int sum(int a, int b) {
		return a + b;
	} // 처리한 값을 다른 곳에서 사용할 때
	
	/* 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수 : int a, int b
	 * 메서드명 : print
	 * 리턴타입 : void (없음)
	 * */
	
	public void print(int a, int b) {
		System.out.println(a+b);
	} // 처리하고 끝날 때
	
	// 매개변수가 없는 케이스 / return은 있는 케이스
	/* 매개변수 : 없음
	 * 메서드명 : sum3
	 * 리턴타입 : int
	 */
	public int sum3() {
		int a = 5;
		int b = 3;
		return a + b;
	}
	
	/* 매개변수가 없는 케이스 / return 없는 케이스
	 * 매개변수 : 없음
	 * 메서드명 : sum4 
	 * 리턴타입 : void (없음)
	 */
	public void sum4() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// 실행용 메인 메서드
		int num1 = 100;
		int num2 = 80;
		
		// 객체 생성 후 출력
		Method01 s = new Method01();
		int sum = s.sum(num1, num2);
		System.out.println(sum);
		
		s.print(num1, num2);
		int sum1 = s.sum3();
		System.out.println(sum1);
		
		s.sum4();
	}
	
	// 메서드 작성 위치

}
