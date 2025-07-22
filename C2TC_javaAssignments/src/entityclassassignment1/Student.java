package entityclassassignment1;

public class Student {
	
	    public String name;
	    public int rollNumber;
	    public String department;

	    public Student(String name, int rollNumber, String department) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.department = department;
	    }

	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Department: " + department);
	        System.out.println();
	    }
	
}
