package staticex;

public class Student3 {

	// field
	private static int serialNum;
	private static int studentID = 20210000;
	private String studentName;	



	// constructors
	public Student3() {
		studentID++;
		serialNum = studentID + 100;
	}



	// method getter/setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

	public static int getStudentID() {
		return studentID;
	}
	public static void setStudentID(int StudentID) {
		Student3.studentID = StudentID;
	}

}
