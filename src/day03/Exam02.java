package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13), 청소년(19), 성인으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2027 => 9살 어린이 입니다. 입장료는 5000원 입니다
		// 2026 생년을 기준으로 2026 - 2017 => 나이
		// 생년의 유효한 값을 1900 ~ 2026 1900보다 작으면 유효하지않음 2026보다 크면 유효하지않음
		// 기준에 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시입력해주세요 (1900~2026)
				
		Scanner scan = new Scanner(System.in);

		/*System.out.println("생년월일을 입력하세요");
		
		while(true) {
			int year = scan.nextInt();
			int age = 2026 - year;
			
			if(year < 1900 || year > 2026) {
				System.out.println("생년이 유효하지 않습니다. 다시입력해주세요 (1900~2026)");
			} else {
				if(age <= 13) {
					System.out.println(age + "살 어린이 입니다. 입장료는 5000원 입니다");
				} else if (age <= 19) {
					System.out.println(age + "살 청소년 입니다. 입장료는 7000원 입니다");
				} else {
					System.out.println(age + "살 성인 입니다. 입장료는 10000원 입니다");
				}
				break;
			}
			
		}*/
		
		/* System.out.println("생년월일을 입력하세요");
		int year = scan.nextInt();
		//System.out.println(year);
		
		int today = 2026;
		
		while(year < 1900 || year > today) {
			System.out.println("유효하지 않은 연도입니다.");
			System.out.println("다시 입력해주세요");
			year = scan.nextInt();
		}
		
		int age = today - year;
		//System.out.println(age);
		
		if(age <= 13) {
			System.out.println(age + "세 어린이입니다. 입장료는 5000원 입니다");
		} else if (age <=19) {
			System.out.println(age + "세 청소년입니다. 입장료는 7000원 입니다");
		} else {
			System.out.println(age + "세 성인입니다. 입장료는 10000원 입니다");
		} */
		
		// 한 가족(5명)의 입장료
		// 반복적인 생년을 입력받고 싶음. => 종료 키워드 0
		// 반복이 종료되면 최종결제금액 출력

		int sum = 0;
		
		while(true) {
			System.out.println("차례대로 생년월일을 입력하세요 0 을 누르면 종료됩니다");
			int year = scan.nextInt();
			int today = 2026;
			
			while((year < 1900 || year > today) && year != 0) {
				System.out.println("유효하지 않은 연도입니다.");
				System.out.println("다시 입력해주세요");
				
				year = scan.nextInt();
			}
			
			if(year == 0) {
				break;
			}
			
			int age = today - year;
			
			if(age <= 13) {
				System.out.println(age + "세 어린이입니다. 입장료는 5000원 입니다");
				sum += 5000;
			} else if (age <=19) {
				System.out.println(age + "세 청소년입니다. 입장료는 7000원 입니다");
				sum += 7000;
			} else {
				System.out.println(age + "세 성인입니다. 입장료는 10000원 입니다");
				sum += 10000;
			} 
			
		}

		// 합산요금 출력
		System.out.println("총 요금은" + sum + "입니다");

		/*int age = today - year;
		//System.out.println(age);
		
		if(age <= 13) {
			System.out.println(age + "세 어린이입니다. 입장료는 5000원 입니다");
		} else if (age <=19) {
			System.out.println(age + "세 청소년입니다. 입장료는 7000원 입니다");
		} else {
			System.out.println(age + "세 성인입니다. 입장료는 10000원 입니다");
		} */
		
		
		scan.close();
		
	}

}
