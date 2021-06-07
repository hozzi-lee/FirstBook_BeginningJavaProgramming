package classpart;

public class CodingMyself02_classMan {

	// 멤버 변수(필드)
	private int age;
	private String name;
	private boolean married;
	private int childrenNum;


	// 메서드 게터세터
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	public boolean getMarried() {
		return married;
	}

	public void setChildrenNum(int childrenNum) {
		this.childrenNum = childrenNum;
	}
	public int getChildrenNum() {
		return childrenNum;
	}



	// 메서드 일반
	@Override
	public String toString() {
		return "CodingMyself02_class [age=" + age + ", name=" + name + ", married=" + married + ", childrenNum="
				+ childrenNum + "]";
	}

}
