package access.modifiers.outside;

import access.modifiers.ProtectedTest;
import access.modifiers.PublicTest;

public class ProtectedOutsidePackageTest extends ProtectedTest{
	
	public static void main(String[] args) {
		/*ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();*/
		
		ProtectedOutsidePackageTest pt = new ProtectedOutsidePackageTest();
		pt.Login();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		

	}

}
