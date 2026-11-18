package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* 가위 바위 보
		 * 컴퓨터와 유저가 가위 바위 보 게임을 진행
		 * 컴퓨터는 랜덤으로 지정 0 1 2 중 선택
		 * 가위 = 0, 바위 = 1, 보 = 2;
		 * 
		 * 유저 input 0 1 2 중 선택
		 * 
		 * ex) com = 0 / me = 0;
		 * com(가위) / me(가위) => 무승부
		 * com = 0 / me = 1
		 * com(가위) / me(바위) => me 승리
		 * 
		 * 유저의 입력값중 0 1 2 외의 다른 값이 입력되면 입력오류 => 다시 입력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String[] choice = {"가위", "바위", "보"};
		System.out.println("가위바위보 시작~!!");
		
		while(true) {
			
			int comNum = (int)(Math.random()*3); // 0~2까지 3개
			
			//System.out.println(comNum +" / "+ choice[comNum]);
			
			System.out.println("가위(0), 바위(1), 보(2), 종료(3) 중 선택 > ");
			
			int myNum = scan.nextInt();
			//System.out.println(myNum +" / "+ choice[myNum]);
			
			if(myNum == 3) {
				System.out.println("종료합니다.");
				break;
			}
			// 입력 오류 조건
			if(myNum <0 || myNum > 2) {
				System.out.println("입력오류입니다. 다시 선택해주세요.");
				//myNum = scan.nextInt();
				continue;
			}
			
			System.out.print("com:"+choice[comNum] + " / user:"+choice[myNum]+" => ");
			if(comNum == myNum) {
				System.out.println("무승부!!");
			}else {
				//System.out.print("com:"+choice[comNum] + " / user:"+choice[myNum]+" => ");
				if(myNum == 0) {
					// 가위  보(2)  유저승
					System.out.println(comNum == 2 ? "유저 승": "유저 패");
					
				}else if(myNum == 1) {
					// 바위 가위(0) 유저승
					System.out.println(comNum == 0 ? "유저 승": "유저 패");
				}else {
					// myNum == 2 바위(1) 유저승
					System.out.println(comNum == 1 ? "유저 승": "유저 패");
				}
			}
		}
		
		
		/* System.out.println("숫자를 입력해 주세요 0(가위) 1(바위) 2(보) 3(종료하기)");

		while(true) {
			int com = (int)(Math.random()*3);
			System.out.println(com);
			int me = scan.nextInt();
			
			if(me < 0 || me > 3) {
				System.out.println("다시입력하세요");
			} else if (me == 3) {
				System.out.println("종료합니다");
				break;
			} else {
				if ((com == 0 && me == 0) || (com == 1 && me == 1) || (com == 2 && me == 2)) {
					if (com == 0 && me == 0) {
						System.out.println("com(가위) / me(가위) => 무승부");
					} else if (com == 1 && me == 1) {
						System.out.println("com(바위) / me(바위) => 무승부");
					} else {
						System.out.println("com(보) / me(보) => 무승부");
					}
					
				} else {
					if(me == 0) {
						System.out.println(com == 2 ? "com(보) / me(가위) => 승" : "com(바위) / me(가위) => 패");
					}else if(me==1) {
						System.out.println(com == 0 ? "com(가위) / me(바위) => 승" : "com(보) / me(바위) => 패");
					}else if(me==2) {
						System.out.println(com == 1 ? "com(바위) / me(보) => 승" : "com(가위) / me(보) => 패");
					}
				}
				
				
			}
		} */
		
		
		scan.close();

	}

}
