package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 
		 * -- menu --
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 
		 * menu > 1
		 * 두 수를 입력 > 2 3
		 * 결과 => 2 + 3 = 5
		 * 
		 * 종료를 누를때까지 반복
		 * 
		 * 두번째 값이 0인경우 / % 연산은 연산할수 없음. (0으로 나눌 수 없습니다.)
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/*int menu = 0;
		
		do {
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu > ");
			
			menu = scan.nextInt(); // 메뉴 입력받기
			
			if(menu == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			while(menu < 0 || menu > 6) {
				System.out.println("메뉴를 잘못선택했습니다 다시 선택해주세요");
				menu = scan.nextInt();
			}
			
			System.out.println("두 정수를 띄어쓰기 하여 입력"); 
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
				break;
			case 2:
				System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
				break;
			case 3:
				System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
				break;
			case 4:
				if(n2 == 0) {
					System.out.println("0 으로는 나눌 수 없습니다");
				} else {
					System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
				}
				break;
			case 5:
				if(n2 == 0) {
					System.out.println("0으로는 나머지 연산을 할 수 없습니다");
				} else {
					System.out.println(n1 + "%" + n2 + "=" + (n1%n2));
				}
				break;
			case 6:
				// 종료
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("메뉴를 잘못선택했습니다 다시 선택해주세요");
			}
		} while(menu != 6);*/
		
		int menu = 0;
		
		do {
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu > ");
			
			menu = scan.nextInt(); // 메뉴 입력받기
			
			if(menu == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if(menu < 1 || menu > 6) {
				System.out.println("메뉴를 잘못선택했습니다 다시 선택해주세요");
			} else {
				System.out.println("두 정수를 띄어쓰기 하여 입력"); 
				int n1 = scan.nextInt();
				int n2 = scan.nextInt();
				
				while(n2 == 0 && (menu == 4 || menu == 5)) {
					System.out.println("피연산자가 0입니다");
					System.out.println("피연산자를 다시입력해주세요");
					n2 = scan.nextInt();
				}
				
				switch(menu) {
				case 1:
					System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
					break;
				case 2:
					System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
					break;
				case 3:
					System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
					break;
				case 4:
					if(n2 == 0) {
						System.out.println("0 으로는 나눌 수 없습니다");
					} else {
						System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
					}
					break;
				case 5:
					if(n2 == 0) {
						System.out.println("0으로는 나머지 연산을 할 수 없습니다");
					} else {
						System.out.println(n1 + "%" + n2 + "=" + (n1%n2));
					}
					break;
				case 6:
					// 종료
					System.out.println("종료합니다.");
					break;
					default:
				}
			}

		} while(menu != 6);
		
		
		scan.close();
	

	}

}
