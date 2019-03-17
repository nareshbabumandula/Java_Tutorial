package basics;

public class DataTypes {

	public static void main(String[] args) {
		int a =10;
		float b=12.5f;
		double c=213.234234;
		char d='t';
		byte e =120;
		boolean f = true;
		boolean g=false;
		long h=234324;
		short i=1243;
		System.out.println("Integer value of a is : " + a);
		System.out.println("Float value of b is : " + b);
		System.out.println("double value of c is : " + c);
		System.out.println("character value of d is : " + d);
		System.out.println("byte value of e is : " + e);
		System.out.println("boolean value of f is : " + f);
		System.out.println("boolean value of g is : " + g);
		System.out.println("Long value of h is : "+ h);
		System.out.println("Short value of i is : "+ i);
		
		//Data conversions - Widening and Narrowing
		byte b1 = 124;
		int c1 =b1;
		System.out.println("Widening: Storing a smaller data type value (byte) into a bigger data type int : " + c1);
		
		int a2 = 145;
		byte b2 =(byte) a2; //Type casting
		System.out.println("Narrowing: Storing a bigger data type value (int) into a sammler data type byte : " + b2);
		
		
		
		
		
		
	}

}
