package ifexample;

import java.util.Scanner;

public class MinuteReview3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();

		char grade;
		/*
		if ( score >= 50 ) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		 */

		// 바꿔보기
		grade = ( score >= 50 ) ? 'A' : 'B';

		System.out.println(grade);

		sc.close();
	}

}
