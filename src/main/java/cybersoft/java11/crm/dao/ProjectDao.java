package cybersoft.java11.crm.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.crm.config.MySqlConnection;
import cybersoft.java11.crm.model.Project;

public class ProjectDao {
	
	public List<Project> findAll(){
		List<Project> listProject = new LinkedList<Project>();
		
		Connection connection = MySqlConnection.getConnection();
	
//		Statement statement;
//		try {	
//			String query = "select id, name, description, start_date, end_date"
//					+ ",create_user_id from project";
//			statement = connection.createStatement();
//			ResultSet results = statement.executeQuery(query);
//		    while(results.next()) {
////		    	Project newProject = new Project();
//		    	newProject.setId(results.getInt("id"));
//		    	newProject.setName(results.getString("name"));
//		    	newProject.setDescription(results.getString("description"));
//		    	newProject.setStart_date(results.getString("start_date"));
//		    	newProject.setEnd_date(results.getString("end_date"));
//		    	newProject.setCreate_user_id(results.getInt("create_user_id"));
//		    	
//		    	listProject.add(newProject);}} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return listProject;
		
	}

}
;