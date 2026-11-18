package day05;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열생성 
		// 5명의 점수를 입력받기 (0~100)
		// 합계와 평균을 출력
		// 입력값의 범위가 0보다 작거나 100보다 크면 다시 입력받기
		
		Scanner scan = new Scanner(System.in);
		
		/* int arr[] = new int[5];
		int total = 0;
		
		System.out.println("5명의 점수를 입력하세요");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
			while(arr[i] < 0 || arr[i] > 100) {
				System.out.println("숫자를 다시 입력하세요");
				arr[i] = scan.nextInt();
			}
			
			total += arr[i];
		}
		
		System.out.println("총합계 : " + total);
		System.out.println("평균 : " + (double)(total / arr.length)); */
		
		int arr[] = new int[5];
		int total = 0;
		
		System.out.println("5명의 점수를 입력하세요");
		
		for(int i=0; i<arr.length; i++) {
			int score = scan.nextInt();
			
			//if는 조건을 한번만 확인
			while(score < 0 || score > 100) {
				System.out.println("숫자를 다시 입력하세요");
				score = scan.nextInt();
			}
			System.out.println("점수입력완료");
			arr[i] = score;
			total += score;
		}
		
		System.out.println("총합계 : " + total);
		System.out.println("평균 : " + (double)(total / arr.length));

		scan.close();

	}

}
