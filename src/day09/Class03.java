package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성
		// 학생이름, 국어점수, 영어점수, 수학점수를 객체로 하는 클래스 생성
		// 이름 (국어, 점수, 수학) = 출력메서드
		// 메서드를 호출하면 국어+영어+수학 리턴되는 => 합계메서드
		// 메서드를 호출하면 합계/3 평균이 리턴되는 => 평균메서드
		// 각각 멤버변수의 getter/setter 생성
		StudentClass s = new StudentClass();
		
		s.setName("홍길동");
		s.setKor(90);
		s.setEng(80);
		s.setMath(100);
		
		s.print();
		System.out.println("합계 : " + s.sum());
		System.out.println("평균 : " + s.avg());
		
		StudentClass[] studentArr = new StudentClass[10];
		studentArr[0] = new StudentClass();
		studentArr[0].setName("이름");
		studentArr[0].setKor(75);
		studentArr[0].setEng(80);
		studentArr[0].setMath(90);
		studentArr[0].print();
		
	}

}

class StudentClass {
	// 멤버변수
	private String name; 
	private int kor;
	private int eng;
	private int math;
	// private int sum; // setter가 없어야 하는 변수 // 더하는 행위 자체에 직접 값을 넣는 경우는 없기 때문에
	// private double avg; // setter가 없어야 하는 변수
	
	// 내가 만드는 메서드 (처리 행위는 무조건 메서드를 만들어서 사용)
	public void print() {
		System.out.println("이름 : " + name + "국어:"+ kor + "영어:" + eng + "수학:"+ math);
		System.out.println("합계 : " + sum() + "/ 평균 : " + avg());
	}
	
	public int sum() { 
		return kor + eng + math;
	}
	
	public double avg() {
		return sum()/(double)3;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}
