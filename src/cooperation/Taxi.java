package cooperation;

public class Taxi {
	// 나 혼자 코딩!
	/*
	Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다.
	택시 요금은 10,000원을 지불했습니다. 이 과정을 구현해 보세요.
	 */
	
	// field
	String taxiNumber;
	int passengerCount;
	int money;
	
	
	
	// constructors
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	// method
	public void take(int money) { // 승객이 택시에 탄 경우를 구현한 메서드
		this.money += money; // 택시 수입 증가
		passengerCount++; // 택시 승객 수 증가
	}
	
	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
