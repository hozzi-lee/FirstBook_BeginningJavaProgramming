package interfaceex;

public class CompleteCalc extends Calculator {

	public int times(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR; // 나누는 수(num2)가 0인 경우에 Calc.ERROR 반환
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

	// 나 혼자 코딩!
	public int square(int num) {
		return (int) Math.pow(num, 2);
	}

}
