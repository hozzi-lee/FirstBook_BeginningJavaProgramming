package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신"); // default 생성자 삭제 후 customerID, customerName 를 포함한 생성자 작성/호출
		//		customerLee.setCustomerID(10010);
		//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000; // new Customer() 에 대한 보너스포인트 1000 대입
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 123); // default 생성자 삭제 후 customerID, customerName, agentID 를 포함한 생성자 작성/호출
		//		customerKim.setCustomerID(10020);
		//		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000; // new VIPCustomer() 에 대한 보너스포인트 10000 대입
		System.out.println(customerKim.showCustomerInfo());
	}

}
