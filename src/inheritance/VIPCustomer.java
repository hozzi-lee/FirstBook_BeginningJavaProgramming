package inheritance;

public class VIPCustomer extends Customer { // VIPCustomer(하위클래스_일반적인 개념) 클래스는 Customer(상위클래스_구체적인 개념) 클래스를 상속 받음

	// field
	private int agentID; // VIP 고객 상담원 아이디
	double saleRatio; // 할인율



	// constructors
	public VIPCustomer() {
		// customerGrade = "VIP"; 상위클래스(Customer)에서 private 이므로 오류 발생
		customerGrade = "VIP"; // 상위클래스(Customer)에서 protected 로 변경
		bonusRatio = 0.05; // 포너스 포인트 적립 비율 5%
		saleRatio = 0.1; // 할인율 10%
	}



	// method getter/setter
	public int getAgentID() {
		return agentID;
	}

	// method

}
