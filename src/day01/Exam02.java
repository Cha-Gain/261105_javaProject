package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고, 합계와 평균을 출력
		// 각 점수는 0~100 => 점수가 잘못입력되었습니다
		// pass : 평균이 60점 이상이면 합격 아니면 불합격
		// 일반적으로 안되는 케이스를 먼저 처리함
		
		/*int kor = 110;
		int eng = 50;
		int math = 50;
		int total = kor + eng + math;
		int avg = total/3;
		
		if(kor>=0 && kor<=100 && eng>=0 && eng<=100 &&math>=0 && math<=100) {
			System.out.println(total);
			System.out.println(avg);
			int pass = avg;
			if(pass >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
		} else {
			System.out.println("점수가 잘못입력되었습니다");
		}
		*/
		
		//int kor = 78, eng = 89, math = 45;
		
		int kor = 110;
		int eng = 50;
		int math = 50;
		
		//1. 조건에 맞다면 계산하시오.
		if((kor >= 0 && kor <= 100) && (eng >= 0 && eng <= 100) && (math >= 0 && math <= 100)) {
			// 계산
			int total = kor + eng + math;
			double avg = (double)total / 3;
			System.out.println("total : " + total + " avergage :" + avg);
			if(avg >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
			// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
			System.out.println(avg >= 60 ? "합격" : "불합격");
			
			String pass = avg >= 60 ? "합격" : "불합격";
		} else {
			System.out.println("점수가 잘못 입력되었습니다.");
		}
		
		//2. 각 점수의 조건이 맞지 않으면 계산하지 마시오.
		if((kor > 100 || kor < 0) || (kor > 100 || kor < 0) || (kor > 100 || kor < 0)) {
			// 계산 불가
			System.out.println("점수가 잘못 입력되었습니다.");
		} else {
			int total = kor + eng + math;
			double avg = (double)total / 3;
			System.out.println("total : " + total + " avergage :" + avg);
			if(avg >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
			// 삼항연산자는 연산자 안에 처리구문을 포함할 수 없다.
			System.out.println(avg >= 60 ? "합격" : "불합격");
			
			String pass = avg >= 60 ? "합격" : "불합격";
		}

	}

}
