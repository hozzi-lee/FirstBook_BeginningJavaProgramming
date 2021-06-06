package classpart;

public class Student { // class: 클래스를 만드는 예약어 // Student: 클래스 이름(java파일명)
	// 멤버 변수(필드)
	int studentID; // 학번
	String studentName; // 학생 이름
	int grade; // 학년
	String address; // 사는 곳

	// 메서드
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address); // 이름, 주소 출력
	}
}
