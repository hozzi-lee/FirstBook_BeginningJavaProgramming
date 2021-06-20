package witharraylist;

import java.util.ArrayList;
import java.util.List;

import polymorphism.Customer;
import polymorphism.VIPCustomer;

public class CustomerTest {
	public static void main(String[] args) {

		List<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer(10010, "이순신"));
		customerList.add(new Customer(10020, "신사임당"));
		customerList.add(new GoldCustomer(10030, "홍길동"));
		customerList.add(new GoldCustomer(10040, "이율곡"));
		customerList.add(new VIPCustomer(10050, "김유신", 12345));

		System.out.println("=== 고객 정보 출력 ===");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println();

		System.out.println("=== 할인율과 보너스 포인트 계산 ===");
		//		int price = 10000; --> 가격 10,000원 price 대입
		for (Customer customer : customerList) {
			//			int cost = customer.calcPrice(price); --> 할인율이 적용된 price 를 cost에 대입
			System.out.println(customer.getCustomerName() + "님이 " + customer.calcPrice(10000) + "원 지불하셨습니다."); // customer.calcPrice(10000) --> cost 로 대체 가능
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}

}
