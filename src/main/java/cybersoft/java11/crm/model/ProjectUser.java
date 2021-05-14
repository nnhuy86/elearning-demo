package cybersoft.java11.crm.model;

public class ProjectUser {
	private int id;
	private int user_id;
	private String join_date;
	private String role_desciption;

	/*Contructor*/
	public ProjectUser(int id, int user_id, String join_date, String role_desciption) {

		this.id = id;
		this.user_id = user_id;
		this.join_date = join_date;
		this.role_desciption = role_desciption;
	}
	public ProjectUser() {
		this.id = -1;
		this.user_id = -1;
		this.join_date = "";
		this.role_desciption = "";
	
	}

}
