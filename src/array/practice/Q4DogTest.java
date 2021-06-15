package array.practice;

public class Q4DogTest {
	public static void main(String[] args) {

		/*
		Q4Dog.class
		배열 길이가 5인 Dog[] 배열을 만든 후 Dog 인스턴스를 5개 생성하여 배열에 추가합니다.
		for문과 향상된 for문에서 Q4Dog.class의 showDogInfo() 메서드를 사용하여
		배열에 추가한 Dog 정보를 모두 출력하세요
		 */

		Q4Dog[] DogArray = {
				new Q4Dog(),
				new Q4Dog(),
				new Q4Dog(),
				new Q4Dog(),
				new Q4Dog()
		};

		DogArray[0].setName("흥부");
		DogArray[0].setType("A");

		DogArray[1].setName("밥풀");
		DogArray[1].setType("B");

		DogArray[2].setName("제비");
		DogArray[2].setType("C");

		DogArray[3].setName("박씨");
		DogArray[3].setType("D");

		DogArray[4].setName("금은보화");
		DogArray[4].setType("E");

		System.out.println("=== for문 ===");
		for ( int i = 0; i < DogArray.length; i++ ) {
			System.out.println(DogArray[i].showDogInfo());
		}

		System.out.println();

		System.out.println("=== Enhanced for문 ===");
		for ( Q4Dog dog : DogArray ) {
			System.out.println(dog.showDogInfo());
		}
	}
}
