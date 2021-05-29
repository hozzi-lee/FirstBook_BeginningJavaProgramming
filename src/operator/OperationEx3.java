package operator;

public class OperationEx3 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ( ( num1 = num1 + 10 ) ) < 10 && ( ( i = i + 2 ) < 10); // 20 < 10 && 4 < 10 --> False && True == False
		System.out.println(value); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2
		// && (논리 곱) 은 앞 항에서 이미 false가 나왔기 때문에 결과값이 뒤 항의 결과에 관계없이 false가 출력된다
		// 따라서 뒤 항의 i 값은 초기화 되지 않고 num1 변수만 초기화됨

		value = ( ( num1 = num1 + 10 ) > 10 ) || ( ( i = i + 2 ) < 10 ); // 30 > 10 || 4 < 10 --> True || True == True
		System.out.println(value); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2
		// || (논리 합) 은 앞 항에서 이미 true가 나왔기 때문에 결과값이 뒤 항의 결과에 관계없이 true가 출력된다
		// 따라서 뒤 항의 i 값은 초기화 되지 않고 num1 변수만 초기화됨

		// 1분 복습 - 3개 변수의 출력값 예상하여 적기
		int num2 = 5;
		int i2 = 10;
		// || (논리 곱)은 하나만 참(true)이면 결과값 == true
		boolean value2 = ( ( num2 = num2 * 10 ) > 45 ) || ( ( i2 = i2 - 5 ) < 10 ); // 50 > 45 || 5 < 10 --> True || True == True
		System.out.println(value2); // true
		System.out.println(num2); // 50
		System.out.println(i2); // 10
		// || (논리 합) 은 앞 항에서 이미 true가 나왔기 때문에 결과값이 뒤 항의 결과에 관계없이 true가 출력된다
		// 따라서 뒤 항의 i 값은 초기화 되지 않고 num1 변수만 초기화됨
	}

}
