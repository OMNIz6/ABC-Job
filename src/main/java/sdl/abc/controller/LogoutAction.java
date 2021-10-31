package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private SessionMap<String, Object> loginSession;
	
	public void setSession(Map<String, Object> session) {
        this.loginSession = (SessionMap<String, Object>)session;
	}
	
	@Override
	public String execute() throws Exception {
		loginSession.invalidate();
		return SUCCESS;
	}
	
}
