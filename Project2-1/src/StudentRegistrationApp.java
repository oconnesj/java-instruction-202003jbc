import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		 System.out.println();  // print a blank line
		 
		//Collect First Name  
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter First Name: ");
			String firstName = sc.next();
		//Collect Last Name
			
				System.out.print("Enter Last Name: ");
				String lastName = sc.next();
				
		//Collect Birth Year
				System.out.print("Enter year of birth: ");
				int birthYear = sc.nextInt();
				
		//print First and Last name 
			String fullName = firstName + " " + lastName;
			String tempPwd = firstName + "*" + birthYear;
			System.out.println("Your registration is complete.");
			System.out.print("Your temporary password is: " + tempPwd);
			sc.close();
	}
}

		