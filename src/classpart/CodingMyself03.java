package classpart;

public class CodingMyself03 {

	/* 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
	 --> 주문 내용을 출력해 보세요.

		주문 번호: 201803120001
		주문자 아이디: abc123
		주문 날짜: 2018년 3월 12일
		주문자 이름: 홍길순
		주문 상품 번호: PD0345-12
		배송 주소: 서울시 영등포구 여의도동 20번지
	 */
	
	public static void main(String[] args) {
		
		CodingMyself03_classShop order = new CodingMyself03_classShop();
		
		order.setOrderNum(201803120001l);
		order.setOrderID("abc123");
		order.setOrderDate("2018년 3월 12일");
		order.setOrderName("홍길순");
		order.setGoodsNum("PD0345-12");
		order.setOrderAddress("서울시 영등포구 여의도동 20번지");
		
		System.out.println(order.toString());
		System.out.println();
		
		System.out.println("Order Number: " + order.getOrderNum());
		System.out.println("Orderer ID: " + order.getOrderID());
		System.out.println("Order Date: " + order.getOrderDate());
		System.out.println("Orderer Name: " + order.getOrderName());
		System.out.println("Goods Number: " + order.getGoodsNum());
		System.out.println("Orderer Address: " + order.getOrderAddress());
	}

}
