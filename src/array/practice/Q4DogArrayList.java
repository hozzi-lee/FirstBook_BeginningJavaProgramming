package array.practice;

import java.util.ArrayList;
import java.util.List;

public class Q4DogArrayList {
	public static void main(String[] args) {

		/*
		Q4에서 DogTestArrayList를 만들어 멤버 변수로 ArrayList를 사용합니다.
		Dog인스턴스를 5개 생성하여 ArrayList에 추가하고 ArrayList의 정보를 출력하는 코드를 작성하세요.
		 */

		List<Q4Dog> dogList = new ArrayList<Q4Dog>();
		
		dogList.add(new Q4Dog());
		dogList.add(new Q4Dog());
		dogList.add(new Q4Dog());
		dogList.add(new Q4Dog());
		dogList.add(new Q4Dog());
		
		dogList.get(0).setName("흥부");
		dogList.get(0).setType("A");
		dogList.get(1).setName("밥풀");
		dogList.get(1).setType("B");
		dogList.get(2).setName("제비");
		dogList.get(2).setType("C");
		dogList.get(3).setName("박씨");
		dogList.get(3).setType("D");
		dogList.get(4).setName("금은보화");
		dogList.get(4).setType("E");
		
		for ( Q4Dog dog : dogList ) {
			System.out.println(dog.showDogInfo());
		}
		
		
	}
}
