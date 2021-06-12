package array;

public class MinuteReview1 {
	public static void main(String[] args) {

		// minuteReview1 - 1
		// int형 배열 arr를 다음처럼 초기화 했을때 연산의 결과 값이
		int[] arr = new int[] { 3, 6, 9, 12 };

		// 1. arr[0] + 2 --> 3 + 2 == 5
		// 2. arr[1] + arr[2] --> 6 + 9 == 15
		// 3. arr[4] - 3 --> null - 3 == error



		// minuteReview1 - 2
		// ArrayTest.java에 int sum = 0; 을 추가하여 모든 요소의 합을 구하는 식을 추가하여 코드는 수정하시오.
		int[] num =  new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int sum = 0;

		for ( int i = 0; i < num.length; i++ ) {
			sum += i;
		}
		System.out.print("int[]의 모든 요소의 합: " + sum);
	}

}
