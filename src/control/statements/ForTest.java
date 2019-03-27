package control.statements;

public class ForTest {

	public void ForLoopExample()
	{
	
		for (int i = 0; i <= 20; i++) {
			System.out.println("Iteration is : " + i);
			if(i==12) break;
		}
	}
	
	
	public static void main(String[] args) {
		
		ForTest it = new ForTest();
		it.ForLoopExample();
	}

}
