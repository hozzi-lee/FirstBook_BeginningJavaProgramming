package ifexample;

public class IfExample1 {
	public static void main(String[] args) {

		int age = 7; // 4Byte자료형int 변수이름age 변수값7 --> 초기화
		if(age >= 8) { // if (조건식)이 참이면 {}내부 코드 실행, 거짓이면 else {}내부 코드 실행
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
