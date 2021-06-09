package staticex;

public class Student2 {

	// field
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;



	// constructors
	public Student2() { // default 생성자
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
	
	// static method or (class method)
	public static int getSerialNum() { // serialNum의 get() 메서드
		int i = 10; // 메서드 내부에서 선언한 변수 == 지역 변수 --> 메서드 내부{}에서만 사용 가능
		// studentName = "이지원"; 오류발생 --> 클래스 메서드 내부에는 인스턴스 변수 사용 불가능 --> 인스턴스 되기전에 static 메서드가 메모리에 올라가기 때문에 내부에 인스턴스 변수가 존재할 수 없다.
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) { // serialNum의 set() 메서드
		Student2.serialNum = serialNum;
	}

}
