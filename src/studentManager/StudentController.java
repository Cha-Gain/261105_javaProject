package studentManager;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController implements StudentProgram {
   private Student[] students = new Student[5];
   private Subject[] subjects = new Subject[5];
   private int index = 3;
   
   StudentController() {   
	   students[0] = new Student("홍길동","010-1111-1111","111111");
	   students[1] = new Student("둘리","010-2222-2222","121212");
	   students[2] = new Student("치이카와","010-3333-3333","141212");
	   
	   subjects[0] = new Subject("java", "2025.12.01~2026.01.01");
	   subjects[1] = new Subject("python", "2025.12.01~2026.01.01");
	   subjects[2] = new Subject("html", "2025.12.01~2026.01.01");
	   subjects[3] = new Subject("c", "2025.12.01~2026.01.01");
	   subjects[4] = new Subject("c++", "2025.12.01~2026.01.01"); 
   }
   
   @Override
   public void insertStudent(Scanner scan) {
      System.out.println("학생 등록을 시작합니다");
      System.out.println("학생 이름 입력>>");
      String name = scan.next();
      System.out.println("학생 전화번호 입력>>");
      String tel = scan.next();
      System.out.println("학생 학번을 입력>>");
      String studentId = scan.next();
      
      students[index] = new Student(name, tel, studentId);
      index++;
   }

   @Override
   public void printStudentList() {
      for(int i=0; i<index; i++) {
         System.out.println(students[i]);
      }
   }

   @Override
   public void searchStudent(Scanner scan) {
      System.out.println("학생 이름을 검색하세요");
      String name = scan.next();
      
      int sum = 0;
      for (int i=0; i<index; i++) {
         if (name.equals(students[i].getName())) {
        	 for(int j=0; j<students[i].getSubjects().length; j++) {
        		 if(students[i].getSubjects()[j] != null) {
        			 sum++;
        		 }
        	 }
        	 if(sum != 0) {
        		 System.out.println("이름" + students[i].getName() + "강의 목록:"+ Arrays.toString(students[i].getSubjects()));
        	 } else {
        		 System.out.println("이름" + students[i].getName() + "수강 목록이 없습니다");
        	 }
         }
      }
   }

   @Override
   public void insertSubject(Scanner scan) {
	   System.out.println("학번을 입력하세요");
	   String studentId = scan.next();
	   int num = -1;
	   for(int i=0; i<index; i++) {
		   if(students[i] != null && students[i].getStudentId().equals(studentId)) {
			   System.out.println(students[i]);
			   num = i;
		   }
	   }
	   if(num == -1) {
		   System.out.println("학번이 조회되지 않습니다.");
		   return;
	   }
	   
	  while(true) {
	      Student s = students[num];
	      
	      System.out.println("수강신청을 하시겠습니까? y/n");
	      
	      String yn = scan.next();
	      
	      if(yn.equals("y")) {
	    	  for(int i=0; i<subjects.length; i++) {
	    		  System.out.println((i+1) + "." + subjects[i]);
	    	  }
	    	  
	    	  System.out.println("과목을 선택해주세요");
	    	  int menu = scan.nextInt();
	    	  
	    	  s.insertSubject(subjects, menu);
	    	  System.out.println(s.getName() + Arrays.toString(s.getSubjects()));

	      } else if (yn.equals("n")) {
	    	  break;
	      }
	  }
	  
   }

   @Override
   public void deleteSubject(Scanner scan) {
	   System.out.println("학번을 입력하세요");
	   String studentId = scan.next();
	   int num = -1;
	      for(int i=0; i<index; i++) {
	    	  if(students[i] != null && students[i].getStudentId().equals(studentId)) {
	    		  System.out.println(students[i].getName() + Arrays.toString(students[i].getSubjects()));
	    		  num = i;
	    	  }
	      }
	      
	      if(num == -1) {
	    	  System.out.println("학번이 조회되지 않습니다");
	    	  return;
	      }
	   while(true) {		      
		      Student s = students[num];
		      
		      int nullCheck = 0;
		      for(int i=0; i<s.getSubjects().length; i++) {
		    	  if(s.getSubjects()[i] == null) {
		    		  nullCheck++;
		    	  }
		      }
		      
		      if(nullCheck == students.length) {
		    	  System.out.println("삭제 할 과목이 없습니다");
		    	  break;
		      }
		      
		      System.out.println("삭제 할 과목을 선택해주세요");
		      	
		      int deleteNo = scan.nextInt();
		      s.getSubjects()[deleteNo-1] = null;
		      
		      System.out.println(Arrays.toString(s.getSubjects()));

		  }
      
   }

}