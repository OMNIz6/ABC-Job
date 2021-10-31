package sdl.abc.controller;


import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.UserBean;
import sdl.abc.dao.UserDAO;

public class ViewProfile extends ActionSupport{


	private static final long serialVersionUID = 1L;
	
	private int id;
	private UserBean profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserBean getProfile() {
		return profile;
	}

	public void setProfile(UserBean profile) {
		this.profile = profile;
	}

	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		profile = dao.viewProfile(id);
		
		return SUCCESS;
	}
	
}
