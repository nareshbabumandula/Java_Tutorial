package oops;

public class MethodOverrideTest extends MethodOverloadTest{
	
	public void Addition(int a, int b)
	{
		int c= a+b;
	}
		
	public static void main(String[] args) {
		MethodOverrideTest override = new MethodOverrideTest();
		override.Addition(10, 20);

	}

}
