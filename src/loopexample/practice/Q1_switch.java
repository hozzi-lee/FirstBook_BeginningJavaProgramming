package loopexample.practice;

import java.util.Scanner;

public class Q1_switch {
	public static void main(String[] args) {

		// operator값이 +, -, *, /인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch-case문을 사용해 작성해 보세요.
		// 예제
		int num = 10;
		int num2 = 2;
		//		char operator = '+';

		// 풀이
		Scanner scan = new Scanner(System.in);

		System.out.print("operator: ");
		char operator = scan.next().charAt(0);

		int result = 0;

		switch (operator) {
			case '+':
				result = num + num2;
				break;
			case '-':
				result = num - num2;
				break;
			case '*':
				result = num * num2;
				break;
			case '/':
				result = num / num2;
				break;
			default:
				System.out.println("연산자 오류입니다.");
		}
		System.out.println("값은 " + result + "입니다.");

		scan.close();
	}

}
