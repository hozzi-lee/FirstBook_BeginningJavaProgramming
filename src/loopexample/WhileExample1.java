package loopexample;

public class WhileExample1 {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) { // 조건식(num값이 10보다 작거나 같은 동안)
			sum += num; // 합계를 뜻하는 sum에 num은 더해준다
			num++; // num이 1씩 증가함 --> 11까지
		}
		System.out.println("1부터 10까지의 합은: " + sum);
		
		
		
	}

}
