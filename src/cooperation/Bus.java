package cooperation;

public class Bus {
	
	// field
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 버스 수입
	
	
	
	// constructors
	public Bus(int busNumber) { // 버스 번호를 매개변수로 받는 생성자
		this.busNumber = busNumber;
	}
	
	
	
	// method
	public void take(int money) { // 승객이 버스에 탄 경우를 구현한 메서드
		this.money += money; // 버스 수입 증가
		passengerCount++; // 승객 수 증가
	}
	
	public void showInfo() { // 버스 정보를 출력하는 메서드
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}
