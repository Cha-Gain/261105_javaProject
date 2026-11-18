package studentManager;

public class Student {
	private String name;
	private String tel;
	private Subject[] subjects = new Subject[5];
	
	Student() {}
	
	Student(String name, String tel) {
		this.name = name;
		this.tel = tel;
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

	public Subject[] getSubject() {
		return subjects;
	}

	public void setSubject(Subject[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", tel=" + tel + "]";
	}
}
