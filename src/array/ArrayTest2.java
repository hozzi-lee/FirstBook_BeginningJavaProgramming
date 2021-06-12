package array;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		double[] data = new double[5]; // double[5]인 주소값을 따라갔더니 double[]형이다.
		
		data[0] = 10.0; // 첫 번째 요소에 값 10.0대입
		data[1] = 20.0; // 두 번째 요소에 값 20.0대입
		data[2] = 30.0; // 세 번째 요소에 값 30.0대입
		
		for (int i = 0; i < data.length; i++ ) { // data.length --> 전체 배열 길이(5)만큼 반복
			System.out.println(data[i]);
		}
		
		
	}

}
