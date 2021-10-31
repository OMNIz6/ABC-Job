package sdl.abc.controller;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.dao.UserDAO;

public class ConfirmEmail extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String message;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String execute() throws Exception {
		boolean set;
		UserDAO dao = new UserDAO();
		set = dao.confirmEmail(email);
		if(set == false) {
			message = "Requested email could not be found.";
			return "fail";
			
		}else {
			return "success";
		}
	}
	
}
