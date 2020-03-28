import java.util.Scanner;

public class BarAgeCheckerApp {
	public static void main(String[] args) {
		System.out.println("Hello, \nWhat would you like to drink?");
		Scanner sc = new Scanner (System.in);
		//insert blank line x2 
		System.out.println();
		System.out.println();
		// begin menu 
		String choice = " ";
		while (!choice.equalsIgnoreCase("x")) {
			//display the menu 
			String menu = "MENU\n" +
					  "============\n" +
					  "W - Water\n" +
					  "R - RootBeer\n" +
					  "G - Gingerale\n" +
					  "B - Beer\n" +
					  "M - Martini\n" +
					  "X - exit\n";
			System.out.println(menu);
			choice = sc.next();
			// do something based on that choice 
			switch (choice) {
			
			case "W":
				System.out.println("Water Please");
				break;
			
			case "R":
				System.out.println("Rootbeer Pleae");
				break;
			case "G":
				System.out.println("Gingerale Please");
				break;

			case "B":
				System.out.println("Beer Please");
				break;

			case "M":
				System.out.println("Martini Please");
				break;

			case "X":
				break;
			default:
				System.out.println("INvalid Choice, try again.");
				break;
				
		
			}
			System.out.println(choice);
			
	}
		System.out.println("Goodbye");

	}
}