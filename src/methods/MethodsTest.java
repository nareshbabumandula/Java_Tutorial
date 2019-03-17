package methods;

public class MethodsTest {

	//Class variable/Instance - A variable which is declared inside a class and outside a method
	int a=10; // State or Characteristics or Attributes or data members
	int b=20;
	static int e=30; //Global variable or static variables
	
	
	/**
	 * @Desc This method is used for adding two numbers
	 * @Name Addition
	 * @Input NA
	 * @Output NA
	 * @author NareshBabu
	 * @DateModified
	 */
	public void Addition()
	{
		int d=100; // Local variable
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}

	//Method with return type integer
	public int Substraction()
	{
		int c=a-b;
		System.out.println("Substraction of a and b is : " + c);
		return c;
	}
	
	//Method with arguments/parameters a and b and return type integer c
	public int Multiplication(int a, int b)
	{
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
		return c;
	}
	
	//Method without any return type
	public void Division()
	{
		int c=b/a;
		System.out.println("Division of a and b is : " + c);
	}
	
	//Method with arguments/parameters a and b
	public void Modulus(int a, int b)
	{
		int c=b%a;
		System.out.println("Modulus of a and b is : " + c);
	}
	

	public static void main(String[] args) {
		//Syntax for creating an object for a class

		//Classname object/instance name = new Constructor name();
		MethodsTest at = new MethodsTest();
		at.Addition();
		int x = at.Substraction();
		System.out.println("Return value of method Substraction is : " + x);
		int a1 = at.Multiplication(100,200);
		System.out.println("Return value/output of method Multiplication is : " + a1);
		at.Division();
		at.Modulus(10, 30);
		System.out.println(at.a);
		System.out.println(at.b);
		System.out.println(e);
	
	}

}
