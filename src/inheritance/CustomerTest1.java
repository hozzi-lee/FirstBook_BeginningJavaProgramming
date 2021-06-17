package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000; // new Customer() 에 대한 보너스포인트 1000 대입
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000; // new VIPCustomer() 에 대한 보너스포인트 10000 대입
		System.out.println(customerKim.showCustomerInfo());
	}

}
