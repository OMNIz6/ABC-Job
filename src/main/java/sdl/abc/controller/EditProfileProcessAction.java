package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.UserBean;
import sdl.abc.dao.UserDAO;

public class EditProfileProcessAction extends ActionSupport implements SessionAware{	
	
	private static final long serialVersionUID = 1L;
	
	private UserBean user;
	private String message = null;
	
	private Map<String, Object> loginSession;
	
	public void setSession(Map<String, Object> session) {
        this.loginSession = session;
   }

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		int result = dao.updateProfile((Integer) loginSession.get("id"), user.getFname(), user.getLname(), user.getEmail(), user.getAge(), user.getLocation(), user.getPhno(), user.getPostion(), user.getDescription());
		if(result == 0) {
			message = "Can't update the profile";
			return "fail";
		}else {
			return "success";
		}
	}

	

	
	
}
