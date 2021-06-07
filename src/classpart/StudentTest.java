package classpart;

public class StudentTest {

	public static void main(String[] args) { // main() 함수 --> 외부 클래스(StudentTest)에 main()함수 생성
		Student studentAhn = new Student(); // Student 클래스 생성 // new: 메모리에 올린다. --> new Student(): Student()클래스를 메모리에 올린다
		studentAhn.studentName = "안승연";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}

