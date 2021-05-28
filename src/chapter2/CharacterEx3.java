package chapter2;

public class CharacterEx3 {
	public static void main(String[] args) {

		int a = 65;
		int b = -66;

		char a2 = 65; // 65의 char(문자형) --> A
		//		char b2 = -66; --> 문자형에 음수를 넣을 수 없음. 오류로 인한 주석처리.
		
		System.out.println((char)a); // A
		System.out.println((char)b); // ?
		System.out.println(a2); // A
	}

}
