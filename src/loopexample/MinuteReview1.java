package loopexample;

public class MinuteReview1 {
	public static void main(String[] args) {
		
		// while문을 사용하여 1부터 50까지 더하는 프로그램 코딩해보기
		int num = 1;
		int sum = 0;
		
		while (num <= 50) {
			sum += num;
			num++;
		}
		System.out.println("1부터 50까지 합은" + sum + "입니다.");
	}

}
