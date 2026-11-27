package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가지 정도 저장하고 => 출력 (향상된 for문)
		
		//1. 내 리스트에 '사과'가 있으면 '사과판매' / 없으면 '재고없음' 출력
		
		
		List<String> list = new ArrayList<>();
		
		list.add("사과");
		list.add("포도");
		list.add("키위");
		list.add("망고");
		list.add("딸기");
		
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
		Iterator it = list.iterator(); // object
		
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
		
		if(list.contains("수박")) {
			System.out.println("사과판매");
		} else {
			System.out.println("재고 없음");
		}
		
		String s = list.contains("사과") ? "사과판매" : "재고없음";
		System.out.println(s);
		
		if(list.indexOf("사과") != -1) {
			System.out.println("사과판매");
		} else {
			System.out.println("재고 없음");
		}

	}

}
