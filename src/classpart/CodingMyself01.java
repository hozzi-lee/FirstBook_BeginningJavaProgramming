package classpart;

public class CodingMyself01 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum1 = add(num1, num2); // add() 함수 호출
		System.out.println(num1 + " + " + num2 + " = " + sum1 + "입니다");
		int sum2 = minus(num1, num2); // minus() 함수 호출
		System.out.println(num1 + " - " + num2 + " = " + sum2 + "입니다");
		int sum3 = multiply(num1, num2); // multiply() 함수 호출
		System.out.println(num1 + " X " + num2 + " = " + sum3 + "입니다");
		double sum4 = division(num1, num2); // division() 함수 호출
		System.out.println(num1 + " / " + num2 + " = " + sum4 + "입니다");
	}

	// 메서드
	// add 함수
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; // 결과 값 반환
	}

	// minus 함수
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result; // 결과 값 반환
	}

	// multiply 함수
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result; // 결과 값 반환
	}

	// division 함수
	public static double division(double n1, double n2) {
		double result = n1 / n2;
		return result; // 결과 값 반환
	}

}