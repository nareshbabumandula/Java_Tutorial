package oops;

public class EncapsulationTest {
	
	private String USERNAME="naresh";
	private String PASSWORD="secure123";
	
	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}


	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
	}

}
