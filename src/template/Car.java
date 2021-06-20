package template;

public abstract class Car {

	// method
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// addCodingMyself
	public abstract void wiper();

	// template method
	final public void run() {
		startCar();
		drive();
		wiper(); // addCodingMyself
		stop();
		turnOff();
	}
}
