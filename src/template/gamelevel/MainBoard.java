package template.gamelevel;

public class MainBoard {
	public static void main(String[] args) {

		// Player의 멤버변수(field)가 PlayerLevel 이기 때문에 Player. 에 대한 값들은 참조자료형(클래스형)이 PlayerLeverl 이여야 한다.
		
		Player player = new Player(); // 처음 생성하면 BeginnerLevel
		player.play(1); // templateMethod(jump 횟수 --> 반복문)

		//		AdvancedLevel aLevel = new AdvancedLevel();
		// 참조자료형(클래스형)이 PlayerLevel인 AdvancedLevel 생성 --> AdvancedLevel은 PlayerLevel을 상속한다.
		player.upgradeLevel(new AdvancedLevel());
		player.play(1); // templateMethod(jump 횟수 --> 반복문)

		//		SuperLevel sLevel = new SuperLevel();
		// 참조자료형(클래스형)이 PlayerLevel인 SuperLevel 생성 --> SuperLevel은 PlayerLevel을 상속한다.
		player.upgradeLevel(new SuperLevel());
		player.play(1); // templateMethod(jump 횟수 --> 반복문)
	}

}
