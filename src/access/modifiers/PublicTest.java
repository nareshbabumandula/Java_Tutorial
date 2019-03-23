package access.modifiers;

public class PublicTest {
	
	public String USERNAME = "naresh";
	public String PASSWORD = "selenium123";
	
	public void Login()
	{
		System.out.println("Executing public Login method...");
	}
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
