package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 123); // default 생성자 삭제 후 customerID, customerName, agentID 를 포함한 생성자 작성/호출
		//		customerKim.setCustomerID(10020);
		//		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

	}

}
