package studentList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentController implements StudentProgram {
	private List<Student> studentList = new ArrayList<>();
	private List<Subject> subjectList = new ArrayList<>();
	
	public StudentController() {
		subjectList.add(new Subject("111", "자바", "1강의장", "4", "월, 수, 금"));
		subjectList.add(new Subject("222", "C언어", "2강의장", "5", "화, 목"));
		subjectList.add(new Subject("333", "DB", "3강의장", "6", "월"));
		subjectList.add(new Subject("444", "javascript", "4강의장", "7", "월 ~ 금"));
		subjectList.add(new Subject("555", "HTML", "5강의장", "8", "화, 목"));
		
		studentList.add(new Student("1", "홍길동"));
		studentList.add(new Student("2", "김영이"));
		studentList.add(new Student("3", "ddd"));
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학번>");
		String num = scan.next();
		System.out.println("이름");
		String name = scan.next();
		
		if(studentList.contains(new Student(num))) {
			System.out.println("이미 등록 된 학생입니다");
			return;
		}

		studentList.add(new Student(num, name));
		
	}

	@Override
	public void printStudentList() {
		// TODO Auto-generated method stub
		for(Student tmp : studentList) {
			tmp.printStudent();
		}
	}
	
	public void printSubjectList () {
		for(Subject tmp : subjectList) {
			tmp.printSubject();
		}
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("학번>");
		String num =  scan.next(); 
		
		int index = studentList.indexOf(new Student(num));
		
		if(index == -1) {
			System.out.println("검색 학생이 없습니다");
			return;
		} 
		
		studentList.get(index).printStudent();
		studentList.get(index).printCourse();
		
		
		
	}

	@Override
	public void insertSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학번>");
		String num =  scan.next(); 
		
		int index = studentList.indexOf(new Student(num));
		
		if(index == -1) {
			System.out.println("검색 학생이 없습니다");
			return;
		} 
		
		
		// 수강신청 리스트 출력
		printSubjectList();
		System.out.println("수강 신청 할 과목번호");
		String subjectNum = scan.next();
		Subject s = new Subject(subjectNum);
		int subIndex = subjectList.indexOf(s);
		
		if(subIndex == -1) {
			System.out.println("해당 과목코드는 존재하지 않습니다");
			return;
		}
	 	
		studentList.get(index).addSubject(subjectList.get(subIndex));
		//studentList.get(index).getCourse().add(subjectList.get(subIndex));
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 학번 검색 후 => 나의 수강신청 목록 => 삭제 할 수강목록 선택 => 삭제
		System.out.println("학번");
		String num = scan.next();
		
		int index = studentList.indexOf(new Student(num));
		
		if(index == -1) {
			System.out.println("검색 학생이 없습니다");
			throw new RuntimeException("검색학생이 없습니다.");
//			return;
		} 
		
		studentList.get(index).printCourse();
		System.out.println("삭제 할 과목번호");
		String subjectCode = scan.next();
		boolean ok = studentList.get(index).removeSubject(subjectCode);
		
		System.out.println(ok ?  "취소완료 !" : "해당과목이 없습니다");
	}
	
	

}


