package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100까지 랜덤수를 배열에 저장 => 출력
		// 합계, 평균, 최대, 최소 출력
		
		int arr[] = new int[10];
		// 현시점의 arr 값은 다 0

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*101);
		}
		
		int total = 0;
		int max = 0; // 배열의 값 중 가장 큰 값을 찾기 arr[0]
		int min = 100; // 배열의 값 중 가장 작은 값을 찾기위한 초기값
		for(int tmp : arr) { //i++이 생략되어있음
			total += tmp;
//			if(max < tmp) {
//				max = tmp;
//			}
//			if(min > tmp) {
//				min = tmp;
//			}
			
			max = Math.max(tmp, max);
			min = Math.max(tmp, min);
		}
 		
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + (double)(total/arr.length));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		

	}

}
