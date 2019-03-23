package access.modifiers;

public class ProtectedTest {
	
	protected String USERNAME = "naresh";
	protected String PASSWORD = "selenium123";
	
	protected void Login()
	{
		System.out.println("Executing public Login method...");
	}
	
	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
