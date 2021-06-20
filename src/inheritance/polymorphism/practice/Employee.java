package inheritance.polymorphism.practice;

public class Employee {
	// field
	public String name;
	public String grade;

	// constructors
	public Employee(String name) {
		this.name = name;
	}

	// 상위클래스 Employee 에 생성자에 매개변수가 있으므로 하위클래스에 필수적으로 생성 해줘야 한다.
	public class Engineer extends Employee {
		// field
		private String skillset;

		// constructors
		public Engineer(String name) {
			super(name);
		}

		// method getter/setter
		public String getSkillset() {
			return skillset;
		}

		public void setSkillset(String skillset) {
			this.skillset = skillset;
		}
	}

}
