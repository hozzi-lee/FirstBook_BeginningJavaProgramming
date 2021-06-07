package classpart;

public class StudentTest2 {
	public static void main(String[] args) {

		Student student1 = new Student(); // 첫 번째 학생 생성(인스턴스 생성)
		student1.studentName = "안연수"; // 멤버변수(필드) 사용

		Student student2 = new Student(); // 두 번째 학생 생성(인스턴스 생성)
		student2.studentName = "안승연"; // 멤버변수(필드) 사용

		// 참조 변수 값 출력
		System.out.println(student1);
		System.out.println(student2);

		/* 출력 결과 --> 힙 메모리(heap memory)의 인스턴스 주소 값 출력
		 --> 클래스이름@주소값 --> 코드(hash code) 값 이라고도 한다
		classpart.Student@26f0a63f
		classpart.Student@4926097b
		 */
	}

}
