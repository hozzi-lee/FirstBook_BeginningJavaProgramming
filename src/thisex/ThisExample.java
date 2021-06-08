package thisex;

class BirthDay {

	// field
	private int day;
	private int month;
	private int year;



	// constructors



	// method getter/setter
	public void setYear(int year) { // 태어난 연도를 지정하는 메서드
		this.year = year; // main()의 bDay.year == this.year
	}
	public int getYear() {
		return year;
	}
	
	public void printThis() { // this 출력 메서드
		System.out.println(this); // System.out.println(bDay);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000); // 태어난 연도를 2000으로 지정
		System.out.println(bDay); // 참조 변수 출력
		bDay.printThis(); // this 출력 메서드 호출
		
		/* 출력 값
		thisex.BirthDay@26f0a63f
		thisex.BirthDay@26f0a63f
		 */
	}
}
