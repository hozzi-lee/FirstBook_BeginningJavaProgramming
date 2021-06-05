package loopexample.practice;

import java.util.Scanner;

public class Q1_ifElse {
	public static void main(String[] args) {

		// operator값이 +, -, *, /인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성해 보세요.
		// 예제
		int num = 10;
		int num2 = 2;
		//		char operator = '+';

		// 풀이
		Scanner scan = new Scanner(System.in);

		int result = 0;
		System.out.print("operator: ");
		/*
		String operator = scan.next();

		if ( operator.equals("+") ) {
			result = num + num2;
		} else if ( operator.equals("-") ) {
			result = num - num2;
		} else if ( operator.equals("*") ) {
			result = num * num2;
		} else if ( operator.equals("/") ) {
			result = num / num2;
		} else {
			System.out.println("연산자 오류입니다.");
		}

		System.out.println("값은 " + result + "입니다.");
		 */

		char operator = scan.next().charAt(0);

		// if-else문
		if ( operator == '+' ) {
			result = num + num2;

		} else if ( operator == '-' ) {
			result = num - num2;

		} else if ( operator == '*' ) {
			result = num * num2;

		} else if ( operator == '/' ) {
			result = num / num2;

		} else {
			System.out.println("연산자 오류입니다.");
		}

		System.out.println("값은 " + result + "입니다.");

		scan.close();
	}
}
