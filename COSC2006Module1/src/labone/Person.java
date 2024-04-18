package labone;

public class Person {

	private final int ID;
	private String name;
	
	// 2-arg Constructor
	public Person(int id, String name) {
		super();
		this.ID = id;
		this.name = name;
	}

	// Getter ID
	public int getId() {
		return ID;
	}

	// Getter Name
	public String getName() {
		return name;
	}

	// Setter Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String print() {
		return "Student[id=" + getId() + ", name=" + getName() + "]";
	}
	
	
	
}
