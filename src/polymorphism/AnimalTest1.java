package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다."); // AnimalTest 에서 사용
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다."); // AnimalTest 에서 사용
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다."); // AnimalTest 에서 사용
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {

		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human()); // --> Animal a00 = new Human();
		aTest.moveAnimal(new Tiger()); // --> Animal a01 = new Tiger();
		aTest.moveAnimal(new Eagle()); // --> Animal a02 = new Eagle();
	}

	public void moveAnimal(Animal animal) { // 매개변수의 자료형이 상위클래스
		animal.move(); // 재정의된 메서드가 호출됨
	}


}
