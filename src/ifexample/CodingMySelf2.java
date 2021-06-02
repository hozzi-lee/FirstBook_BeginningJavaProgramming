package ifexample;

import java.util.Scanner;

public class CodingMySelf2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇층을 알고 싶습니까? ");
		int floor = sc.nextInt();

		/*
		String store;

		switch(floor) {
		case 1:
			store = "약국";
			break;

		case 2:
			store = "정형외과";
			break;

		case 3:
			store = "피부과";
			break;

		case 4:
			store = "치과";
			break;

		case 5:
			store = "헬스 클럽";
			break;
		}

		System.out.println(floor + "층은 " + store + "입니다.");
		 */

		switch(floor) {
		case 1:
			System.out.println(floor + "층은 약국 입니다.");
			break;

		case 2:
			System.out.println(floor + "층은 정형외과 입니다.");
			break;

		case 3:
			System.out.println(floor + "층은 피부과 입니다.");
			break;

		case 4:
			System.out.println(floor + "층은 치과 입니다.");
			break;

		case 5:
			System.out.println(floor + "층은 헬스클럽 입니다.");
			break;
			
		case -1:
			System.out.println(floor + "층은 지하주차장 입니다.");
			break;
		}

		sc.close();
	}

}
