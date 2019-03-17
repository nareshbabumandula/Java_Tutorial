package oops;

public class EEE extends ECE{

	int noofStudents=50;

	public void calHighestPercentage()
	{
		System.out.println("Hightest percentage in EEE group is : " + 89);
	}

	public void verifyEEEFees()
	{
		System.out.println("EEE fee is 30000 per annum");
	}
	
	public void verifyEEEFees(String Reservation)
	{
		System.out.println("EEE fee is 1000 per annum for : " + Reservation);
	}
	
	public void verifyEEEFees(String Reservation, int StudentID)
	{
		
		if (Reservation.equalsIgnoreCase("SC")) {
			System.out.println("EEE fee is 10000 per annum for : " + Reservation+ " " + StudentID);
		}
		else if(Reservation.equalsIgnoreCase("BC"))
		{
			System.out.println("EEE fee is 25000 per annum for : " + Reservation+ " " + StudentID);
		}
		else if(Reservation.equalsIgnoreCase("OC"))
		{
			System.out.println("EEE fee is 50000 per annum for : " + Reservation+ " " + StudentID);
		}
		
	}

	public void verifyPassPercentageinEEE()
	{
		System.out.println("Pass percentage in EEE is : " + 80);
	}

	public static void main(String[] args) {
		EEE ee = new EEE();
		ee.MathematicsSession();
		System.out.println(ee.noofStudents);
		ee.verifyEEEFees();
	}

}
