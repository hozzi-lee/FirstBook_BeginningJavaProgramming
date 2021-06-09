package staticex;

public class Student1 {

	// field
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;



	// constructors
	public Student1() { // default 생성자
		serialNum++; // 학생이 생성될 때마다 증가
		this.studentID = serialNum;	// 증가된 값을 학번 인스턴스 변수에 부여
	}



	// method getter/setter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}



}
