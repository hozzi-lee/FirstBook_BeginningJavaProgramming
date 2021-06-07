package practice.class1;

public class Q4_MyDate {

	// 멤버 변수(필드)
	private int day;
	private int month;
	private int year;
	private boolean isValid;


	// 생성자
	public Q4_MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


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

	public boolean isValid() {
		if (month == 2) {
			if (day < 1 || day > 28) {
				this.isValid = false;
				System.out.println("유효하지 않은 날짜입니다.");
			} else {
				this.isValid = true;
				System.out.println("유효한 날짜입니다.");
			}
		} else {
			this.isValid = true;
			System.out.println("유효한 날짜입니다.");
		}
		return isValid;
	}
}
