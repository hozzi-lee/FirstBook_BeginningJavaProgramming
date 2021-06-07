package hiding;

public class MyDate {

	// 멤버 변수(필드)
	private int day;
	private int month;
	private int year;


	// 생성자


	// 메서드 게터세터
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다.");
			} else {
				this.day = day;
			}
		}
	}
	public int getDay() {
		return this.day;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return this.month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return this.year;
	}	


	// 메서드 일반
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
