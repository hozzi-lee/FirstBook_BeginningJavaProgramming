package practice.class1;

public class Q4_MyDateTest {
	public static void main(String[] args) {

		Q4_MyDate date1 = new Q4_MyDate(30, 2, 2000);
		System.out.println(date1.isValid());
		System.out.println();

		Q4_MyDate date2 = new Q4_MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		System.out.println();

	}

}
