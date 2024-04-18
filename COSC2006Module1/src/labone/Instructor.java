package labone;

public class Instructor extends Person {
	
	private String department;
	
	Instructor(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}
	
	// Get department
	public String getDepartment() {
		return department;
	}

	// Set department
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Instructor[id=" + getId() + ", name=" + getName() + ", department=" + getDepartment() + "]";
	}

}
