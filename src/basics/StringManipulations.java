package basics;

public class StringManipulations {

	public void StringMethods()
	{
		String sText1 = "hello world";
		String sText2 = "HELLO";
		String sText3 = "hello world welcome to java training";
		String sText4 = "hello world this is core java training as part of selenium with java course";
		String stText5 = "         hi guys               ";
		
		System.out.println(sText1.toUpperCase()); //Convert a lowercase string into an uppercase
		System.out.println(sText2.toLowerCase()); //Convert a uppercase string into an lowercase
		System.out.println(sText2.length()); // Length of a string
		System.out.println(sText3.contains("java")); // Return true if string is found else return false
		System.out.println(sText4.toUpperCase().contains("CORE")); // Return true if string is found else return false
		System.out.println(stText5.trim()); // Removes the spaces from either side
		System.out.println(sText1.charAt(0)); // Returns character found at given index
		System.out.println(sText4.substring(0, 10)); //Returns substring found between the beginning and ending index
		System.out.println(sText1.indexOf('e')); //Returns the index value of a character
		System.out.println(sText1 + " " + sText2); // Concatenate two strings using + symbol
		System.out.println(sText1.concat(" ").concat(sText2)); // Concatenate two strings using concat method
		System.out.println(sText1.startsWith("h")); // Return true if string is found else return false
		System.out.println(sText2.equalsIgnoreCase("    hello          ".trim())); // Compares two string - case insensitive and returns true if strings are equal else returns false
		System.out.println(sText4.replace("core", "")); // Replace the old string with a new string
		System.out.println(sText1.endsWith("world")); // Return true if string is found else return false
		String asText[] = sText4.split(" "); //Split the string with a proper delimiter
		System.out.println(asText.length); //Length of an array
		System.out.println(stText5.join(">", asText)); // Join the array with a delimiter of choice
		System.out.println(sText1.isEmpty()); //Return true or false
	
	}

	public static void main(String[] args) {
	
		StringManipulations sm = new StringManipulations();
		sm.StringMethods();

	}

}
