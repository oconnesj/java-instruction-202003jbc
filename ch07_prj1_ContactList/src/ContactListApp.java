
public class ContactListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome
		System.out.println("Welcome to the Contact List application\n");

		// note: skipping continue loop to save time

		// Get User Input: firtName, lastName, email, phone
		String fn = Console.getString("Enter first name:  ");
		String ln = Console.getString("Enter last name: ");
		String e = Console.getString("Enter email:  ");
		String pn = Console.getString("Enter phone:  ");

		// Do Biz logic?? Create an instance
		Contact c = new Contact(fn, ln, e, pn);

		// display results
		System.out.println(c.dispalyContact());
		
		// Bye 
		System.out.println("Bye");
	}

}
