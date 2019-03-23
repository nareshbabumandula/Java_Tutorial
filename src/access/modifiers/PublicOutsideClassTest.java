package access.modifiers;

public class PublicOutsideClassTest {

	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
