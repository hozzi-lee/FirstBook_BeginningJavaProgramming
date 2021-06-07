package classpart;

public class CodingMyself03_classShop {

	// 멤버 변수(필드)
	private long orderNum;
	private String orderID;
	private String orderDate;
	private String orderName;
	private String goodsNum;
	private String orderAddress;


	// 메서드 게터세터
	public void setOrderNum(long orderNum) {
		this.orderNum = orderNum;
	}
	public long getOrderNum() {
		return this.orderNum;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderID() {
		return this.orderID;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderName() {
		return this.orderName;
	}

	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsNum() {
		return this.goodsNum;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderAddress() {
		return this.orderAddress;
	}


	// 메서드 일반
	@Override
	public String toString() {
		return "CodingMyself03_classShop [orderNum=" + orderNum + ", orderID=" + orderID + ", orderDate=" + orderDate
				+ ", orderName=" + orderName + ", goodsNum=" + goodsNum + ", orderAddress=" + orderAddress + "]";
	}
}
