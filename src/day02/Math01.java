package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math는 원래 존재하는 클래스
		// Java는 주로 개발자가 보기 때문에 소숫점을 잘 안지움 html에서 반올림 등
		// Math 클래스 : 수학과 관련된 기능을 제공하는 클래스
		// Math.round(값) : 정수로 반올림 => 소수자리수 0
		// Math.floor(값) : 버림 => 소수자리수 0
		// Math.ceil(값) : 올림 => 소수자리수 0
		// Math.random() : 0~1사이의 아무 수 => double
		
		double number = 3.14159;
		
		long pi = Math.round(number); // return long
		System.out.println(pi);
		
		// 실수의 기본자료형 = double 정수의 기본 자료형 = int
		int r = (int)Math.round(number);
		
		// floor
		int floorNum = (int)Math.floor(number);  // return double;
		
		int ceilNum = (int)Math.ceil(number); // return double;
		
		// Math.random() => return double
		double ran = Math.random()*10;
		System.out.println(ran);
	
		// 0 ~ 9 한자리를 랜덤 선택
		int random = (int)(Math.random()*10);
		System.out.println(random);
		
		// 1 ~ 10 까지의 랜덤 선택
		System.out.println(random);
		
		// (int)(Math.random()*count)+start;
		// 주사위 값 (1~6)
		// (int)(Math.random()*6)+1
		System.out.println("주사위 랜덤------------");
		System.out.println((int)(Math.random()*6)+1);
		
		// 로또 (1~45)
		// (int)(Math.random()*45)+1
		System.out.println("로또 랜덤-----------");
		System.out.println((int)(Math.random()*45)+1);
		
		// Random() 클래스 new 키워드
		Random random1 = new Random();
		// int 자료형으로 랜덤 값을 리턴(0~9)
		// random.nextInt(count)+start
		System.out.println(random1.nextInt(10)+1); // int 자료형으로 랜덤 값을 리턴
		
		// Math.max(값1, 값2)  Math.min(값1, 값2)
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(3, 20));
	}

}
