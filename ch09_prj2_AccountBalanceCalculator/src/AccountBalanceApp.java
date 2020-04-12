import java.text.NumberFormat;

public class AccountBalanceApp {
	private static NumberFormat cf = NumberFormat.getCurrencyInstance();


	public static void main(String[] args) {
		// Welcome msg + initialization
		//create savingsAccount and checkingAccount w/ 1000 balance each 
		System.out.println("Welcome to the Account Balance Calculator!");
		SavingsAccount sa = new SavingsAccount(1000, .01);
		CheckingAccount ca = new CheckingAccount(1000, 1);
		
		
		// - start loop
		System.out.println("Staarting Balances: ");
		summarizeAccountBalances(ca,sa);
		System.out.println();
		System.out.println("Enter Transaction for the Monthy");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		// Get user input - loop through monthly transactions 
		// Transaction = w/d, c/s 
		// transType: String
		// acctType: String
		// amount : double
		String transType = Console.getString("Withdraw or Deposit? (w/d:)  ", "w", "d");
		String acctType = Console.getString("Checking or SAvings? (c/s:)  ", "c", "s");
		// business logic 
		// apply transaction to appropriate account
		Account a;
		if (acctType.equals("c")) {
			a = ca;
			
		}
		else {
			a= sa;
		}
		
		

		if(transType.equals("w")) {
			double amount = Console.getDouble("Amount? ", 0,  a.getBalance());

			a.withdraw(amount);
			
		}
		else {
			double amount = Console.getDouble("Amount? ", 0, Double.POSITIVE_INFINITY);

			a.deposit(amount);
		}
		

		
		// - end loop (user enters 'n' to continue 
		choice = Console.getString("Continue (y/n)" , true);
		}
		// apply pmts and fees to balances 
		sa.applyPayment();
		ca.subtractMonthlyfee();
		
		
		// summarize pmts and fees
		System.out.println("Monthly Payments and Fees: ");
		System.out.println("Checking Fee:				"+cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment:    		"+cf.format(sa.getMonthlyInterestPayment()));
		// summarize final balances 
		System.out.println("Final Balances:");
		summarizeAccountBalances(ca, sa);
		//balnace + monthlyInterestPayment;
		
		// bye 
	} // end main method 
	
	private static void summarizeAccountBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: "+cf.format(ca.getBalance()));
		System.out.println("Savings: "+cf.format(sa.getBalance()));
	}
	
	

}
