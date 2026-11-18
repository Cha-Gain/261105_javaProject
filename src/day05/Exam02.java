package day05;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성별, 나이를 출력
		String regNum = "010101-3234567"; // 1900년생 => 1(남), 2(여)
		//String regNum = "010101-3234567"; // 2000년생 => 3(남), 4(여)
		
		// 출력결과
		/*
		 * 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28
		 */
		
		int today = 2026;
		// 연도, - 다음의 수
		String birth = regNum.substring(0, regNum.indexOf("-"));
		System.out.println("생년월일 : " + birth);
		
		String year = birth.substring(0, 2);
		String rNum = regNum.substring(7,8); // equals
		char r = regNum.charAt(7); // ==
		
		// 성별 1,3 = 남 / 2,4 = 여
		String gender = (rNum.equals("1") || rNum.equals("3")) ? "남" : "여";
		//String gender = (r == '1' || r == '3') ? "남" : "여";
		
		System.out.println("성별 : " + gender);
		
		// 19+99 String / 99+1000 int
		
		//year = "19"+year;
		int year2 = Integer.parseInt(year);
//		if(r == 1 || r == 2) {
//			year2 = year2 + 1900;
//		} else {
//			year2 = year2 + 2900;
//		}
		
		year2 = (rNum.equals("1") || rNum.equals("2")) ? year2 + 1900 : year2 + 2000;
		
		System.out.println("나이 : " + (today - year2));
		
		/*int today = 2026;
		String year = "";
		String gender =  "";
		String genderNum = regNum.substring(7, 8);
		int age = 0;
		
		switch(genderNum) {
		case "1" : case "2" : 
			year = "19".concat(regNum.substring(0, 2));
			if (genderNum.equals("1")) {
				gender = "남";
			} else {
				gender = "여";
			}
			break;
			
		case "3" : case "4":
			year = "20".concat(regNum.substring(0, 2));
			if (genderNum.equals("3")) {
				gender = "남";
			} else {
				gender = "여";
			}
			break;
		}
		
		age = today - Integer.parseInt(year);
		
		System.out.println("생년월일 : " + regNum.substring(0, 6));
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);*/
		
		
		

	}

}
