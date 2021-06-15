package arraylist;

import java.util.ArrayList;

public class Student {
	
	// field
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // = new ArrayList<Subject>(); --> 가능
	
	
	
	// constructors
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	
	
	// method
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); // Subject 생성
		subject.setName(name); // 과목 이름 추가
		subject.setScorePoint(score); // 점수 추가
		subjectList.add(subject); // 배열에 저장
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점을 " + total + " 입니다.");
	}

}
