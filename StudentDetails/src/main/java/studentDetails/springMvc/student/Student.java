package studentDetails.springMvc.student;

import javax.persistence.*;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String sname;
	private String sem;
	
	public Student() {
		super();
	}
	public Student(Integer sid, String sname, String sem) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sem = sem;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sem=" + sem + "]";
	}
	
	
	
	

}
