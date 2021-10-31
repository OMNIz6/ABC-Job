package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.LoginBean;
import sdl.abc.dao.AdminDAO;
import sdl.abc.dao.UserDAO;

public class LoginAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1990570733820090658L;
	
	private String email;
	private String password;
	private String message;
	private LoginBean login = new LoginBean();
	private Map<String, Object> loginSession;
	
    public void setSession(Map<String, Object> session) {
         this.loginSession = (Map<String, Object>) session;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String execute() throws Exception {
		
		
		if(email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@abc.com+$")) {
			AdminDAO dao = new AdminDAO();
			login = dao.login(getEmail(), getPassword());
			
		}else {
			UserDAO dao = new UserDAO();
			login = dao.login(getEmail(), getPassword());
			
		}
		if(login == null) {
			message = "Email or password is wrong";
			return "fail";
		}else if (login.getStatus().equals("banned")) {
			message = "This account is banned. Contact the support team.";
			return "fail";
		}
		else {
			loginSession.put("id", login.getId());
			loginSession.put("email", login.getEmail());
			loginSession.put("role", login.getRole());
			
			return "success";
		}
		
		
		
	}
	
}
