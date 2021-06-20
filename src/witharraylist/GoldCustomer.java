package witharraylist;

import polymorphism.Customer;

public class GoldCustomer extends Customer {
	
	// field
	double saleRatio;
	
	
	
	// constructors
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	
	
	// method
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
