package graphql.ilde;

public class Employee {
	
	private String name;
	private String project;
	
	public Employee (String name, String project){
		this.name = name;
		this.project = project;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}

}
