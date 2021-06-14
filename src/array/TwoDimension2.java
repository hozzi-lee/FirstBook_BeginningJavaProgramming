package array;

public class TwoDimension2 {
	public static void main(String[] args) {

		int[][] array = new int[2][3]; // 2행 3열 이차원 배열 선언

		for(int i = 0; i < array.length; i++) { // array.length --> 행 길이
			for(int j = 0; j < array[i].length; j++) { // array[i].length --> 열 길이
				System.out.println(array[i][j]); // 출력값은 모두 0
			}
			System.out.println();
		}
		System.out.println(array.length); // 행 길이
		System.out.println(array[0].length); // 1행의 열 길이 ::::: array[1].length --> 2행의 열 길이
	}

}
