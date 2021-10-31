package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.dao.UserDAO;

public class ApplyJob extends ActionSupport implements SessionAware {
	

	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> loginSession;
	private int jid;
	
    public void setSession(Map<String, Object> session) {
         this.loginSession = (Map<String, Object>) session;
    }

	
	public int getJid() {
		return jid;
	}


	public void setJid(int jid) {
		this.jid = jid;
	}


	@Override
	public String execute() throws Exception {
		
		int set;
		UserDAO dao = new UserDAO();
		System.out.println((Integer) loginSession.get("id"));
		
		set = dao.applyJob((Integer) loginSession.get("id"), jid);
		
		return SUCCESS;
	}
	
}
