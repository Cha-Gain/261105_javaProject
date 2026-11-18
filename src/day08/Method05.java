package day08;

import java.util.Arrays;

import day07.Exam01;

public class Method05 {
	// 1. 배열을 받아 출력하는 메서드 (다른 메서드 호출 가능)

//	  2. 배열을 받아 오름차순 정렬하는 메서드
//	  매개변수 : 정수 배열 int[] arr
//	  메서드명 : sort
//	  리턴타입 : 없음 void
	public void arraySort(int[] arr) {
		// Arrays.sort(arr);
		if(arr == null) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	// 3. 배열을 받아 최대값 리턴하는 메서드
	// 매개변수 : 정수 배열 int[] arr
	// 메서드명 : max
	// 리턴타입 : 정수 int
	public int arrayMax(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// 4. 배열을 받아 최소값을 리턴하는 메서드
	public int arrayMin(int[] arr) {
		if(arr == null) {
			return -999999;
		}
		int min = arr[0];
		for (int tmp : arr) {
			if(min > tmp) {
				min = tmp;
			}
		}
		return min;
	}
	
	public int arrayMin(int[] arr, int a) {
		return 1;
	}
	
	// 메서드는 같은 이름의 메서드 가능. => 메서드오버로딩
	// 오버로딩 조건
	// 매개변수가 달라야 함. (타입이 달라야 함, 개수가 달라야 함)

	public static void main(String[] args) {
		/* 메서드 생성
		 * 1. 배열을 받아 출력하는 메서드
		 * 2. 배열을 받아 오름차순 정렬하는 메서드
		 * 3. 배열을 받아서 합계, 평균, 최대, 최소 출력 메서드
		 * 	- 합계와 평균은 다른 메서드를 호출 day07-Exam01, Method04
		 * 	- 최대, 최소 (메서드 각각)
		 */
		int [] arr = {78,89,85};

		// 1. 배열을 받아 출력하는 메서드
		Method04 m4 = new Method04();
		m4.print(arr);
		
		// 2. 배열을 받아 오름차순 정렬하는 메서드
		Method05 m5 = new Method05();
		m5.arraySort(arr);
		m4.print(arr);
		//System.out.println(Arrays.toString(arr));
		
		// 최대값
		int max = m5.arrayMax(arr);
		int min = m5.arrayMin(arr);
		
		if(max == -999999) {
			System.out.println("배열 오류!!");
		}
		if(min == -999999) {
			System.out.println("배열 오류!!");
		}
		
		System.out.println(max);
		System.out.println(min);

		// 합계
		Exam01 e01 = new Exam01(); // 다른패키지에 있으면 import해줘야함
		int sum = e01.sum(arr);
		System.out.println(sum);
		
		
		// 평균
		double avg = e01.avg(arr);
		System.out.println(avg);
		
	}

}
