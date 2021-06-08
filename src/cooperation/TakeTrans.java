package cooperation;

public class TakeTrans {
	public static void main(String[] args) {

		/* 예제 코딩중 Alone Test
		Student student01 = new Student("이호진", 1990000000);
		Student student02 = new Student("이호진93", 1990000000);
		student01.showInfo();
		student02.showInfo();
		System.out.println();

		Bus bus152 = new Bus(152);
		Subway subway2 = new Subway("2호선");
		student01.takeBus(bus152);
		student01.takeSubway(subway2);
		student02.takeBus(bus152);
		student02.takeSubway(subway2);
		student01.showInfo();
		student02.showInfo();
		System.out.println();

		bus152.showInfo();
		subway2.showInfo();
		 */

		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		// 나 혼자 코딩!
		/*
		Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다.
		택시 요금은 10,000원을 지불했습니다. 이 과정을 구현해 보세요.
		 */
		Student studentEdward = new Student("Edward", 10500);
		Taxi taxi2021 = new Taxi("서울00가 2021");
		studentEdward.takeTaxi(taxi2021);
		studentEdward.showInfo();
		taxi2021.showInfo();
		
	}

}