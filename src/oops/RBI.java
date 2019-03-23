package oops;

public interface RBI {
	
	abstract void NoOfCustomers();
	abstract void AccountType();
	abstract void FixedDeposit();
	abstract void MinWithDrawl();
	abstract void MaxWithDrawl();
	abstract void Loans();
	abstract void MinBalance();
	
	
	
	public default void mortgageLoans()
	{
		System.out.println("mortgageLoans is a default method : ");
	}
	
	
	public static void LoanCancellation()
	{
		System.out.println("LoanCancellation is a static method : ");
	}

	public static void main(String[] args)
	{
		LoanCancellation();
		
		
	}
	
}
