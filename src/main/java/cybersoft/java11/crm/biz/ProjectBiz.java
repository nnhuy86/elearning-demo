package cybersoft.java11.crm.biz;

import java.util.List;

import cybersoft.java11.crm.dao.ProjectDao;
import cybersoft.java11.crm.model.Project;


public class ProjectBiz {
	private ProjectDao dao;
	
	public ProjectBiz() {
		dao = new ProjectDao();
	}
	
	public List<Project>findAll(){
		return dao.findAll();
	}

}
