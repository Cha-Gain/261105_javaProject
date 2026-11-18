package day07;

public class Method02 {
	/* 메서드 => 기능을 정의하는 역할 (함수)
	 * 접근제어자 리턴타입 메서드명(매개변수) {
	 * 	구현;
	 *  (return);
	 * }
	 * - 리턴타입 : 기능을 구현 후 결과로 반환하는 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명 : 의미있게 소문자로 작성
	 */
	
	// 메서드 생성 영역
	// + - * / % 
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	
	// +
	// 매개변수 : int a, int b
	// 메서드명 : sum
	// 리턴타입 : int
	public int sum(int a, int b) {
		return a + b;
	}
	
	// -
	// 매개변수 : int a, int b
	// 메서드명 : sub
	// 리턴타입 : int
	public int sub(int a, int b) {
		return a - b;
	}
	
	// *
	// 매개변수 : int a, int b
	// 메서드명 : multi
	// 리턴타입 : int
	public int multi(int a, int b) {
		return a * b;
	}
	
	// /
	// 매개변수 : int a, int b
	// 메서드명 : div
	// 리턴타입 : double
	public double div(int a, int b) {
		if(b == 0) {
			return -99999;
		}	
		return a / b;
	}
	
	// %
	// 매개변수 : int a, int b
	// 메서드명 : mod
	// 리턴타입 : int 
	public int mod(int a, int b) {
		if(b == 0) {
			return -99999;
		}	
		return a % b;
	}

	public static void main(String[] args) {
		// 메서드 호출 영역
		Method02 m = new Method02();
		int num1 = 100;
		int num2 = 0;
		
		int sum = m.sub(num1, num2);
		System.out.println(sum);
		
		int sub = m.sub(num1, num2);
		System.out.println(sub);
		
		int multi = m.multi(num1, num2);
		System.out.println(multi);
		
		double div = m.div(num1, num2);
		if(div == -99999) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
			System.out.println(div);
		}
		
		int mod = m.mod(num1, num2);
		if (mod == -99999) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
			System.out.println(mod);
		}
		
	}

}
