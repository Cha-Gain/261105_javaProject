package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) = 함수(function)
		// 메인 메서드는 실행을 담당 (콘솔 실행)
		
		/* java 
		 * package => class => method 
		 * 
		 * main : 실행을 담당
		 * println() : 괄호 안의 값을 콘솔 출력 (줄바꿈 포함)
		 * print() : 괄호 안의 값을 콘솔 출력 (줄바꿈 X)
		 * 
		 * 마지막 끝처리 ;
		 * 
		 * 문자 : String 클래스를 사용
		 * 
		 * */
		
		// println()
		System.out.println(123*45);
		
		/* 숫자 : +, - (부호), 사칙연산
		 * 문자열 : "문자는 모두 큰 따옴표로 묶음"
		 * 한글자의 문자 : 'a' => char : 유니코드, 아스키 문자표에 따른 문자 한글자만
		 * 
		 * 클래스는 대문자로 시작
		 * 변수와 메서드는 소문자
		 */
		System.out.println("HelloWorld");
		System.out.println('a');
		
		int number = 10;
		System.out.println(number);
		
		number = 20;
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		
		// -------------------------------------------------------
		
		byte b = 30;
		short s = 100;
		long l = 100; // 접미사 l/L l은 1이랑 헷갈려서 주로 L (필수x)
		float f = 1.1f; // 접미사 f/F (필수)
		double d = 1.1;
		char ch = 'a';

	}

}
