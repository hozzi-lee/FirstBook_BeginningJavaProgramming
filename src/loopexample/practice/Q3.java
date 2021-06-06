package loopexample.practice;

public class Q3 {
	public static void main(String[] args) {

		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요. 힌트: break문 사용

		// 내가 코딩한 none break문
		int dan;
		int times;
		int result;

		for ( dan = 2; dan < 10; dan ++) {
			for ( times = 1; times <= dan; times++ ) {
				result = dan * times;
				System.out.println(dan + " X " + times + " = " + result);
			}
			System.out.println();
		}

		/* 기존정답 --> 답은 같음
		int dan;
		int times;
		int result;

		for ( dan = 2; dan < 10; dan ++) {
			for ( times = 1; times < 10; times++ ) {
				if ( times > dan ) {
					break;
				}
				result = dan * times;
				System.out.println(dan + " X " + times + " = " + result);
			}
			System.out.println();
		}
		 */

	}

}
