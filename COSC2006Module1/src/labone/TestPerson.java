package labone;

public class TestPerson {

	public static void main(String[] args) {
		// Create 7 students with different id numbers and names. Print each to console.
		Student student1 = new Student(111, "Nettie");
		Student student2 = new Student(112, "Ron");
		Student student3 = new Student(113, "Herman");
		Student student4 = new Student(114, "George");
		Student student5 = new Student(115, "Patty");
		Student student6 = new Student(116, "Harold");
		Student student7 = new Student(117, "Barb");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		System.out.println(student6.toString());
		System.out.println(student7.toString());

		// Create an instructor with a different id and name to the students. Print.
		Instructor instructor = new Instructor(200, "Vashu", "Computer Science");
		System.out.println("\n" + instructor.toString());
		
		// Create two courses
		Course course1 = new Course();
		course1.setName("COSC course 1");
		course1.setCode("COSC1234");
		Course course2 = new Course();
		course2.setName("COSC course 2");
		course2.setCode("COSC2345");
		
		// Assign 5 of the 7 students to the first course and the other 2 to the second course. Print.
		course1.enroll(student1); // Course1
		course1.enroll(student2);
		course1.enroll(student3);
		course1.enroll(student4);
		course1.enroll(student5);
		course2.enroll(student6); // Course2
		course2.enroll(student7);
		System.out.println("\n" + course1.toString());
		System.out.println(course2.toString());
		
		// Set the student's averages to any values. Print.
		student1.setAverage(59);
		student2.setAverage(78);
		student3.setAverage(98);
		student4.setAverage(65);
		student5.setAverage(81);
		student6.setAverage(92);
		student7.setAverage(87);
		System.out.println("\n" + student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		System.out.println(student6.toString());
		System.out.println(student7.toString());
		
		// Assign the instructor to both courses. Print.
		course1.setInstructor(instructor);
		course2.setInstructor(instructor);
		System.out.println("\n" + course1.toString());
		System.out.println(course2.toString());
		
		// Unenroll two students from the course. Print.
		course1.unenroll(student3);
		course1.unenroll(student5);
		System.out.println("\n" + course1.toString());
		
		// Assign all students grades. Print.
		course1.assignGrade(student1, 70);
		course1.assignGrade(student2, 91);
		course1.assignGrade(student3, 67);
		course1.assignGrade(student4, 70);
		course1.assignGrade(student5, 83);
		course2.assignGrade(student6, 84);
		course2.assignGrade(student7, 78);
		System.out.println("\n" + student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		System.out.println(student5.toString());
		System.out.println(student6.toString());
		System.out.println(student7.toString());
		
	}

}
