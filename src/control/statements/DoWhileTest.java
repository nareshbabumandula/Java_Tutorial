package control.statements;

public class DoWhileTest {

	public void DoWhileExample()
	{
		int i=0;
		
		do {
			System.out.println("Iteration is : " + i);
			if (i==10) {
				break;
			}
			i=i+1;
		} while (i<20);
	}
	
	
	public static void main(String[] args) {
		
		DoWhileTest it = new DoWhileTest();
		it.DoWhileExample();
	}

}
