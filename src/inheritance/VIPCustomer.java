package inheritance;

public class VIPCustomer extends Customer { // VIPCustomer(하위클래스_일반적인 개념) 클래스는 Customer(상위클래스_구체적인 개념) 클래스를 상속 받음

	// field
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율



	// constructors
	/*
	public VIPCustomer() {
		// customerGrade = "VIP"; 상위클래스(Customer)에서 private 이므로 오류 발생
		customerGrade = "VIP"; // 상위클래스(Customer)에서 protected 로 변경
		bonusRatio = 0.05; // 포너스 포인트 적립 비율 5%
		saleRatio = 0.1; // 할인율 10%
		System.out.println("VIPCustomer() 생성자 호출"); // 클래스 생성할 때 콘솔 출력문
	}
	 */
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		//		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}



	// method getter/setter
	public int getAgentID() {
		return agentID;
	}

	// method
	@Override
	public int calcPrice(int price) { // 보너스 포인트 적립, 지불가격 계산 메서드
		// 보너스 포인트 계산 == bonusPoint + (price * bonusRatio) --> 보너스 포인트는 가격의 5%씩 적립됨
		bonusPoint += price * bonusRatio;
		// VIPCustomer 은 10% 할인 된 가격을 반환한다. == price 에서 - 10%를 뺀 90% 가격
		return price - (int)(price * saleRatio);
	}

}
