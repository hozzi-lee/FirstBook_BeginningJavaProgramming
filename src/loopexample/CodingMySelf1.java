package loopexample;

public class CodingMySelf1 {
	public static void main(String[] args) {
		// for문과 변수를 사용하여 '안녕하세요1, 안녕하세요2•••, 안녕하세요10'까지 차례로 출력하는 프로그램을 작성해 보세요.
		
		for ( int i = 1; i <= 10; i++) { // 초기화; 조건식; 증감식
			System.out.println("안녕하세요" + i);
		}
		
		// while문
		int i = 1; // 초기화
		while ( i <= 10) { // 조건식
			System.out.println("안녕하세요" + i);
			i++; // 증감식
		}
	}

}
