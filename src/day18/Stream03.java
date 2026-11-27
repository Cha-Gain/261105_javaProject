package day18;

import java.util.Arrays;

public class Stream03 {

	public static void main(String[] args) {
		int arr[] = {5,6,5,6,6,3,5,6,7,7,3,8,8,5};
		
		// 스트림으로 구성하여 중복제거하고, 정렬하여, 짝수만 출력
		Arrays.stream(arr)
				.distinct()
				.sorted()
				.filter(n -> n%2==0)
				.forEach(n->System.out.print(n + " "));
		
		System.out.println("--------------");
		
		// 스트림으로 구성하여 중복제거하고, 정렬하여, 홀수만 배열로 리턴
		int[] arr2 = Arrays.stream(arr)
				.distinct()
				.sorted()
				.filter(n -> n%2==1)
				.toArray();
		
		System.out.println(Arrays.toString(arr2));
		

	}

}
