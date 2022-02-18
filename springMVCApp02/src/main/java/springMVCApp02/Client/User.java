package springMVCApp02.Client;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int UserId;

	private String userName;
	
	private String emailaddress;
	
	private String passwd;
	
	 public User(){
		super();
	}

	public User(int userId, String userName, String emailaddress, String passwd) {
		super();
		UserId = userId;
		this.userName = userName;
		this.emailaddress = emailaddress;
		this.passwd = passwd;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	 
}
