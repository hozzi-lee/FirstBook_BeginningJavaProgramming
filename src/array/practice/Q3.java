package array.practice;

public class Q3 {
	public static void main(String[] args) {
		
		// 배열 길이가 5인 정수형 배열을 선언하고, 1~10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요.
		int[] iArrayEven = new int[5];
		int sum = 0;
		for ( int i = 1; i < 11; i++ ) {
			if ( (i % 2) == 0 ) {
				for ( int j = 0; j < iArrayEven.length;) {
					iArrayEven[j] = i;
					sum += iArrayEven[j];
					System.out.println(iArrayEven[j]);
					break;
				}
			}
		}
		System.out.println("iArrayEven의 짝수의 합은: " + sum);
	}
}
