package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		
		// Company.getInstance(instance = new Company();)
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
