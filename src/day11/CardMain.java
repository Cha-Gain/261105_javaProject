package day11;

public class CardMain {

	public static void main(String[] args) {
		// 숫자 : (1~13) 1(A), 11(J), 12(Q), 13(K) 
		// 모양 : ♥, ◆, ♣, ♠
		
		
		/*  ex) ♥A, ♥5, ♣11 => ♣j / !2 => ♥
		 * 범위에 없는 모양이면 => ♥
		 * 범위에 없는 숫자면 => 1 => A
		 * 
		 */
		
		// 카드 팩 객체 생성
		CardPack cp = new CardPack();
		//System.out.println(cp);
		//cp.getPack()[0].print(); // pack의 0번지 Card출력
		//System.out.println();
		
		// 섞기 메서드
		System.out.println("딜러가 카드를 섞고 있습니다");
		cp.shuffle();
		System.out.println(cp);
		
		// player 4명
		System.out.println("딜러가 카드를 나누고 있습니다");
		
		System.out.println("player1 카드 pick");
		// 메서드 호출
		cp.pick().print();
		System.out.println();
		System.out.println(cp.getIndex()); // index가 51 이니까 52번째 카드
		//Card play1 = cp.pick();
		
		System.out.println();
		System.out.println("player2 카드 pick");
		cp.pick().print();
		// 메서드 호출
		
		System.out.println();
		System.out.println("player3 카드 pick");
		cp.pick().print();
		// 메서드 호출
		
		System.out.println();
		System.out.println("player4 카드 pick");
		cp.pick().print();
		// 메서드 호출
		
		//System.out.println("player1 Card open!!");
		// 카드출력
		//play1.print();
		//System.out.println("player2 Card open!!");
		// 카드출력
		//System.out.println("player3 Card open!!");
		// 카드출력
		//System.out.println("player4 Card open!!");
		// 카드출력
		

		// index를 원래대로 회복 => 52
		cp.init();
		System.out.println(cp);
		
		
		// Card c = new Card(!2);
//		Card c = new Card();
//		System.out.println(c);
//		c.print();
//		c.setNum(10);
//		c.setShape("♠");
//		c.print();
//		
//		System.out.println("-------------");
//		String shape[] = {"♥", "◆", "♣", "♠"};
//		
//		
//		for(int i=0; i<shape.length; i++) {
//			for(int j=1; j<=13; j++) {
//				Card c1 = new Card();
//				c1.setShape(shape[i]);
//				c1.setNum(j);
//				c1.print();
//			}
//			System.out.println();
//		}
		
		
	}

}
