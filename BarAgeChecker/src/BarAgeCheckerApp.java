//v3.0 -- tab calculator is working, removed extra blank line 

import java.util.Scanner;

public class BarAgeCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Java Happy Hour\n");

// Beginning of drink logic 

			System.out.println("Can I see your ID\n");
			System.out.print("Enter your Age: ");
			int age = sc.nextInt();
			System.out.println();
			Double Total = 0.0;


			if (age < 21) {
				System.out.print("You can order from this Menu\n");

				String menuChoice = " ";
				//Beginning of drink variables 
				
				
				
				while (!menuChoice.equalsIgnoreCase("X")) {

					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - Root Beer\n" +
							  "G - Ginger ale\n" +
							  "J - Juice\n"+
							  "RB - Redbull\n"+
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					
					

					case "W":
						System.out.println("Water Please\n");
						double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						double menuRB  = 3.00;
						Total = Total + menuRB;
						break;
					
					default:
						System.out.println("Invalid Choice, try again.\n");
						break;
					case "X":
						System.out.println("Thank you, come again\n");
						break;
						
					// end switch menu
					}
				}	// end while
				
				}
				else if (age >= 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				while (!menuChoice.equalsIgnoreCase("x")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - Root Beer\n" +
							  "G - Ginger ale\n" +
							  "J - Juice\n"+
							  "RB - Redbull\n"+
							  "B - Beer\n" +
							  "M - Martini\n" +
							  "T - Gin & Tonic\n" +
							  "O - Old Fashioned\n"+

							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					case "W":
						System.out.println("Water Please\n");
						double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						double menuRB  = 3.00;
						Total = Total + menuRB;
						break;

					case "B":
						System.out.println("Beer Please\n");
						double menuB  = 6.00;
						Total = Total + menuB;
						break;

					case "M":
						System.out.println("Martini Please\n");
						double menuM  = 7.50;
						Total = Total + menuM;

						break;

					case "T":
						System.out.println("Gin & Tonic Please\n");
						double menuT  = 8.00;
						Total = Total + menuT;
						break;
					case "O":
						System.out.println("Old Fashioned Please\n");
						double menuO  = 6.50;
						Total = Total + menuO;
						break;

					
					case "X":
						System.out.println("Thank you, come again\n");
						break;
					default:
						System.out.println("Invalid Choice, try again.\n");
						break;
					// end switch menu
					}
					// end while
				}

			} // Possible spot for additional logic to calculate drink tab 
			System.out.println("Total Bill: " + Total);

			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank You for using Bar Age Checker");
		sc.close();
	
	}	
	
}

