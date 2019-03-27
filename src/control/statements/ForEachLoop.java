package control.statements;

public class ForEachLoop {

	public void ForEachLoopExample()
	{
		String[] strNames = {"naresh","ajay","ravi","pete","raghavan","kranthi"};
		for (String value : strNames) {
			System.out.println(value);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ForEachLoop it = new ForEachLoop();
		it.ForEachLoopExample();
	}

}
