package studentList;

import java.util.Objects;

public class Subject {
	// 멤버변수 : 과목번호(기본키), 과목명, 강의장, 시간, 요일...
	private String subjectCode;
	private String subjectName;
	private String subjectRoom;
	private String subjectTime;
	private String subjectweek;
	
	public Subject() {}	
	
	public Subject(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	public Subject(String subjectCode, String subjectName, String subjectRoom, String subjectTime, String subjectweek) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectRoom = subjectRoom;
		this.subjectTime = subjectTime;
		this.subjectweek = subjectweek;
	}

	// toString : 모든 멤버변수의 값을 확인하기 위한 용도
	// 과목정보 출력 메서드
	public void printSubject() {
		System.out.println(subjectCode + "."+ subjectName + "(" + subjectTime + "/" + subjectweek + ") =>" + subjectRoom);
	}
	

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String subjectweek() {
		return subjectweek;
	}

	public void subjectweek(String subectWeek) {
		this.subjectweek = subjectweek;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectRoom=" + subjectRoom
				+ ", subjectTime=" + subjectTime + ", subectWeek=" + subjectweek + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(subjectCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(subjectCode, other.subjectCode);
	}
	
	
}
