package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import word.Word;

public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성 Student(이름,점수)
		
		// List<Student> list
		// 10명 학생 추가 
		
		//stream 구성해서 출력 => forEach
		
		// 모든학생의 점수 합계 sum() int로 변환
		
		// 모든 학생의 인원수 count()
		
		// 점수가 80점 이상인 학생 수 filter() count()
		
		// 이름순으로 정렬하여 출력
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 80));
		list.add(new Student("둘리", 70));
		list.add(new Student("고죠", 90));
		list.add(new Student("나나미", 65));
		list.add(new Student("죠죠", 40));
		list.add(new Student("또치", 80));
		list.add(new Student("김미영", 95));
		list.add(new Student("박철수", 30));
		list.add(new Student("김수인", 20));
		list.add(new Student("이타도리", 40));
		
		// 이름 점수 총 출력
		list.stream().forEach(n -> System.out.println(n));
		
		list.stream().forEach(n -> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name + score);
		});
		
		// 총 점수 출력
		int sum = list.stream().mapToInt(n -> n.getScore()).sum();
		System.out.println("총 점수:" + sum);

		// 모든 학생의 인원수 
		long count = list.stream().count();
		System.out.println("총" + count + "명");
		
		// 점수가 80점 이상인 학생수 filter() count()
		long count2 = list.stream().filter(n -> n.getScore() >= 80).count();
		System.out.println(count2 + "명");
		
		// 이름순으로 출력
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(n -> System.out.println(n));
		
		System.out.println("------------------");
		
		// 클래스에서 직접 구현 implements => Comparable()
		list.stream().sorted().forEach(n -> System.out.println(n));
	}

}

class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + " : " +score + "점";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getScore() - this.score;
	}
	
	
}
