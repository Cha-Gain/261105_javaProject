package day15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

	public static void main(String[] args) {
		// 로또번호 6개 출력
		// set 을 사용하여 1~45까지의 랜덤수를 6 개저장
		// 출력
		// for X / while O
		
		Set<Integer> set = new HashSet<>();
		
//		for(int i=0; set.size() < 6; i++) {
//			set.add((int)(Math.random()*45+1));
//		}
		
		while(set.size() < 6) {
			set.add((int)(Math.random()*45+1));
		}
		
		System.out.println(set);
		
		System.out.println("--------------------");
		
		// 부모타입으로 선언을 하면 자식의 본인만 가지고 있는 메서드 사용X
		// 자식 타입으로 자식 객체를 생성
		TreeSet<Integer> set2 = new TreeSet<>();
		
		while(set2.size() < 6) {
			set2.add((int)(Math.random()*45+1));
		}
		// 트리구조로 다음 들어오는 값이 현재값보다 작으면 앞으로, 크면 뒤로 보내는 구조
		System.out.println(set2);
		
		// first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(set2.first());
		System.out.println(set2.last());
		
		// headSet(값) /  tailSet(값) : 기준 값으로 앞쪽 / 뒷쪽 값을 출력
		System.out.println(set2.headSet(15)); // 기준값보다 작은 값
		System.out.println(set2.tailSet(15)); // 기준값보다 큰 값
		
		// subSet(start, end) : 범위 값 출력 (end는 미포함)
		System.out.println(set2.subSet(10, 20)); // 20은 포함안함
			
	}
	
}
