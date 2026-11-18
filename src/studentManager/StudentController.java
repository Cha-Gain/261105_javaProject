package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	private Student[] students = new Student[5];
	private Subject[] subjects = new Subject[5];
	private int index;
	
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생 이름");
		String name = scan.next();
		
	}

	@Override
	public void printStudentList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

}
