package thisex;

class Person {

	// field
	String name; // 접근 제어자(접근 권한) default
	int age; // 접근 제어자(접근 권한) default



	// constructors
	Person() { // 접근 제어자(접근 권한) default
		this("이름 없음", 1); // this를 사용해 Person(String, int) 생성자 호출
	}

	Person(String name, int age) { // 접근 제어자(접근 권한) default
		this.name = name;
		this.age = age;
	}



	// method
	Person returnItSelf() { // 접근 제어자(접근 권한) default
		return this; // this 반환 --> 반환형은 class명(Person)
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {

		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);

		Person p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p); // noName.returnItSelf()의 반환 값 출력 == System.out.println(noName.returnItSelf());
		System.out.println(noName); // 참조 변수 출력 == System.out.println(noName.returnItSelf());
	}

}
