package day18;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream01 {

	public static void main(String[] args) {
		// stream : 자료를 복사하여 생성
		/* 1회용, 쓰고나면 소모됨. (재사용 불가)
		 * - 스트림용 연산을 수행
		 * - 연산을 수행하고 나면 스트림을 소모함
		 * - 스트림은 복사본이기때문에 기존 자료를 변경하는 구문은 불가능
		 * - 메서드 체이닝 방식 사용
		 * - 스트림만의 연산을 가지고 있음
		 * 
		 * 
		 * 중간연산 / 최종연산
		 * - 최종연산 (마지막에 한번만)
		 * - forEach() : 리스트를 순회하여 요소의 값을 얻어내는 역할
		 * - sum(), average(), max(), min(), count()
		 * 	:합계, 평균, 최대, 최소, 개수를 리턴
		 * - collect() : 스트림 내부에 남은 요소를 수집하여 원하는 형태로 변환
		 * - toList() : 리스트로 리턴
		 * - toArray() : 배열로 리턴
		 * - findFirst() : 조건 중 일치하는 요소중 가장 앞에 있는 요소를 리턴
		 * - findAny() : 조건에 일치하는 요소 중 가장 먼저 탐색되는 요소를 리턴
		 * - anyMatch() : 조건에 일치하는 요소가 하나라도 있다면 true
		 * - allMatch() : 모든 요소가 조건에 일치하면 true 리턴
		 * - noneMath() : 조건에 일치하는 요소가 없다면 true 반환
		 * 
		 * - 중간연산 (여러번 중복 사용가능)
		 * - filter() : 조건에 맞는 결과를 필터링
		 * - distinct() : 중복 값 제거
		 * - map() : 요소를 원하는 값으로 변환 => 형변환
		 * - sorted() : 오름차순정렬
		 * - peek() : 작업 실행 후 스트림 리턴
		 * - skip() : 스트림의 일부를 건너 뜀
		 * - limit() : 스트림의 일부를 잘라냄 
		 */
		
		int arr[] = {1,2,8,7,5,6,5,4,3,3,6};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		System.out.println("-----stream 구성방식 ---");
		// 배열을 스트립으로 구성
		System.out.println(Arrays.stream(arr).sum());

		// 한번 구성된 스트림은 소모되기때문에 굳이 변수로 저장안함.
		IntStream in = Arrays.stream(arr);
		long count = in.count();
		System.out.println(count);
		
		//int s1 = in.sum(); // 사용불가 (이미 소모가 된 상태임)
		//System.out.println(s1);
		
		// Optional : null 방지용
		OptionalDouble od =  Arrays.stream(arr).average();
		System.out.println(od.getAsDouble());
		
		// filter 5이상인 값만 합계
		
		System.out.println(Arrays.stream(arr).filter(n -> n>=5).sum());
		
		// 5이상인 값만 리스트로 리턴
		// IntStream을 이용하여 조건에 맞는 값만 추출 => List<Integer>로 리턴
		// int -> Integer : boxing .boxed()
		
		List<Integer> list = Arrays.stream(arr)
		.filter(n -> n>=5)
		.boxed() // intStream => Stream<Integer>
		.collect(Collectors.toList());
		
		System.out.println(list);
		
		// IntStream 5이상값만 배열로 리턴
		int[] arr2 = Arrays.stream(arr)
				.filter(n -> n>=5)
				.distinct() // 중복제거
				.sorted()
				.toArray();
		System.out.println(Arrays.toString(arr2)); // 중간연산의 순서가 바뀌어도 영향을 미치지 않음.
		
		
		// anyMatch()
		boolean any = Arrays.stream(arr)
				.anyMatch(n -> n==7);
		
		System.out.println(any);
		
		//findFirst()
		OptionalInt oi = Arrays.stream(arr)
			.filter(n -> n<=5)
			.findFirst();
		System.out.println(oi.getAsInt());
	}

}
