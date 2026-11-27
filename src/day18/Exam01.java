package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		// 여행비용 구하기
		// Customer 클래스 생성
		// 이름, 나이, 비용
		/* 
		 * 
		 * 여행비용은 15세 이상은 100만원, 15세 미만은 80만원
		 * 5명 가족이 패키지 여행을 떠난다고 가정했을 경우 
		 * 15세 미만 한명
		 * 1. 비용을 계산 -> 총 여행 비용 => 출력
		 * 2. 고객 명단 => 이름 순으로 정렬 => 이름, 나이, 금액 출력
		 * 3. 20살 이상인 성인 명단 출력 => 나이순으로 정렬 => 출력
		 * 
		 * 예)
		 * 이름:신형만 나이:40 비용:100
		 * 이름:봉미선 나이:35 비용:100
		 * 이름:짱구 나이:5 비용:80
		 * 이름:짱아 나이:3 비용:80
		 * 이름:흰둥이 나이:8 비용:80
		 * 
		 */
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer("신형만", 40));
		customers.add(new Customer("봉미선", 35));
		customers.add(new Customer("짱구", 5));
		customers.add(new Customer("짱아", 3));
		customers.add(new Customer("흰둥이", 8));
		
		int sum = customers.stream().mapToInt(n -> n.getPrice()).sum();
		System.out.println("총 여행비용: " + sum);
		
		System.out.println("-----고객 리스트----");
		customers.stream().sorted(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		}).forEach(n -> System.out.println(n));
		
		
		System.out.println("---20살 이상 리스트---");
		customers.stream().filter(n -> n.getAge() >= 20)
				.sorted()
				.forEach(n -> System.out.println(n));

	}

}

class Customer implements Comparable<Customer> {
	private String name;
	private int age;
	private int price;
	
	public Customer() {
		
	}
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		calcPrice();
	}
	
	public void calcPrice() {
		this.price = age >= 15? 100 : 80;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return o.getAge() - this.age;
	}
	
	
}