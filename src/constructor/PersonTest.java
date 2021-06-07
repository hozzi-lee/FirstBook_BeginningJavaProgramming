package constructor;

public class PersonTest {
	public static void main(String[] args) {
		
		Person personKim = new Person(); // Person(): 생성자
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		System.out.println(personKim.toString());
		
		System.out.println();
		
		Person personLee = new Person("이호진", 170.7f, 62.3f);
		System.out.println(personLee.toString());
	}

}
