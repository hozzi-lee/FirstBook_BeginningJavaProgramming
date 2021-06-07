package classpart;

public class Student { // class: 클래스를 만드는 예약어 // Student: 클래스 이름(java파일명)
	// 멤버 변수(필드)
	int studentID; // 학번
	String studentName; // 학생 이름
	int grade; // 학년
	String address; // 사는 곳

	
	// 메서드 게터
	// 학생의 이름을 반환 하는 메서드
	public String getStudentName() { // String: 반환값(멤버변수_this.studentName) // 멤버 변수 값을 반환하는 것이라 매개변수가 없다.
		return this.studentName; // 예약어 return 
	}
	
	// 메서드 세터
	public void setStudentName(String name) { // 반환값이 없으므로 void // 학생 이름을 매개변수로 전달
		this.studentName = name; // 매개변수 값을 멤버변수에 대입
	}
	
	
	// 메서드
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
	
	
	
	public static void main(String[] args) { // main() 함수 --> Student클래스 내부에 생성
		Student studentAhn = new Student(); // Student 클래스 생성 // new: 메모리에 올린다. --> new Student(): Student클래스의 Student()생성자를 메모리에 올린다
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
