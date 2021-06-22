package finalex;

public class Constant {
	int num = 10;
	final int NUM = 100; // int NUM 에 100대입 --> 상수로 선언 --> 상수(final)값은 대부분 대문자로 작성

	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
//		cons.NUM = 200; 상수(final)로 선언한 NUM 에 200을 대입하여 오류 발생

		System.out.println(cons.num); // 50
		System.out.println(cons.NUM); // 100

	}

}
