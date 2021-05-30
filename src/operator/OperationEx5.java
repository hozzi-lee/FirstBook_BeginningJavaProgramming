package operator;

public class OperationEx5 {
	public static void main(String[] args) {
		int num = 0B00000101; // 5를 8비트 2진수로 나타냄
		System.out.println(num); // 5

		System.out.println(num << 2); // 20
		System.out.println(num >> 2); // 1
		System.out.println(num >>> 2); // 1

		System.out.println(num); // 5 --> num값에 대입하지 않고 출력으로만 연산자를 사용해서 num값은 처음 초기화값
		
		num = num << 2; // num값을 새로 초기화
		System.out.println(num); // 20
		
		// 1분 복습 - 연산자들을 우선순위가 높은 순으로 배치해 보세요.
		// &&, ++, +=, == // 논리, 단항, 대입, 관계
		// 우선순위 - ++(단항) -> ==(관계) -> &&(논리) -> +=(대입)
		
	}

}
