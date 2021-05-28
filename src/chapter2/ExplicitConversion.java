package chapter2;

public class ExplicitConversion {
	public static void main(String[] args) {

		double dNum1 = 1.2; // 8Byte 자료형 double
		float fNum2 = 0.9f; // 4Byte 자료형 float

		int iNum3 = (int)dNum1 + (int)fNum2; // 4Byte 자료형 int iNum3 = (int)double dNum1 + (int)float fNum2 --> 1.2 = 1, 0.9 = 0 --> iNum3 = 1 + 0 = 1 
		int iNum4 = (int)(dNum1 + fNum2); // 4Byte 자료형 int iNum4 = (int)(double dNum1 + float fNum2) --> (int)(1.2 + 0.9) --> 2.1 --> 2 == iNum4
		System.out.println(iNum3); // 1
		System.out.println(iNum4); // 2

		/* 연습문제
		Q1. 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 형 변환은 자동으로 이루어집니다.(예 / 아니오) --> 예
		Q2. 실수를 정수형 변수에 대입하는 경우에 형 변환이 자동으로 이루어지고, 소수점 이하 부분만 없어집니다.(예 / 아니오) --> 아니오
		Q3. 더 많은 실수를 표현하기 위해 가수부와 지수부로 비트를 나누어 표현하는 방식을 "부--" 이라고 합니다. --> 부동 소수점 방식
		Q4. 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
		Q5. '글' 이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 보세요.
		 */

		// 연습문제 - Q4 / Q5
		// Q4

		int iNum = 10;
		double dNum = 2.0;

		int num1 = (int)(iNum + dNum); // 또는 iNum + (int)dNum
		int num2 = (int)(iNum - dNum);
		int num3 = (int)(iNum * dNum);
		int num4 = (int)(iNum / dNum);
		
		System.out.println(num1); // 12
		System.out.println(num2); // 8
		System.out.println(num3); // 20
		System.out.println(num4); // 5

		// Q5

		char ch1 = '\uAE00'; // 유니코드 출력시 코드 앞에 /(역슬래시)u 작성
				System.out.println(ch1); // 글

	}

}
