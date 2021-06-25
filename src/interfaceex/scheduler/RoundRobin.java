package interfaceex.scheduler;

public class RoundRobin implements Scheduler {

	// 상담원 한 명씩 동일하게 상담 업무 배분
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}

	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다");
	}

}
