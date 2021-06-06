package loopexample.practice;

public class Q2 {
	public static void main(String[] args) {

		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요. 힌트: continue문 사용

		//내 코딩
		int dan;
		int times;
		int result;

		for ( dan = 1; dan < 10; dan++ ) {
			if ( dan % 2 == 0 ) {
				for ( times = 1; times < 10; times++ ) {
					result = dan * times;
					System.out.println(dan + " X " + times + " = " + result);
				}
			} else {
				continue;
			}
			System.out.println();
		}
	}

}
