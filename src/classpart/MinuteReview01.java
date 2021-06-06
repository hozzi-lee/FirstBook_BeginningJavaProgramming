package classpart; // <-- package 선언

// 클래스 외부는 package 선언과 import 문장 외에 아무것도 선언하지 않습니다.

public class MinuteReview01 {
	
	// 사람 객체를 구현하는 Person 클래스를 만들고 이름, 나이, 성별을 멤버 변수로 정의해 보세요.
	public class Person { // 클래스 이름 대문자로 시작. 오류는 아니지만 개발자 사이에서 규칙
		String name; // 이름
		int age; // 나이
		char gender; // 성별
	}
}
