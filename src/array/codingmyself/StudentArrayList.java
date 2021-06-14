package array.codingmyself;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {

		ArrayList<Student> stuArray = new ArrayList<Student>();

		stuArray.add(new Student(1001, "James"));
		stuArray.add(new Student(1002, "Tomas"));
		stuArray.add(new Student(1003, "Edward"));

		for(Student student : stuArray) {
			student.showStudentInfo();
		}
	}

}
