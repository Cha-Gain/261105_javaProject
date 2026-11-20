package cafe;

import java.util.Arrays;
import java.util.Scanner;

public class CafeMain {
	public Coffee menu (Scanner scan, int menuNo) {
		int cnt = 0;
		char ok;
		boolean option;
		// 수량입력, 옵션선택 
		System.out.println("수량입력>");
		cnt = scan.nextInt();
		System.out.println("옵션을 선택하시겠습니까 ? y/n");
		ok = scan.next().charAt(0);
		option = (ok == 'y')? true : false;
		switch(menuNo) {
		case 1: return new Americano(cnt, option);
		case 2: return new Latte(cnt, option);
		case 3: return new Mocha(cnt, option);
			default:
				return null;
		}		
	}
	
	public static void main(String[] args) {
		// Cafe Main
		/* 프로그램 설계서
		 * kiosk
		 * - 메뉴명, 가격, 옵션, 옵션가격, 수량
		 * - 1. Coffee (에스프레소) => 2000원 => 부모클래스
		 * - 2. Americano => Coffee + 물(옵션)(500) => 2500
		 * - 3. Latte => coffee + 우유(1000) => 3000
		 * - 4. Mocha => coffee + 초콜릿(1500) => 3500
		 * 
		 * 
		 * 주문을 받아 Coffee[]에 주문 정보 저장 => 영수증 출력
		 * 
		 * 1. 아메리카노 (2000) 
		 * 2. 라떼 + 우유(3000)
		 * 3. 모카 + 초콜릿(3500)
		 * 0. 주문완료 (영수증 출력)
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
	
		Coffee[] coffees = new Coffee[5];
		
		System.out.println("----메뉴판----");
		
		int menuNo = -1;
		int coffeeCount = 0;
		while(menuNo != 0) {
			System.out.println("1. 아메리카노 | 2. 라떼 + 우유 | 3. 모카 + 초콜릿 | 0. 주문완료");
			
			menuNo = scan.nextInt();
			
			if(menuNo < -1 || 3 < menuNo) {
				System.out.println("잘못 선택했습니다 다시 선택해주세요");
				continue;
			}
			
			CafeMain m = new CafeMain();
			
			switch(menuNo) {
			case 1:
				coffees[coffeeCount] = m.menu(scan, menuNo);
				coffeeCount++;
				break;
			case 2:
				coffees[coffeeCount] = m.menu(scan, menuNo);
				coffeeCount++;
				break;
			case 3:
				coffees[coffeeCount] = m.menu(scan, menuNo);
				coffeeCount++;
				break;
				default:
			}

//			int cnt = 0;
//			char ok;
//			
//			switch(menuNo) {
//			case 1:
//				System.out.println("수량입력>");
//				cnt = scan.nextInt();
//				System.out.println("옵션을 선택하시겠습니까 ? y/n");
//				ok = scan.next().charAt(0);
//				if(ok == 'y') {
//					coffees[coffeeCount] = new Americano(cnt, true);
//				} else if (ok == 'n') {
//					coffees[coffeeCount] = new Americano(cnt, false);
//				} else {
//					System.out.println("y/n 중 선택해주세요");
//				}
//				coffeeCount++;
//				break;
//			case 2:
//				System.out.println("수량입력>");
//				cnt = scan.nextInt();
//				System.out.println("옵션을 선택하시겠습니까 ? y/n");
//				ok = scan.next().charAt(0);
//				if(ok == 'y') {
//					coffees[coffeeCount] = new Latte(cnt, true);
//				} else if (ok == 'n') {
//					coffees[coffeeCount] = new Latte(cnt, false);
//				} else {
//					System.out.println("y/n 중 선택해주세요");
//				}
//				coffeeCount++;
//				break;
//			case 3:
//				System.out.println("수량입력>");
//				cnt = scan.nextInt();
//				System.out.println("옵션을 선택하시겠습니까 ? y/n");
//				ok = scan.next().charAt(0);
//				if(ok == 'y') {
//					coffees[coffeeCount] = new Mocha(cnt, true);
//				} else if (ok == 'n') {
//					coffees[coffeeCount] = new Mocha(cnt, false);
//				} else {
//					System.out.println("y/n 중 선택해주세요");
//				}
//				coffeeCount++;
//				break;
//				default:
//			}
		}
		
		System.out.println("-----영수증-----");
		int total = 0;
		for(int i=0; i<coffees.length; i++) {
			if(coffees[i] != null) {
				total += coffees[i].getPrice();
			}
		}
		
		for(int i=0; i<coffees.length; i++) {
			if(coffees[i] != null) {
				System.out.println(coffees[i].getDescription() + coffees[i].quantity + "개 가격:" + coffees[i].getPrice());
			}
		}
		 
		System.out.println("총 금액" + total);
		
		
		scan.close();
	}

}

class Mocha extends Coffee {
	private int extra_price = 1500;
	private boolean extraKakao;
	
	public Mocha(int cnt, boolean extraKakao) {
		super("모카", 2000, cnt);
		this.extraKakao = extraKakao;
	}

	@Override
	public int getPrice() {
		extra_price = extraKakao ? extra_price : 0;
		return (basePrice + extra_price) * quantity;
	}

	@Override
	public String getDescription() {
		return extraKakao ? name + "(초코추가)" : name;
	}

	@Override
	public String toString() {
		return "Mocha [extra_price=" + extra_price + ", extraKakao=" + extraKakao + "]";
	}
}

class Latte extends Coffee {
	private int extra_price = 1000;
	private boolean extraMilk;
	
	public Latte(int cnt, boolean extraMilk) {
		super("라떼", 2000, cnt);
		this.extraMilk = extraMilk;
	}

	@Override
	public int getPrice() {
		extra_price = extraMilk ? extra_price : 0;
		return (basePrice + extra_price) * quantity;
	}

	@Override
	public String getDescription() {
		return extraMilk ? name + "(우유추가)" : name;
	}

	public int getExtra_price() {
		return extra_price;
	}

	public void setExtra_price(int extra_price) {
		this.extra_price = extra_price;
	}

	public boolean isExtraMilk() {
		return extraMilk;
	}

	public void setExtraMilk(boolean extraMilk) {
		this.extraMilk = extraMilk;
	}

	@Override
	public String toString() {
		return "Latte [extra_price=" + extra_price + ", extraMilk=" + extraMilk + "]";
	}
}

class Americano extends Coffee {
	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano(int cnt, boolean extraWater) {
		super("아메리카노", 2000, cnt);
		this.extraWater = extraWater;
		
	}

	@Override
	public int getPrice() {
		extra_price = extraWater ? extra_price : 0;
		return (basePrice + extra_price) * quantity;
	}

	@Override
	public String getDescription() {
		return extraWater ? name + "+(물추가)" : name;
	}

	@Override
	public String toString() {
		return "Americano [extra_price=" + extra_price + ", extraWater=" + extraWater + "]";
	}	
}

abstract class Coffee {
	// - 메뉴명, 가격, 옵션, 옵션가격, 수량
	protected String name;
	protected int basePrice;
	protected int quantity;
	
	public Coffee() {}
	
	public Coffee(String name, int price, int cnt) {
		this.name= name;
		this.basePrice = price;
		this.quantity = cnt;
	}
	
	public abstract int getPrice();
	
	public abstract String getDescription();
	
}