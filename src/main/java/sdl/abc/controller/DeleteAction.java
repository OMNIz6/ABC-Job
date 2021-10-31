package sdl.abc.controller;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.dao.AdminDAO;

public class DeleteAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private int id;
	
	private Map<String, Object> loginSession;
	
	private String keyword;
	
	public void setSession(Map<String, Object> session) {
        this.loginSession = session;
   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String execute() throws Exception {
		int set = 0;
		AdminDAO dao = new AdminDAO();
		keyword = (String) loginSession.get("keyword");
		set = dao.deleteUser(id);
        
		return SUCCESS;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
