package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.UserBean;
import sdl.abc.dao.UserDAO;

public class MyProfile extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> loginSession;
	private UserBean myProfile;
	
	public UserBean getMyProfile() {
		return myProfile;
	}


	public void setMyProfile(UserBean myProfile) {
		this.myProfile = myProfile;
	}


	public void setSession(Map<String, Object> session) {
        this.loginSession = session;
   }
	
	
	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		myProfile = dao.viewProfile((Integer) loginSession.get("id"));
		
		return SUCCESS;
	}
}
