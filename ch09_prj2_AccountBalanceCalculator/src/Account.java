
public class Account implements Balaceable, Withdrawable, Depositable {

	protected double balance;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	
	

	public Account() {
		super();
	}


	@Override
	public double getBalance() {
		return balance;
	}
	

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
		
	}

	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
				
	}


	@Override
	public void deposit(double amount) {
		balance += amount;
		
	}



	

}
