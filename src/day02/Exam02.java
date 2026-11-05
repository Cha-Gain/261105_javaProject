package day02;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력
		// 2 3 + => 2 + 3 = 5
		// 2 3 - => 2 - 3 = -1
		// 입력 가능한 연산자는 + = * / %
		// 이 외의 문자열을 입력하면 잘못되었다라고 출력
		// 연산자 입력 => String(equals) char
		// switch
		// 스트링 내용이 일치하는지는 이퀄스 주소가 같은지 확인할때는 ==
		
		// if시
		"+".equals("+");
		String s = "-";
		s.equals("-");
		
		//System.out.println(s.equals("-"));
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("정수 두개를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요");
		String text = scan.next();
		
		switch(text) {
		case "+": 
			System.out.println(num1 + num2);
			break;
		case "-": 
			System.out.println(num1 - num2);
			break;
		case "*": 
			System.out.println(num1 * num2);
			break;
		case "/": 
			System.out.println(num1 / num2);
			break;
		case "%": 
			System.out.println(num1 % num2);
			break;
			default: 
				System.out.println("다시시도해주세요");
		}
		*/
		
		/*
		 * if(text.equals("+")) {
			System.out.println(num1 + num2);
		} else if(text.equals("-")) {
			System.out.println(num1 - num2);
		} else if(text.equals("*")) {
			System.out.println(num1 * num2);
		} else if(text.equals("/")) {
			System.out.println(num1 / num2);
		} else if(text.equals("%")) {
			System.out.println(num1 % num2);
		} else {
			System.out.println("연산자 잘못입력");
		}
		*/
		
		/*
		Random random = new Random();
		
		int a = random.nextInt(10)+1; // 0으로는 나눌 수 없음 나머지도 마찬가지
		int b = random.nextInt(10)+1;
		
		System.out.println("정수" + a + "와" + b);
		System.out.println("연산자를 입력해주세요");
		String text2 = scan.next();
		
		if(text2.equals("%")) {
			System.out.println(a % b);
		} 
		*/
		
		System.out.println("두 정수를 띄어쓰기 하여 입력"); // 띄어쓰기 하면 각각 하나의 숫자
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		// 연산자 String
		 String op = scan.next(); // "+"
		
		switch(op) {
		case "+":
			System.out.println(n1 + op + n2 + "=" + (n1+n2));
			break;
		case "-":
			System.out.println(n1 + op + n2 + "=" + (n1-n2));
			break;
		case "*":
			System.out.println(n1 + op + n2 + "=" + (n1*n2));
			break;
		case "/":
			if(n2 == 0) {
				System.out.println("0 으로는 나눌 수 없습니다");
			} else {
				System.out.println(n1 + op + n2 + "=" + (n1/n2));
			}
			break;
		case "%":
			System.out.println(n1 + op + n2 + "=" + (n1%n2));
			break;
			default: 
				System.out.println("잘못된 연산자입니다");
		}
		
		int result = 0;
		switch(op) {
		case "+":
			result = n1+n2;
			break;
		case "-":
			result = n1-n2;
			break;
		case "*":
			result = n1*n2;
			break;
		case "/":
			result = n1/n2;
			break;
		case "%":
			result = n1%n2;
			break;
			default:
		}
		
		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))
		System.out.println(n1 + op + n2 + "=" + result);
		
		// char 형태
		char opChar = scan.next().charAt(0); // "+"	
		
		switch(opChar) {
		case '+':
			System.out.println();
			break;
		}
		
		scan.close();


	}

}
