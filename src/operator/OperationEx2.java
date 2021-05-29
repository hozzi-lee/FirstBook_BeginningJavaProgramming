package operator;

public class OperationEx2 {
	public static void main(String[] args) {

		/*
		int gameScore = 150; // 변수(항) 값에 150 대입(초기화)

		int lastScore1 = ++gameScore; // 기존 변수(항) 값(150)에 1을 더한 후 새로운 변수(항)에 대입 --> lastScore1 == 151
		System.out.println(lastScore1); // 151

		int lastScore2 = --gameScore; // 변수 lastScore1에 의해서 변수 gameScore의 값은 151이 됐음. lastScore2에 gameScore(값 == 151) 1을 뺀 수를 대입 --> 150
		System.out.println(lastScore2); // 150
		 */

		// 1분 복습 - 위의 예제에서 8행과 11행의 증가·감소 연산자를 피연산자 앞에서 뒤로 바꾼 후 출력하기

		int gameScore = 150; // 변수(항) 값에 150 대입(초기화)

		int lastScore1 = gameScore++; // 기존 변수(항) 값(150)을 lastScore1에 대입 후 1을 더한다 --> lastScore == gameScore
		System.out.println(lastScore1); // 150 --> lastScore1에 150이 대입된 후 gameScore의 값이 1증가 했기 때문에 150이 출력됨. 이후 gameScore를 출력하면 151 출력
		System.out.println(gameScore); // 151

		int lastScore2 = gameScore--; // 기존 변수(항) 값(151)을 lastScore2에 대입 후 1을 뺀다 --> lastScore2 == gameScore(151)
		System.out.println(lastScore2); // 151 --> lastScore2에 151이 대입된 후 gameScore의 값이 1감소 했기 때문에 151이 출력됨. 이후 gameScore를 출력하면 150 출력
		System.out.println(gameScore); // 150
	}

}
