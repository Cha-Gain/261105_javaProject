package day03;

public class For02 {

	public static void main(String[] args) {
		// for문을 사용하여 1~100까지의 합계를 출력
		int sum = 0; // local varibale (지역변수) : 반드시 초기화, 메서드 안에서 사용하는 변수
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1~100까지 짝수의 합계
		sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);

		// for 1~10까지의 랜덤수를 5번 출력
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
	}

}
