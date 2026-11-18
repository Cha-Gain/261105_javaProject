package day11;

import java.util.Arrays;

public class CardPack {
	/* 52장의 Card객체를 배열로 저장 pack
	 * ♥A~♥K ◆A~◆K  ♣A~♣K ♠A~♠K 
	 * 
	 * 멤버변수 : 52장의 Card 객체를 담을수 있는 배열 + 번지
	 * - 생성자 : pack의 초기값을 52장의 카드로 초기화
	 * - 메서드
	 * 1. 카드를 섞는 기능
	 * 2. 플레이어에게 한장씩 나눠주는 기능
	 * 3. 카드를 초기화 기능(나눠준 카드 회수)
	 */
	private Card[] pack = new Card[52];
	private int index;
	
	public CardPack() {
		String shape[] = {"♥", "◆", "♣", "♠"};
		
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<=13; j++) {
				Card c1 = new Card();
				c1.setShape(shape[i]);
				c1.setNum(j);
				pack[index] = c1;
				index++;
			}
		}
		
	}
	
	public void CardMix() {
		for(int i=0; i<pack.length; i++) {
			// 번지를 랜덤으로 선택 (0~4)
			int index = (int)(Math.random()*pack.length);
			// 교환
			Card t = pack[i];
			this.pack[i] = this.pack[index];
			this.pack[index] = t;
			
		}
	}
	
	public Card CardPick() {
		index--;
		return pack[index];
		
	}
	
	public void CardRetrieve() {
		
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	@Override
	public String toString() {
		return "CardPack [pack=" + Arrays.toString(pack) + ", index=" + index + ", players="
				+ "]";
	}
}
