package array.practice;

public class Q2 {
	public static void main(String[] args) {

		// 206쪽의 알파벳 출력 예제에서 각 배열 요소 값을 대문자에서 소문자로 변환해 출력하세요
		char[] alphabets = new char[26];
		char ch = 'a';
		System.out.println((int)ch); // 'a' == 97

		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++; // 아스키 값으로 각 요소에 저장
		}

		for (int i = 0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		}
	}
}
