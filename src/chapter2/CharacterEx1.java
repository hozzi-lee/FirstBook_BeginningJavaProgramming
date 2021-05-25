package chapter2;

public class CharacterEx1 {
	public static void main(String[] args) {
		// 1분 복습
		/* 다음 설명과 일치하는 자료형을 찾아 연결해 보세요.
		1. 4바이트 정수 자료형     2. 2바이트 문자 자료형     3. 8바이트 정수 자료형
		a. char     b. long     c. int
		정답 : 1 - c, 2 - a, 3 - b
		 */
		
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자에 해당하는 정수 값(ASCII CODE) 출력
		
		char ch2 = 66; // 정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3); // 문자 정수 값 출력
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력
		
		// 1분 복습
		char ch01 = 'Z'; // char 2바이트 문자자료형, ch01에 'Z'대입(초기화)
		System.out.println(ch01); // 문자 Z 출력 -> Z
		System.out.println((int)ch01); // Z를 정수(int)값(ASCII CODE)으로 출력 -> 90
		
		char ch02 = 38; // char 2바이트 문자자료형, ch02에 38대입(초기화)
		System.out.println(ch02); // 문자번호 38인 문자 출력 -> &
		
		int ch03 = 97; // int 4바이트 정수자료형, ch03에 97대입(초기화)
		System.out.println(ch03); // 97 출력 -> 97
		System.out.println((char)ch03); // 97을 char 문자형 정수값으로 변경 후 출력 -> a
		
		// 응용
		int ch00 = '?'; // integer자료형에 character '?' 대입
		System.out.println(ch00); // 해당 character에 대한 정수값 출력
	}

}
