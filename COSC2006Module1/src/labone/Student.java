package labone;

public class Student extends Person {
	
	private double average = 0;
	
	// 2-arg Constructor
	Student(int id, String name) {
		super(id, name);
	}

	// Get average
	public double getAverage() {
		return average;
	}

	// Set average
	public void setAverage(double average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "Student[id=" + getId() + ", name=" + getName() + ", GPA=" + getAverage() + "%]";
	}
	
}
