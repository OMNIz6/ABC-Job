package sdl.abc.controller;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.dao.UserDAO;

public class RegProcess extends ActionSupport {
	
	private static final long serialVersionUID = -4708862737005997433L;
	
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		int result = dao.register(getFname(), getLname(), getEmail(), getPassword());
		if(result == 0) {
			message = "Email already registered";
			return "fail";
		}else {
			return "success";
		}
	}
}