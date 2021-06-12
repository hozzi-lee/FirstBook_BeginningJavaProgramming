package array.codingmyself;

public class Student {

	// field
	private int studentID;
	private String name;



	// constructors
	public Student() {
		super();
	}

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}



	// method getter/setter
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getStudentID() {
		return studentID;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	// method
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}

}
