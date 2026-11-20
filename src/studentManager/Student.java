package studentManager;

import java.util.Arrays;

public class Student {
   private String name;
   private String tel;
   private Subject[] subjects = new Subject[5];
   private int subjectIndex;
   private String studentId;
   
   Student() {}
   
   Student(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   
   Student(String name, String tel, String studentId) {
	   this(name, tel);
	   this.studentId = studentId;
   }

   public void insertSubject(Subject[] subject, int num) {
	   this.subjects[subjectIndex] =  subject[num-1];
	   subjectIndex++;
   }
   
   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public String getTel() {
	return tel;
   }

   public void setTel(String tel) {
	this.tel = tel;
   }

   public Subject[] getSubjects() {
	return subjects;
   }

   public void setSubjects(Subject[] subjects) {
	this.subjects = subjects;
   }

   public String getStudentId() {
	return studentId;
   }

   public void setStudentId(String studentId) {
	this.studentId = studentId;
   }

   @Override
   public String toString() {
	return "이름" + name + ", 전화번호" + tel + ", 강의목록" + Arrays.toString(subjects) + ", 학번"
			+ studentId + "]";
   }

}