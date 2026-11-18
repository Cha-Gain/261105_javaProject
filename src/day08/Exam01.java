package day08;

import java.util.Arrays;

public class Exam01 {
	
	// 1. 랜덤수를 리턴하는 메서드 (1~45)
	// 매개변수 : X
	// 리턴타입 : 정수 int
	public int makeRandom() {
		int num = (int)(Math.random()*46+1);
		return num;
	}
	
	// 2. 중복확인 메서드 : 배열에 정수가 있는지 확인
	// 매개변수 (배열, 정수)
	// 리턴타입 : boolean
	public boolean numCheck(int[] arr, int a) {
		boolean check = false;
		for (int i=0; i < arr.length; i++) {
			if (arr[i] == a) {
				check = true;
			}
		}
		return check;
	}
	
	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 중복X(2번메서드호출) 채워주는 메서드
	// 매개변수 : int[] arr
	// 리턴타입 : X void
	public void numStuff(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int r = makeRandom();
			if(!numCheck(arr, r)) {
				arr[i] = r;
			} else {
				i--;
			}
		}
	}

	// 4. 배열을 출력하는 메서드
	// - 사용자 번호 1 2 3 4 5 6
	// - 당첨 번호 1 2 3 4 5 6 [7]
	// 매개변수 : int[] arr
	// 리턴타입 : 없음 void
	public void printArr(int[] arr) {

		for(int i=0; i<6; i++) {
			System.out.print(arr[i] + " ");
		}
		if(arr.length==7) {
			System.out.print("["+arr[arr.length-1]+"]");
		}
		System.out.println();
	}
	
	// 5. 당첨 확인하는 메서드 (바로 출력 됨)
	// - 사용자번호, 당첨번호를 받아서 등수를 리턴하는 메서드
	/* - 6개 일치하면 = 1등 (순서는 상관없음, 보너스 제외)
	 * - 5개 일치 + 보너스 번호 = 2등
	 * - 5개 일치 = 3등
	 * - 4개 일치 = 4등
	 * - 3개 일치 = 5등
	 * - 나머지는 꽝
	 */
	// 매개변수 : int[] arr
	// 리턴타입 : int num
	public int rank(int[] user, int[] lotto) {
		int count = 0;
		for(int i=0; i<user.length; i++) {
			if(numCheck(user, lotto[i])) {
				count++;
			}
		}
		
		switch(count) {
		case 6: return 1;
		case 5:
			if(numCheck(user, lotto[lotto.length-1])) {
				return 2;
				
			} else {
				return 3;
			}
		case 4: return 4;
		case 3: return 5;
		default: return -999;
		}
	}

	public static void main(String[] args) {
		// 로또 만들기
		/* - 사용자 번호 (6자리)
		 * - 당첨 번호 (7자리)
		 * 
		 *  */
		int user[] = new int[6];
		int lotto[] = new int[7];
		
		Exam01 m = new Exam01();
		
		m.numStuff(user);
		
		m.printArr(user);
		
		m.numStuff(lotto);
		
		m.printArr(lotto);
		
		int number = m.rank(user, lotto);
		
		if(number <=0) {
			System.out.println("꽝 입니다");
		} else {
			System.out.println(number + "등입니다");
		}
		
	}

}
