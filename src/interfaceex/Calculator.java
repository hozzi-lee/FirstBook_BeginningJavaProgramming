package interfaceex;

public abstract class Calculator implements Calc {

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 상속받은 추상메서드(times, divide)를 구현하지 않고 생략해서 현재 클래스는 추상클래스가 됨

}
