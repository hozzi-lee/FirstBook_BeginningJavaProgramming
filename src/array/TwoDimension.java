package array;

public class TwoDimension {
	public static void main(String[] args) {

		int[][] array = {{1, 2, 3}, {4, 5, 6}}; // 배열 선언과 동시에 초기화
		System.out.println(array.length); // 배열길이 --> 2( 1 - {1, 2, 3}, 2 - {4, 5, 6})
		System.out.println("----------");

		for(int i = 0; i < array.length; i++) { // i --> 첫 번째 배열{1, 2, 3}일때, 두 번째 배열{4, 5, 6}일때
			for(int j = 0; j < array[i].length; j++) { // j --> i일때 요소 개수 == 3으로 동일
				System.out.println(array[i][j]); // i == 0일때 j == 1, 2, 3 ::::: i == 1일때 j == 4, 5, 6
			}
			System.out.println(); // 행 출력 후 개행
		}

		//
		System.out.println();
		System.out.println();
		//

		// 나 혼자 코딩! (이차원 배열 연습) 알파벳 소문자를 2글자씩 13줄(13행 2열)로 출력하는 프로그램을 이차원 배열로 구현해 보세요.
		System.out.println("---------- codingMyself ----------");
		System.out.println((int)'A' + ", " + (int)'Z'); // 알파벳 아스키값 확인 A == 65, Z == 90
		// 배열 요소값을 char''형으로 써도 됐지만 그냥 해봤음
		char[][] alphabetArray = {
				{65, 66},
				{67, 68},
				{69, 70},
				{71, 72},
				{73, 74},
				{75, 76},
				{77, 78},
				{79, 80},
				{81, 82},
				{83, 84},
				{85, 86},
				{87, 88},
				{89, 90}
		};
		for(int i = 0; i < alphabetArray.length; i++) {
			for(int j = 0; j < alphabetArray[i].length; j++) {
				System.out.println(alphabetArray[i][j]);
			}
			//			System.out.println();
		}
	}

}
