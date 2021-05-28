package chapter2;

public class Constant {
	public static void main(String[] args) {

		final int MAX_NUM = 100; // 선언과 동시에 초기화
		final int MIN_NUM;

		MIN_NUM = 0; // 사용 전에 초기화. 초기화 하지 않으면 오류 발생.

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		// MAX_NUM = 1000; --> 상수 값을 변경 하였기 때문에 오류 발생

		/* 상수를 사용하면 편리한 경우
		
		final int MAX_STUDENT_NUM = 35;
		if ( count == MAX_STUDENT_NUM ) { . . . }
		while ( i < MAX_STUDENT_NUM ) { . . . }
		
		학생수는 바뀔 수 있기 때문에 반복문에 숫자 대신 상수값을 적어주면 초기화값만 바꿔주면 된다.
		 */
		
		// 1분 복습
		final int MY_AGE = 22; // 상수 MY_AGE를 선언하고 값 22를 대입함
		System.out.println(MY_AGE); // MY_AGE값을 출력함

	}

}
