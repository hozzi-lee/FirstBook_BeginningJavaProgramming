package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		
		byte bNum = 10; // 1Byte 자료형 byte, 변수이름 bNum 지정, 변수값 10 대입
		int iNum = bNum; // 4Byte 자료형 int, 변수이름 iNum 지정, 변수값 bNum 대입 --> byte형 값이 int형 변수로 대입됨
		
		System.out.println(bNum); // byte 자료형 10 출력
		System.out.println(iNum); // byte 자료형 bNum을 int 자료형으로 형 변환 하여 10 출력
		
		int iNum2 = 20; // 4Bbyte 자료형 int, 변수이름 iNum2 지정, 변수값 20 대입
		float fNum = iNum2; // 4Byte 자료형 float, 변수이름 fNum 지정, 변수값 iNum2 대입
		
		System.out.println(iNum); // 4Byte 자료형 int 값 10 출력
		System.out.println(fNum); // 4Byte 자료형 int 값 20을 float로 형 변환 하여 20.0 출력
		
		double dNum; // 8Byte 자료형 double, 변수이름 dNum 지정
		dNum = fNum + iNum; // 8Byte 자료형 double dNum에 fNum(4Byte float형 20.0) + iNum(4Byte int형 10)
		System.out.println(dNum); // 30.0 출력 (서로 다른 자료형이 합해지기 위해 iNum이 int 10에서 float 10.0으로 형 변환)
		
		// 1분 복습
		char ch1 = 'A';
		System.out.println((int)ch1); // 'A'에 해당하는 ASCII값 출력 --> char자료형 출력값 ch1앞에 (int)형으로 명시적(강제) 형 변환
		
		int ch2 = 67;
		System.out.println((char)ch2); // 정수값에 해당하는 문자 출력 --> int자료형 출력값 ch2앞에 (char)형으로 명시적(강제) 형 변환
	}

}
