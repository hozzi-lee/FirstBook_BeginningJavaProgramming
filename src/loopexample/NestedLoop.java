package loopexample;

public class NestedLoop {
	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for ( dan = 2; dan <= 9; dan++ ) { // 2단부터 9단까지 반복하는 외부 반복분
			for ( times = 1; times <= 9; times++ ) { // 각 단에서 1~9를 곱하는 내부 반복문
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println( ); // 한 줄 띄워서 출력
		}
		
		
		// 1분 복습 - 위 예제를 수정해 3단에서 7단까지만 출력해 보세요
		for ( dan = 3; dan <= 7; dan++ ) { // 2단부터 9단까지 반복하는 외부 반복분
			for ( times = 1; times <= 9; times++ ) { // 각 단에서 1~9를 곱하는 내부 반복문
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println( ); // 한 줄 띄워서 출력
		}
		
	}

}
