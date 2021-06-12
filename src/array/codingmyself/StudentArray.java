package array.codingmyself;

public class StudentArray {
	public static void main(String[] args) {
		
		Student[] studentArray = {
			new Student(1001, "James"),
			new Student(1002, "Tomas"),
			new Student(1003, "Edward")
		};
		
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i].showStudentInfo();
		}
	}

}
