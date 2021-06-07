package hiding;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		// studentLee.studentName = "이상원"; // sutdent클래스의 멤버변수 studentName의 접근권한이 private라서 오류 발생
		studentLee.setStudentName("이상원"); // set() 메서드를 활용해 private변수에 접근 가능
		
		System.out.println(studentLee.getStudentName());
		
	}

}
