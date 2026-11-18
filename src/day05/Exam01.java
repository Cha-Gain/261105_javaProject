package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * -- menu --
		 * 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료
		 * menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * menu > 2
		 * 라면 1개를 선택했습니다. 3000원
		 *  * menu > 1
		 * 과자 1개를 선택했습니다. 2000원
		 * ....
		 * menu > 5
		 * 과자2개 4000원
		 * 라면1개 3000원
		 * ----------------------
		 * 총금액 7000원
		 * 
		 * 종료를 누를때까지 반복
		 * 1~5를 벗어난 메뉴는 다시 입력
		 * 각 배열의 같은 번지는 같은 값
		 */
		Scanner scan = new Scanner(System.in);
		
		String menu[] = {"과자", "라면", "사탕", "젤리"}; 
		int price[] = {2000, 3000, 500, 500};
		int count[] = new int[menu.length];
		int sum = 0;
		int s = 0;
		
		//System.out.println(menu[0] + "(" + (price[0]) + "원)");
		
		do { 
			System.out.println("--menu--");
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료");
			System.out.println("menu >>");
			s = scan.nextInt();
			
			if(s < 1 || s > 5) {
				System.out.println("메뉴를 잘못선택했습니다 다시 선택해주세요");
			} else if(s == 5) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println(menu[s-1] + "1개 선택" + price[s-1] + "원");
				sum += price[s-1];
				count[s-1]++;
			}
			
		} while(s != 5);
		
		for(int i=0; i<count.length; i++) {
			if(count[i] != 0) {
				System.out.println(menu[i] + "(" + price[i] + "원)" + "*" + count[i] + "=" + count[i]*price[i]);
			}
		}
		System.out.println("총금액         : " + sum);
		
		scan.close();
		
		
		//순번없는 반복은 while
		//순번있는 반복은 for을 주로 사용함
		

	}

}
