package polymorphism;

public class Customer {

	// field
	private int customerID; // 고객 아이디
	private String customerName; // 고객 이름
	protected String customerGrade; // 고객 등급
	int bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립 비율



	// constructors
	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
		/* 메서드 initCustomer(); 으로 대체
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		 */
	}



	// method getter/setter
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}

	// method
	public int calcPrice(int price) { // 보너스 포인트 적립, 지불가격 계산 메서드
		// 보너스 포인트 계산 == bonusPoint + (price * bonusRatio) --> 보너스 포인트는 가격의 1%씩 적립됨
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() { // 고객 정보를 반환하는 메서드 --> ( String --> void / return --> Sysout ) 가능
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	private void initCustomer() { // this 의 생성자에서만 호출하는 메서드이므로 private 선언
		// 기존 멤버 변수의 초기화 부분을 메서드로 설정
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

}
