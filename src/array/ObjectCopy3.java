package array;

public class ObjectCopy3 {
	public static void main(String[] args) {

		Book[] bookArray1 = {
				new Book("태백산맥", "조정래"),
				new Book("데미안", "헤르만 헤세"),
				new Book("어떻게 살 것인가", "유시민")
		};
		Book[] bookArray2 = {
				new Book(),
				new Book(),
				new Book()
		};

		System.out.println("=== copy bookArray1 to bookArray2 ===");
		//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName()); // bA2[i]번째 bookName 요소를 (bA1[i]번째 bookName의 리턴값) 으로 지정
			bookArray2[i].setAuthor(bookArray1[i].getAuthor()); // bA2[i]번째 author 요소를 (bA1[i]번째 author의 리턴값) 으로 지정
		}

		System.out.println("=== bookArray2 ===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); // bookArray1 배열이 복사됨
		}

		System.out.println();

		// bookArray1 배열의 첫 번째 요소 값 변경
		System.out.println("=== change elementValue[0] in bookArray1  ===");
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");

		System.out.println("=== bookArray1 ===");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); // 변경된 bookArray1 출력
		}

		System.out.println("=== bookArray2 ===");
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo(); // 인스턴스(주소값)가 다르므로 bookArray1 의 변경사항이 반영되지 않음
		}

	}

}
