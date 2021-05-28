package chapter2;

public class TypeInference {
	public static void main(String[] args) {

		// 지역 변수 자료형 추론은 java10 부터 사용 가능
		// 현재 사용중인 버전은 8.0 버전

		//		var i = 10; --> int i = 10으로 컴파일됨
		//		var j = 10.0; --> double j = 10.0으로 컴파일됨
		//		var str = "hello"; // String str = "hello"으로 컴파일됨
		int i = 10;
		double j = 10.0;
		String str = "hello";

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";
		//		str = 3; --> str변수는 String형으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음
		System.out.println(str); // "hello" 이후 최기화 된 "test"값 출력

	}

}
