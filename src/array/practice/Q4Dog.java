package array.practice;

public class Q4Dog {

	// field
	private String name;
	private String type;



	// constructors

	// method getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	// method
	@Override
	public String toString() {
		return "Q4Dog [name=" + name + ", type=" + type + "]";
	}

	public String showDogInfo() {
		return name + ", " + type;
	}
}
