package operator;

public class OperationEx1 {
	public static void main(String[] args) {
		/*
		int mathScore = 90; // 수학점수 90
		int engScore = 70; // 영어점수 70

		int totalScore = mathScore + engScore; // 4Byte 자료형 int totalScore에 수학점수 + 영어점수 --> 160 대입
		System.out.println(totalScore); // 160 출력

		double avgScore = totalScore / 2.0; // tatalScore를 2로 나누어서 평균값을 8Byte 자료형 double에 대입 --> 나머지가 생기는 경우가 있으므로 평균갑은 double형으로 초기화.
		System.out.println(avgScore); // 160 / 2.0 == 80.0 출력
		 */

		// 1분 복습 - 국어점수(korScore) 추가 후 점수값 입력(초기화), 평균값을 구하도록 예제 수정하기
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;

		int totalScore = mathScore + engScore + korScore; // 90 + 70 + 100 == 260
		System.out.println(totalScore);

		double avgScore = totalScore / 3.0; // 평균값 = 260 / 3.0
		System.out.println(avgScore); // 86.66666666666667


	}

}
