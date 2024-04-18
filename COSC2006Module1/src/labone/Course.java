package labone;

import java.util.ArrayList;

public class Course {

	private final int MAX_ENROLLED_STUDENTS = 5;
	private String[] students = new String[MAX_ENROLLED_STUDENTS];
	private int enrolled;
	private Instructor instructor;
	private String code;
	private String name;
	
	Course() {
		// Default no-arg Constructor
	}
	
	// Method to add a student to the course, checking if they can be enrolled first
	public void enroll(Student student) {

		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[enrolled] = student.toString();
			}
		}
		enrolled++;
		
	}
	
	// Method to remove a student from the course, check a) there are students in the course, 
	// and b) that the student is in the course
	public void unenroll(Student student) {
		enrolled--;
		// Loop through students array
		for (int i = 0; i < students.length; i++) {
	       if (students[i] == student.getName()) {
	    	   
	    	   // Write over the array minus the value of the student's name
	    	   for (int j = i; i < students.length - 1; i++) {
	    		   students[i] = students[i + 1];
	    		}
	    	   
	       }
	        	
	    }
	
	}
	
	// Method to assign the student a grade in the course and change their avg
	public void assignGrade(Student student, double grade) {
		student.setAverage((student.getAverage() + grade) / 2);
	}

	// Get students in course
	public String[] getStudents() {
		return students;
	}

	// Get number enrolled in course
	public int getEnrolled() {
		return enrolled;
	}

	// Get the instructor for the course
	public Instructor getInstructor() {
		return instructor;
	}

	// Set the instructor for the course
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	// Get instructor name
	public String getInstructorName() {
		String instName = "" + instructor;
		ArrayList<String> name = new ArrayList<>();
		
		for (String e : instName.split("=|\\,"))
			name.add(e);
		
		String[] array = name.toArray(new String[6]);
		
		return array[0+3];
	}

	// Get the course code
	public String getCode() {
		return code;
	}

	// Set the course code
	public void setCode(String code) {
		this.code = code;
	}

	// Get the course name
	public String getName() {
		return name;
	}

	// Set the course name
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Course[code=" + getCode() + ", name=" + getName() + ", instructor=" + getInstructorName() + ", enrolled=" + getEnrolled() + "]";
	}
	
}
