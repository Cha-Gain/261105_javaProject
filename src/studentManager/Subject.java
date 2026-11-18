package studentManager;

public class Subject {
	private String name;
	private String period;
	
	public Subject() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", period=" + period + "]";
	}
}
