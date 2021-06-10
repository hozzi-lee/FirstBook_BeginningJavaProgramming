package singleton;

// 데이터영역(static)
// Company instance = new Company();
// getInstance(instance = new Company();)

public class Company {

	private static Company instance = new Company(); // 유일무이한 인스턴스 생성

	// constructors
	private Company() { // default constructors는 public이므로 private로 생성
		// super(); 생략됨 --> Object();
	}



	// method
	public static Company getInstance() { // 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
		if ( instance == null ) {
			instance = new Company();
		}
		return instance; // 유일무이한 인스턴스 반환
	}

}
