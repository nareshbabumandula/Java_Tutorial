package oops;

public class ECE {

	int noofStudents=60;
	
	public void calHighestPercentage()
	{
		System.out.println("Hightest percentage in ECE group is : " + 89);
	}
	
	public void verifyECEFees()
	{
		System.out.println("ECE fee is 25000 per annum");
	}
	
	public void verifyPassPercentageinECE()
	{
		System.out.println("Pass percentage in ECE is : " + 80);
	}
	
	public void MathematicsSession()
	{
		System.out.println("ECE, CSE and EEE batch students should attend the mathematics class");
	}

	
	public static void main(String[] args) {
		ECE ec = new ECE();
		ec.calHighestPercentage();

	}

}
