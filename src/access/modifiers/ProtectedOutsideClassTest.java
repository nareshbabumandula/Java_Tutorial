package access.modifiers;

public class ProtectedOutsideClassTest {

	
	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		

	}

}
