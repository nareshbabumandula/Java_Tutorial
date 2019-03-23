package access.modifiers;

public class PrivateTest {
	
	private String USERNAME = "naresh";
	private String PASSWORD = "selenium123";
	
	private void Login()
	{
		System.out.println("Executing public Login method...");
	}
	
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
