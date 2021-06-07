package classpart;

public class StudentTest1 {
	public static void main(String[] args) {

		Student student1 = new Student(); // 첫 번째 학생 생성(인스턴스 생성)
		student1.studentName = "안연수"; // 멤버변수(필드) 사용
		System.out.println(student1.getStudentName()); // 메서드 게터 사용

		Student student2 = new Student(); // 두 번째 학생 생성(인스턴스 생성)
		student2.studentName = "안승연"; // 멤버변수(필드) 사용
		System.out.println(student2.getStudentName()); // 메서드 게터 사용
	}

}
