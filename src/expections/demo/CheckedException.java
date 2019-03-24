package expections.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public void CheckedExceptionTest() throws IOException 
	{
			FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Desktop\\Test.txt");
			int r;
			while((r=strFile.read())!=-1)
			{
				System.out.println((char)r);
			}
			strFile.close();
			
	}
	
	

	public static void main(String[] args) throws IOException {
		CheckedException ce = new CheckedException();
		ce.CheckedExceptionTest();
	}

}
