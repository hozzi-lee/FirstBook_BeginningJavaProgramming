package ifexample;

import java.util.Scanner;

public class CodingMySelf1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		char grade;
		
		if ( score < 60 ) {
			grade = 'F';
		} else if ( score < 70 ) {
			grade = 'D';
		} else if ( score < 80 ) {
			grade = 'C';
		} else if ( score < 90 ) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		System.out.println(grade + "학점 입니다.");
		System.out.println("문의사항은 000)000-0000으로 연락 주세요.");
		
		sc.close();
	}

}
