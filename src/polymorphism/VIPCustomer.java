package polymorphism;

public class VIPCustomer extends Customer { // VIPCustomer(하위클래스_일반적인 개념) 클래스는 Customer(상위클래스_구체적인 개념) 클래스를 상속 받음

	// field
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율



	// constructors
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}



	// method getter/setter
	public int getAgentID() {
		return agentID;
	}

	// method
	@Override
	public int calcPrice(int price) { // 보너스 포인트 적립, 지불가격 계산 메서드 재정의
		// 보너스 포인트 계산 == bonusPoint + (price * bonusRatio) --> 보너스 포인트는 가격의 5%씩 적립됨
		bonusPoint += price * bonusRatio;
		// VIPCustomer 은 10% 할인 된 가격을 반환한다. == price 에서 - 10%를 뺀 90% 가격
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() { // 고객정보 출력 메서드 재정의(super + this)
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}

}
