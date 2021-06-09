package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
		/*
		학생마다 각각 다른 학생 카드(serialNum)가 발급됩니다.
		학생 카드 번호는 학번(studentID)에 100을 더한 값입니다.
		Student3 클래스를 만들어 학생 카드 번호 멤버 변수를 추가하고,
		학생이 생성될 때마다 학생 카드 번호를 부여합니다.
		StudentTest6 클래스를 만들어 학생 두 명을 생성합니다.
		두 학생의 카드 번호를 출력해 보세요.
		 */

		Student3 stu01 = new Student3();
		stu01.setStudentName("이호진111");
		System.out.println(stu01.getStudentName());
		System.out.println(Student3.getStudentID());
		System.out.println(Student3.getSerialNum());
		System.out.println();


		Student3 stu02 = new Student3();
		stu02.setStudentName("이호진222");
		System.out.println(stu02.getStudentName());
		System.out.println(Student3.getStudentID());
		System.out.println(Student3.getSerialNum());
		System.out.println();


		Student3 stu03 = new Student3();
		stu03.setStudentName("이호진333");
		System.out.println(stu03.getStudentName());
		System.out.println(Student3.getStudentID());
		System.out.println(Student3.getSerialNum());
		System.out.println();
	}
}
