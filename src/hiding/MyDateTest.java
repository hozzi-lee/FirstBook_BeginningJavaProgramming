package hiding;

public class MyDateTest {
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setMonth(2);
		date.setDay(29);
		date.setYear(2021);
		System.out.println(date.toString());
	}

}
