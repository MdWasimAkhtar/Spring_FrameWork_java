package springMVCApp02.Client;

public class Student {
	
	private String usn;

	public Student() {
		super();
	}
	
	public Student(String usn) {
		this.usn=usn;
	}
	
	public String getUsn() {
		return this.usn;
	}
	public void setUsn(String usn) {
		this.usn=usn;
	}
	
	public String toString() {
		return "["+ usn + "]";
	}

}
