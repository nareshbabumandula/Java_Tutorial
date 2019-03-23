package access.modifiers;

public class DefaultTest {
	
	String USERNAME = "naresh";
	String PASSWORD = "selenium123";
	
	void Login()
	{
		System.out.println("Executing public Login method...");
	}
	
	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
