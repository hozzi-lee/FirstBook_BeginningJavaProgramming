package array;

public class BookArray2 {
	public static void main(String[] args) {
		
		// Book[] library = new Book[5]; // 기생성한 Book.class 형으로 객체 배열 생성
		
		Book[] library = {
			new Book("태백산맥", "조정래"), // == library[0] = new Book();
			new Book("데미안", "헤르만 헤세"), // == library[1] = new Book();
			new Book("어떻게 살 것인가", "유시민"), // == library[2] = new Book();
			new Book("토지", "박경리"), // == library[3] = new Book();
			new Book("어린왕자", "생텍쥐페리") // == library[4] = new Book();
		};
		
		for (int i = 0; i < library.length; i++) { // Book instance fields
			library[i].showBookInfo();
		}
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // toString() 값 출력 == 주소값
		}
	}

}
