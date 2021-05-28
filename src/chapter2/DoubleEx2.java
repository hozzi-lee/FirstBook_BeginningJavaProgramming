package chapter2;

public class DoubleEx2 {
	public static void main(String[] args) {
		
		double dnum = 1;
		
		for ( int i = 0; i < 10000; i++ ) {// i값이 0에서 시작하여 9999까지 반복 --> 10,000번
			dnum = dnum + 0.1; // 기존 dnum값 1에서 + 0.1 = dnum 1.1 ... --> 1에 0.1을 10,000번 더해주면 1001.0
		}
		System.out.println(dnum); // 결과 값은 1001.0000000000159 --> 부동 소수점 방식의 오류
	}

}
