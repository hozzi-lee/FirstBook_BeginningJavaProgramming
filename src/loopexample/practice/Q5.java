package loopexample.practice;

public class Q5 {
	public static void main(String[] args) {
		
		// 반복문과 조건문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요.
		/*
				*
			  * * *
			* * * * *
		  * * * * * * *
		    * * * * *
		      * * *
		        * 
  		*/
		
		// 생각 더 해보자..
		int lineCount = 7;  
		int spaceCount = lineCount / 2 +1;
		int starCount = 1;
		
		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print(" * ");
			}

			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			} else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}

		
	}

}
