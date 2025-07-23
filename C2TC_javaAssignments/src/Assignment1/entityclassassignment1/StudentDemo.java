package Assignment1.entityclassassignment1;

public class StudentDemo {

	public static void main(String[] args) {
		
		        Student s1 = new Student("Arun", 101, "IT");
		        Student s2 = new Student("Beena", 102, "CSE");
		        Student s3 = new Student("Charan", 103, "ECE");

		        System.out.println("Student Details:");
		        s1.display();
		        s2.display();
		        s3.display();

	}

}
