package day02;

import java.util.Random;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성 (0~100)
		// 각 점수를 출력 합계, 평균, pass
		// pass 80점 이상이면 상 / 60점 이상이면 중 / 나머지는 하
		
		/* Random random = new Random();
		
		int kor = random.nextInt(100);
		int eng = random.nextInt(100);
		int math = random.nextInt(100);
		int total = kor + eng + math;
		int avg = total/3;
		String pass = "";
		
		if(avg >= 80) {
			pass = "상";
		} else if(avg >= 60 && avg < 80) {
			 pass = "중";
		} else if(avg >= 0 && avg < 60) {
			pass = "하";
		}

		System.out.println("국어점수:" + kor + " 영어점수:" + eng + " 수학점수:" + math);
		System.out.println("점수 합계:" + total);
		System.out.println("점수 평균:" + avg);
		System.out.println("상중하:" + pass);
		*/

		
		// 5명의 값을 출력 (for)
		/*for(int i=1; i<=5; i++) {	
			int kor2 = random.nextInt(100);
			int eng2 = random.nextInt(100);
			int math2 = random.nextInt(100);
			int total2 = kor2 + eng2 + math2;
			int avg2 = total2/3;
			String pass2 = "";
			
			if(avg2 >= 80) {
				pass2 = "상";
			} else if(avg2 >= 60 && avg2 < 80) {
				pass2 = "중";
			} else if(avg2 >= 0 && avg2 < 60) {
				pass2 = "하";
			}

			System.out.println(i + "번 학생 " + " 국어점수:" + kor2 + " 영어점수:" + eng2 + " 수학점수:" + math2 + " 점수 합계:" + total2 +" 점수 평균:" + avg2 + " 상중하:" + pass2);
			*/
		
			// (int)(Math.random()*count)start
			// random Class 사용시 => random.nextInt(count)+start
			/*int kor = (int)(Math.random()*100); // 0~100
			int eng = (int)(Math.random()*100);
			int math = (int)(Math.random()*100);
			
			int total = kor+eng+math;
			double avg = (double)total/3;
			
			String pass ="";
			
			if(avg >= 80) {
				pass = "상";
			} else if(avg >= 60) { // 80아래만 나오기 때문에 위 조건은 충족이 되어서 또 쓸 필요없음
				pass = "중";
			} else {
				pass = "하";
			}*/
			
			//----------------------------
			
			/*if(avg >= 80) {
				pass = "상";
			}
			if(avg >= 60 && avg < 80) { // if만 나열할때는 조건을 다 줘야함
				pass = "중";
			}*/

			/*System.out.println("국어: " + kor + " 영어:" + eng + " 수학:" + math);
			System.out.println("합계: " + total + " 평균: " + avg + " pass: " + pass);*/
			
			// for문 사용 5명 데이터 출력
			for(int i=0; i<5; i++) {
				int kor = (int)(Math.random()*100); // 0~100
				int eng = (int)(Math.random()*100);
				int math = (int)(Math.random()*100);
				
				int total = kor+eng+math;
				double avg = (double)total/3;
				
				String pass ="";
				
				if(avg >= 80) {
					pass = "상";
				} else if(avg >= 60) { // 80아래만 나오기 때문에 위 조건은 충족이 되어서 또 쓸 필요없음
					pass = "중";
				} else {
					pass = "하";
				}
				
				//----------------------------
				
				System.out.println((i+1)+ " 학생");
				System.out.println("국어: " + kor + " 영어:" + eng + " 수학:" + math);
				System.out.println("합계: " + total + " 평균: " + avg + " pass: " + pass);
			}
	}

}
