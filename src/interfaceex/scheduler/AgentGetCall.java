package interfaceex.scheduler;

public class AgentGetCall implements Scheduler {

	// 나 혼자 코딩!
	// 상담원이 본인이 필요할 때 가져오는 정책
	public void getNextCall() {
		System.out.println("상담원이 다음 전화 요청");
	}

	public void sendCallToAgent() {
		System.out.println("상담원이 전화 상담을 가져갔습니다");
	}
}
