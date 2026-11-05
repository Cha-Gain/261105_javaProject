package day01;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		
		/* 대입연산자 : = 오른쪽에 있는 리터럴 값을 왼쪽의 변수에 저장
		 * a = b;
		 * b 변수의 값을 a 변수로 덮어쓰기 (대입, 저장)
		 * 왼쪽은 반드시 변수여야함
		 *  
		 *
		 *  */
		int a = 10;
		int b = 20;
		a = b + 10;
		System.out.println(a);
		
		// 문자 연결 : +
		System.out.println("a = " +a); //연산의 결과는 String
		
		//산술연산자 : + - * / %
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(4*3);
		System.out.println(4.0/3);
		System.out.println(4%3);
		
		/* 나누기
		 * 정수 / 정수 = 정수(소수점 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 정수
		 *  */
		// 자료형 변환 casting
		System.out.println((double)a/b);
		
		// ==, !=, >, <, >=, <=
		// 비교연산의 결과는 항상 true / false 
		System.out.println(a>b);
		System.out.println(a==b); 
	
		// 논리연산자 !, &&, ||
		System.out.println(!(a==b));
		System.out.println((1<3) && (3>4)); // 모든 조건이 참이어야 함
		System.out.println((1<3) || (3>4)); // 둘 중 하나만 참이어도 됨
		
		//삼항연산자
		// 조건식 ? true : false
		System.out.println(a==b ? "a와 b가 같습니다" : "a 와 b는 다릅니다");
		
		//증감연산자 : ++, -- (1씩증감)
		System.out.println(a);
		a++;
		System.out.println(a);
		a--;
		System.out.println(a++); // 출력 후 1 증가
		
		// 복합연산자 : +=, -=
		a += 2;
		System.out.println(a);
		
		
	}

}
