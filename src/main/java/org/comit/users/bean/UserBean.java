package org.comit.users.bean;

public class UserBean {

	int idUser;
	String userName;
	String eMail;
	String password;
	int code;
	
	public UserBean() {
	}
	
	public UserBean(int idUser, String userName, String eMail, String password, int code) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.eMail = eMail;
		this.password = password;
		this.code = code;
	}
	

	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int[] getCode() {
		
		int [] code = {(int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10), 
					   (int)(Math.random()*10),(int)(Math.random()*10),(int)(Math.random()*10)};
		
		return code;
	}
	
	public void setCode(int code) {
		
		this.code = code;
	}

	@Override
	public String toString() {
		return "UserBean [idUser=" + idUser + ", userName=" + userName + ", eMail=" + eMail + ", password=" + password
				+ ", code=" + code + "]";
	}

	
}
