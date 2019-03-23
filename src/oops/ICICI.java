package oops;

public class ICICI implements RBI {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.mortgageLoans();

	}

	@Override
	public void NoOfCustomers() {
		System.out.println("No of customers are 1 million");
		
	}

	@Override
	public void AccountType() {
		System.out.println("Recurring deposit account");
		System.out.println("Savings account");
		System.out.println("Current account");
	}

	@Override
	public void FixedDeposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MinWithDrawl() {
		System.out.println("Min withdrawl should be 100 rupees");
		
	}

	@Override
	public void MaxWithDrawl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Loans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MinBalance() {
		System.out.println("Minimum balance should be 1000");
		
	}

}
