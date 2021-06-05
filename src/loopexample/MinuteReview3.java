package loopexample;

public class MinuteReview3 {
	public static void main(String[] args) {
		
		// 1부터 100까지 수 중에서 3의 배수만 출력하는 코드를 완성해 보세요.
		for ( int num = 1; num <= 100; num++ ) {
			if ( num % 3 != 0 )
				continue;
				System.out.println(num);
		}
		
		/* 같은거
		for ( int num = 1; num <= 100; num++ ) {
			if ( num % 3 != 0 ) {
				continue;
			} else {
				System.out.println(num);
			}
		}
		*/
	}

}
