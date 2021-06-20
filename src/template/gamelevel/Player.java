package template.gamelevel;

public class Player {
	private PlayerLevel level; // PlayerLevel의 인스턴스를 level로 정의

	// default constructors --> 처음 생성되면 BeginnerLevel로 시작하며 레벨 메시지 출력
	public Player() {
		// 참조자료형(클래스형)이 PlayerLevel인 BeginnerLevel 생성 --> BeginnerLevel은 PlayerLevel을 상속한다.
		level = new BeginnerLevel(); // --> PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage(); // BeginnerLevel에 대한 showLevelMessage()
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) { // PlayerLevel을 상속받는 클래스에 대한 인스턴스 생성
		this.level = level; // 현재 자신의 level을 매개변수로 받은 인스턴스로 변경하고 레벨 메시지 출력
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); // PlayerLevel의 템플릿 메서드 go() 호출. 매개변수 count는 반복문 점프횟수
	}

}
