package sdl.abc.controller;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.UserBean;
import sdl.abc.dao.UserDAO;

public class SearchAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	
	private List <UserBean> list;
	private String keyword;
	
	private Map<String, Object> loginSession;
	
	public void setSession(Map<String, Object> session) {
        this.loginSession = session;
   }
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	private String message;

	public List <UserBean> getList() {
		return list;
	}

	public void setList(List <UserBean> list) {
		this.list = list;
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
		list = dao.searchUser(keyword);
		if(loginSession.get("role").equals("admin")) {
			loginSession.put("keyword", keyword);
		}
		
		
		if(list == null) {
			message = "Cant find result of "+ keyword +". ";
			return SUCCESS;
		}else{
			message = null;
			return SUCCESS;
		}
	}
	
	

}
