package loopexample.practice;

public class Q4 {
	public static void main(String[] args) {
		
		// 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		/*
				*
			  * * *
			* * * * *
		  * * * * * * *
		*/
		
		// 내 코딩
		for ( int j = 1; j < 8; j++ ) {
			if ( j % 2 != 0 ) {
				for ( int star = 1; star <= j; star++ ) {
					System.out.print(" * ");
				}
			} else {
				System.out.println();
			}
		}
		System.out.println("\n");

			
		// 정답
		int lineCount = 4;  
		int spaceCount = lineCount / 2 +1;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print("   ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print(" * ");
			}
//			for(int j = 0; j < spaceCount; j++) {
//				System.out.print("  ");
//			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
		
	}

}
