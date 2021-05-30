package operator;

public class OperationExQuestion {
	public static void main(String[] args) {

		// Q1. 다음 소스 코드의 빈칸을 채워 보세요.
		int myAge = 23; // myAge 변수에 값23을 대입할 때 사용하는 연산자 --> =(대입연산자)
		int teacherAge = 38; // 4Byte자료형int 변수이름teacherAge 변수값38 --> 초기화 

		boolean value = (myAge > 25); // 1Byte자료형boolean 변수이름value 변수값조건식myAge(23)>25 --> 초기화
		System.out.println(value); // false

		System.out.println(myAge <= 25); // myAge(23)이 25보다 작거나 같으면 true, 크면 false 출력 --> true
		System.out.println(myAge == teacherAge); // myAge 변수 값과 teacherAge 변수 값이 같은지 비교하는 연산자 --> ==(관계연산자) false

		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F'; // 조건식이 참인 경우와 거짓인 경우 다른 결과 값을 출력하는 연산자 --> ? :(조건연산자)

		System.out.println(ch); // F

		// Q2. 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
		int num;
		num = -5 + 3 * 10 / 2; // -5 + (3 * 10 / 2;) 가독성을 위해 괄호 --> -5 + 15 == 10
		System.out.println(num); // 10

		// Q3. 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
		int num1 = 10;

		System.out.println(num1); // 10 --> 초기화 값 출력
		System.out.println(num1++); // 10 --> 기존 num1 대입 후 1 증가
		System.out.println(num1); // 11 --> 10에서 1 증가된 값
		System.out.println(--num1); // 10 --> num1(11)에서 1 감소 후 대입

		// Q4. 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
		int num01 = 10;
		int num02 = 20;
		boolean result;

		result = ( ( num01 > 10 ) && ( num02 > 10 ) ); // 앞의 조건식이 False이기 때문에 값은 False
		System.out.println(result); // False
		result = ( ( num01 > 10 ) || ( num02 > 10 ) ); // 뒤의 조건식이 True이기 때문에 값은 True
		System.out.println(result); // True
		System.out.println(!result); // 마지막으로 설정된 result값 True의 반대 False

		// Q5. 다음 코드가 수행될 때 출력되는 값을 적어 보세요.
		int num11 = 2;
		int num12 = 10;
		// 비트 연산자
		System.out.println(num11 & num12); // 2 --> 둘 다 1이여야 1
		System.out.println(num11 | num12); // 10 --> 하나만 1이여도 1
		System.out.println(num11 ^ num12); // 8 --> 둘다 1이면 0
		System.out.println(~num11); // 1 1 1 1 1 1 0 1 --> -3 --> 1은 0으로, 0은 1로 (양수는 음수로, 음수는 양수로)

		// Q6. 다음 코드가 순서대로 수행될 때 출력되는 값을 적어 보세요.
		int num8 = 8;

		System.out.println(num8 += 10); // num8 = num8 + 10 == 18
		System.out.println(num8 -= 10); // num8 = num8 - 10 == 8
		System.out.println(num8 >>= 2); // num8 = num8 >> 2 == 2
	}

}
