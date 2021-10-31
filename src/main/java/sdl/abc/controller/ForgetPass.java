package sdl.abc.controller;

import com.opensymphony.xwork2.ActionSupport;

public class ForgetPass extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
