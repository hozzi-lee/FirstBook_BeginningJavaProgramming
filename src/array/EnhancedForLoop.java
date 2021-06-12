package array;

public class EnhancedForLoop { // Enhanced(향상된) for문

	public static void main(String[] args) {

		String[] strArray = {
				"Java",
				"Android",
				"C",
				"JavaScript",
				"Python"
		};

		for (String lang : strArray) { // 변수(lang)에는 배열(strArray)의 각 요소가 대입됨
			System.out.println(lang);
		}

		// 1분복습 - int형 배열의 요소값을 int형 변수 number에 대입
		int[] numArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int number : numArray) {
			System.out.println(number);
		}
	}

}
