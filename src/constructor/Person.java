package constructor;

public class Person {

	// 멤버 변수(필드)
	String name;
	float height;
	float weight;
	
	
	// 생성자
	// 매개변수를 받아서 생성자를 생성했을 경우 default생성자는 작성 하지 않으면 적용 되지 않는다.
	public Person() {
		// 생성하지 않아도 java컴파일러가 자동으로 제공하는 dafault constructor
	}
	
	public Person(String pname) {
		// 사람의 이름을 매개변수로 입력받아서 Person클래스를 생성하는 생성자
		this.name = pname;
	}
	
	// 나 혼자 코딩! - 이름, 키, 몸무게를 매개변수로 받는 생성자를 추가하세요.
	// 그리고 PersonTest.java 클래스에서 추가된 생성자를 사용하여 인스턴스를 생성해 보세요.
	public Person(String pname, float pheight, float pweight) {
		this(pname);
		this.height = pheight;
		this.weight = pweight;
	}
	
	public String toString() {
		return "Person [name=" + this.name + ", height=" + this.height + ", weight=" + this.weight + "]";
	}
}
