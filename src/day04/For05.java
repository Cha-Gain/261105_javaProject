package day04;

public class For05 {

	public static void main(String[] args) {
		// 구구단
		
		int dan = 2;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		/* 2*1=2 3*1=3 4*1=4
		 * 2*2=4 3*2=6 4*2=8
		 * 2*3=6 3*3=9
		 * 
		 * */
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		

	}

}
