package operator;

public class OperationEx4 {
	public static void main(String[] args) {

		// 1분 복습 - 다음 코드를 복합 대입 연산자를 사용해서 변경하기
		int num1 = 10;
		int num2 = 20;

		num1 = num1 + 5; // --> num1 += 5; --> 10 + 5 = 15
		System.out.println(num1);

		num1 = num1 * num2; // --> num1 *= num2; --> 15 * 20 = 300
		System.out.println(num1);


		// OperationEx4

		int fatherAge = 45;
		int motherAge = 47;

		char ch;
		ch = (fatherAge > motherAge ) ? 'T' : 'F'; // 조건식이 45 < 47 == false 이므로 : 앞(T)과 뒤(F)중에 뒤가 출력

		System.out.println(ch); // F

		// 1분 복습 - 조건 연산자를 사용하여 10이 짝수인 경우에는 true, 그렇지 않으면 false를 출력
		int num = 10;
		boolean isEven;

		isEven = ( ( num % 2 ) == 0 ) ? true : false;
		System.out.println(isEven);


	}

}
