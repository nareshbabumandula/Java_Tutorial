package expections.demo;

public class UnCheckedExceptionTest {

	public void Division()
	{
		try {
			int a=10;
			int b=0;
			String Names[] = {"naresh","ajay"};
			System.out.println(Names[2]);
			int c = a/b;
			System.out.println(c);
			
		}

	catch (ArithmeticException a) {
		System.out.println("This is arithmatic exception");
	}
	catch(ArrayIndexOutOfBoundsException ai)
	{
		System.out.println("This is ArrayIndexOutOfBoundsException exception");
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}

	}

	public void Marks()
	{
		int Marks[] = {30,70,90,65,80};
		System.out.println(Marks[1]);
		System.out.println(Marks[4]);
		System.out.println(Marks[5]);

	}

	public static void main(String[] args) {
		UnCheckedExceptionTest ue = new UnCheckedExceptionTest();
		ue.Division();
		ue.Marks();
	}

}
