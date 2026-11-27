package genericsProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
	// 메뉴를 저장하는 리스트
	private Scanner scan;
	private List<Product<String, Integer>> menuList = new ArrayList<>();
	
	// 주문 저장 리스트
	private List<Order<String, Integer>> orderList = new ArrayList<>();
	
	public ProductController(Scanner scan) {
		this.scan = scan;
		addMenu();
	}
	
	public void addMenu() {
		// 기본 메뉴 추가
		menuList.add(new Product<String, Integer>("김밥", 2000));
		menuList.add(new Product<String, Integer>("라면", 3000));
		menuList.add(new Product<String, Integer>("떡볶이", 3500));
		menuList.add(new Product<String, Integer>("음료수", 1000));
	}
	
	public void run() {
		int number = 0;
		
		while(true) {
			System.out.println("1.메뉴추가 | 2.메뉴보기 | 3.제품주문 | 4.주문내역보기 | 5.종료");
			System.out.println("선택");
			
			number = scan.nextInt();
			
			if(number == 5) {
				System.out.println("종료!");
				break;
			}
			
			switch(number) {
			case 1: insertMenu(); break;
			case 2: printMenu(); break;
			case 3: orderPick(); break;
			case 4: orderPrint(); break;
			default : throw new RuntimeException("잘못된 메뉴입니다");
			}
		}
 	}

	private void insertMenu() {
		// 메뉴 추가
		System.out.println("메뉴명>");
		String menu = scan.next();
		System.out.println("가격");
		int price = scan.nextInt();
		
		// menuList에 같은 메뉴가 있으면 등록 X
		if(menuList.contains(new Product<String, Integer>(menu))) { //equals 해줘서 가능 // 메뉴만 일치하면 으로 해둠 키만주고 만들어도 제네릭에 String, Integer했기때문에 둘다 써줘야함
			System.out.println("이미 있는 메뉴입니다");
			return;
		}
		
		menuList.add(new Product<String, Integer>(menu, price));
		System.out.println("메뉴 추가완료!");
	}
	
	private void printMenu() {
		// 메뉴보기
		int cnt = 0;
		System.out.println("--메뉴보기---");
		for(Product<String, Integer> p : menuList) {
			cnt++;
			System.out.println(cnt + "." + p);
		}
	}
	
	private void orderPick() {
		// 제품 주문
		// 번호로 주문 번호 => 번호-1 => index 
		printMenu();
		System.out.println("주문번호>");
		int no = scan.nextInt();
		System.out.println("수량");
		int count = scan.nextInt();
		 // 내가 주문한 메뉴, 가격이 들어가있는 product
		
		// 기존에 메뉴가 존재한다면 수량만 추가
		Order<String, Integer> p = new Order<String, Integer>(menuList.get(no-1).getMenu());
		int orderIndex = orderList.indexOf(p);

		if(orderIndex != -1) { 
			// 기존 메뉴 가져오기 => 수량을 가져와서 => 추가수량을 더하고 => 다시 수량을 set(계산)
			int addCount = orderList.get(orderIndex).getCount()+count;
			System.out.println(addCount);
			orderList.get(orderIndex).setCount(addCount);
			System.out.println("추가주문완료!!");
			return;
		}
		
		// 없다면 다 추가
		Product<String, Integer> p2 = menuList.get(no-1);
		Order<String, Integer> o = new Order<String, Integer>(p2, count);
		orderList.add(o);
		//orderList.add(new Order<String, Integer>(p, count)); // 이것도 가능
		System.out.println("주문완료!");
	
		
	}
	
	private void orderPrint() {
		// 주문내역보기
		int cnt = 0;
		System.out.println("--주문내역보기---");
		for(Order<String, Integer> o : orderList) {
			cnt++;
			System.out.println(cnt+". ");
			o.printOrder();
		}
	}
}
