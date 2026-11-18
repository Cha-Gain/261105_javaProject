package day05;

public class Array04 {

	public static void main(String[] args) {
		int arr[] = {45,50,50,50,50,50,50,50,100};
		
		// 합계와 평균을 출력
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println("총 합계 : " + total);
		System.out.println("평균 : " + (double)(total/arr.length));

		// 가장 큰 값, 가장 작은 값
		int max = arr[0]; // 45
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
		// Math.max(a, b); Math.min(a, b);
		max = arr[0];
		min = arr[0];
		for(int i=0; i<arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		
	}

}
