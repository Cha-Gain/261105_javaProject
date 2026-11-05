package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 그 랜덤수를 맞추는 게임
		/*
		 * 출력예시)
		 * 컴퓨터가 랜덤수를 생성했습니다.
		 * 입력 > 30 ==> UP
		 * 입력 > 40 ==> DOWN
		 * 입력 > 38 ==> 정답!! => 종료
		 * 
		 * 랜덤수 > 유저수 UP
		 * 랜덤수 < 유저수 DOWM
		 * 랜덤수 == 유저수 정답!!
		 * 
		 * 몇회만에 맞췄는지
		 * 
		 */
		
		/* Scanner scan = new Scanner(System.in);
		
		int ran = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		//System.out.println(ran);
		
		int user = 0;
		int count = 0;
		do {
			user = scan.nextInt();
			if(user > ran) {
				System.out.println("DOWN");
			} 
			if (user < ran) {
				System.out.println("UP");
			}
			count++;
		} while(user != ran);
		
		System.out.println("정답입니다!");
		System.out.println(count + "회 시도만에 맞췄습니다");

		scan.close(); */
		
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*50) + 1;
		//System.out.println(random);
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		
		// 필요한 변수 선언
		int userNum = 0;
		int count = 0;
		
		while(true) {
			System.out.println("입력 >");
			userNum = scan.nextInt(); // user입력
			count++;
			
			if(random > userNum) {
				System.out.println("UP!!");
			} else if (random < userNum) {
				System.out.println("DOWN!!");
			} else {
				System.out.println("정답!!! (" + count + "회) ");
				break;
			}
		}
		
		scan.close();
	}

}
