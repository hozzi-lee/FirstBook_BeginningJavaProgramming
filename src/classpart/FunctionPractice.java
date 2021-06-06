package classpart;

public class FunctionPractice {

	int add (int num1, int num2) { // int: 함수 반환형, add: 함수 이름(함수 기능과 관련있게 임의로 작성), (): 매개변수
		int result;
		result = num1 + num2;
		return result; // return: 예약어(이 함수의 결과값을 반환합니다)
	}

	int getTenTotal() { // int: 함수 반환형, getTenTotal: 함수 이름(함수 기능과 관련있게 임의로 작성), (): 매개변수
		int i;
		int total = 0;
		for (i = 1; i <= 10; i++ ) {
			total = i;
		}
		return total; // 1부터 10까지 더한 값을 반환
	}
	
	void printGreeting(String name) { // void: 반환값이 없을때 사용
		System.out.println(name + "님 안녕하세요"); // 전달받은 매개변수 name을 사용하여 인사말 출력
		return; // 반환 값 없음. 작성 안해도 됨.
	}
	
	void divide(int num1, int num2) { // else값을 반환하기 위해서 void -> int로 써야 되지 않나...
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return; // 함수 수행을 종료하는 목적으로 사용가능. 반환값을 적지 않아도 된다.
		} else {
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result + "입니다.");
//			return result;
		}
	}
}
