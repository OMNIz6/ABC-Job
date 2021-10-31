package sdl.abc.controller;

import com.opensymphony.xwork2.ActionSupport;

import sdl.abc.bean.JobBean;
import sdl.abc.dao.UserDAO;

public class JobDetail extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private JobBean job;
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobBean getJob() {
		return job;
	}

	public void setJob(JobBean job) {
		this.job = job;
	}
	
	@Override
	public String execute() throws Exception {
		UserDAO dao = new UserDAO();
		job = dao.getJobDetail(id);
		
		return SUCCESS;
	}
	
}
