
public class Customer extends Person {
	private String customerNumber;
	
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);
	
	}

	public Customer(String fn, String ln, String custNbr) {
		super(fn, ln);
		this.customerNumber = custNbr;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return  super.toString()+ "\nCustomer Number: " + customerNumber;
	}

	
	
}
