package staticex;

public class Student {

	// field
	public static int serialNum = 1000; // static변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;



	// constructors



	// method getter/setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}

