package sdl.abc.controller;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.JobBean;
import sdl.abc.dao.UserDAO;

public class GetJobs extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private List <JobBean> Jobs;

	public List <JobBean> getJobs() {
		return Jobs;
	}

	public void setJobs(List <JobBean> jobs) {
		Jobs = jobs;
	}
	
	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		Jobs = dao.getJobs();
		return SUCCESS;
	}
}
