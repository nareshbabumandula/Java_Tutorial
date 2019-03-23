package access.modifiers.outside;

import access.modifiers.DefaultTest;
import access.modifiers.PublicTest;

public class DefaultOutsidePackageTest extends DefaultTest{
	
	public static void main(String[] args) {
		/*DefaultTest pt = new DefaultTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();*/
		
		DefaultOutsidePackageTest dt = new DefaultOutsidePackageTest();
	}

}
