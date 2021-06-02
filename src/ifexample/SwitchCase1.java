package ifexample;

import java.util.Scanner;

public class SwitchCase1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("순위: ");
		int ranking = sc.nextInt();
		char medalColor;

		switch(ranking) {
		case 1: medalColor = 'G';
		break;

		case 2: medalColor = 'S';
		break;

		case 3: medalColor = 'B';
		break;

		default: medalColor = 'A';
		}

		System.out.println(ranking + "등 메달 색상은 " + medalColor + " 입니다.");
		
		System.out.println("======================================================");

		System.out.print("몇월의 일 수 를 알고 싶습니까: ");
		int month = sc.nextInt();
		int day;

		switch(month) {
		case 4: case 6: case 9: case 11:
			day = 30;
			break;

		case 2:
			day = 28;
			break;

		default: 
			day = 31;
		}

		System.out.println(month + "월은 "+ day +"일까지 있습니다.");

		sc.close();

	}

}
