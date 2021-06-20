package polymorphism;

import java.util.ArrayList;
import java.util.List;

/* AnimalTest1 에서 생성된 클래스라서 현재 클래스에서 오류
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
 */

public class AnimalTest {

	List<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅");
		aTest.testCasting();
	}

	public void addAnimal() {
		// aniList 에 추가되면서 Animal 형으로 형 변환
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for(Animal ani : aniList) {
			// 배열 요소를 ani 에 각각 대입 --> 대입된 요소들(Human, Tiger, Eagle)에 대한 move() 메서드 호출
			ani.move(); // 각 클래스의 재정으된 move() 가 호출됨
		}
	}

	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);

			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else System.out.println("지원되지 않는 형 입니다.");
		}
	}



}
