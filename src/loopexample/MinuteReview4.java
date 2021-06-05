package loopexample;

public class MinuteReview4 {
	public static void main(String[] args) {

		// 1부터 더했을 때 그 합이 500이 넘는 자연수는 얼마인가요?
		// 다음 코드의 빈칸을 채우고 직접 프로그램을 실핼해 답을 확인해 보세요.

		int sum = 0;
		int num;

		for ( num = 1; ; num++ ) {
			sum += num;
			if ( sum > 500 ) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
