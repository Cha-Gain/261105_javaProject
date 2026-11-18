package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100까지의 숫자를 입력
		// 합계를 출력
		
		int arr[] = new int[5];
		int total = 0;
		
		for(int i=0; i<arr.length; i++) { // 원본 변경 가능
			arr[i] = (int)(Math.random()*101);
			System.out.println(arr[i]); // 비교 연산 O
			total += arr[i];
		}
		
		System.out.println(Arrays.toString(arr)); // 전체보기 비교, 연산 X 스트링으로 처리
		System.out.println("합계 : " + total);
		
		System.out.println("--------------------");
		
		// 향상된 for문
		// for(출력할리스트의자료형 임의변수값 : 리스트) {}
		// 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 처리문 실행
		// 원본 자체를 변경 X
		
		total = 0;
		for(int tmp : arr) {
			System.out.println(tmp);
			if(tmp >= 60) {
				total += tmp;
			}
		}
		System.out.println(total);

	}

}
