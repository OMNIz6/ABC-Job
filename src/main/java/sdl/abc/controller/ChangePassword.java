package sdl.abc.controller;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.dao.UserDAO;

public class ChangePassword extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String password;
	private String email;
	private String message;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
		int set;
		UserDAO dao = new UserDAO();
		set = dao.changePassword(email, password);
		if(set == 0) {
			message = "Password chaning unsuccessful";
		}
		return SUCCESS;
	}
}
