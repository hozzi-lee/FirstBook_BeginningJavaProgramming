package array;

public class ArrayTest {
	public static void main(String[] args) {

		int[] num =  new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// 배열의 요소[]가 0번째부터 시작되는지 Test

		// [1]부터 시작 --> 2, 3, 4, 5, 6, 7, 8, 9, 10
		for ( int i = 1; i < num.length; i++ ) {
			System.out.print(num[i] + " ");
		}

		System.out.println();

		// [0]부터 시작 --> 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		for ( int i = 0; i < num.length; i++ ) {
			System.out.print(num[i] + " ");
		}

	}

}
