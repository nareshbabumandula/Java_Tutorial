package oops;

public class MethodOverloadTest {
	
	public void Addition(int a, int b)
	{
		int c= a+b;
		System.out.println("Addition of integer a and b in super class is : " + c);
	}
	
	public void Addition(double a, double b)
	{
		double c= a+b;
		System.out.println("Addition of double a and b is : " + c);
	}

	public void Addition(int a, int b, int c)
	{
		int d= a+b+c;
		System.out.println("Addition of integer a, b and c is : " + d);
	}
	
	
	public static void main(String[] args) {
		MethodOverloadTest overload = new MethodOverloadTest();
		overload.Addition(12.23434, 23.54546546);


	}

}
