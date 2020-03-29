//v4.1 -- added addition item Java juice Priced at 31.62 Java boot camp started on 3/16/20 

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class BarAgeCheckerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		double tipAmountInt;
		double tipAmountDec;
		double totalAmount;
		
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
						Double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						Double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						Double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						Double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						Double menuRB  = 3.00;
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
							  "JJ - Java Juice\n"+

							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					case "W":
						System.out.println("Water Please\n");
						Double menuW  = 0.00;
						Total = Total + menuW;
						break;

					case "R":
						System.out.println("Root beer Pleae\n");
						Double menuR  = 1.50;
						Total = Total + menuR;

						break;
					case "G":
						System.out.println("Ginger ale Please\n");
						Double menuG  = 1.50;
						Total = Total + menuG;

						break;
					case "J":
						System.out.println("Juice Please\n");
						Double menuJ  = 2.00;
						Total = Total + menuJ;
						break;
					case "RB":
						System.out.println("Redbull Please\n");
						Double menuRB  = 3.00;
						Total = Total + menuRB;
						break;

					case "B":
						System.out.println("Beer Please\n");
						Double menuB  = 6.00;
						Total = Total + menuB;
						break;

					case "M":
						System.out.println("Martini Please\n");
						Double menuM  = 7.50;
						Total = Total + menuM;

						break;

					case "T":
						System.out.println("Gin & Tonic Please\n");
						Double menuT  = 8.00;
						Total = Total + menuT;
						break;
					case "O":
						System.out.println("Old Fashioned Please\n");
						Double menuO  = 6.50;
						Total = Total + menuO;
						break;
					case "JJ":
						System.out.println("Java Juice Please\n");
						Double menuJJ  = 31.62;
						Total = Total + menuJJ;
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
			Total = new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(Total).setScale(2, RoundingMode.HALF_UP).doubleValue();
			NumberFormat currency = NumberFormat.getCurrencyInstance();

			String TotalString = currency.format(Total);

			
			
			System.out.println("Total Bill: " + TotalString);
			System.out.println();
			System.out.print("Enter tip % amount: ");
			tipAmountInt = sc.nextInt();
			tipAmountDec = (tipAmountInt / 100) * Total;
			// System.out.println(tipAmountDec); for debuging
			totalAmount = tipAmountDec + Total;

			tipAmountDec = new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();

			totalAmount = new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();

			NumberFormat currency2 = NumberFormat.getCurrencyInstance();
			String tipAmountString = currency2.format(tipAmountDec);

			String totalAmountString = currency.format(totalAmount);
			
			System.out.println();
			System.out.println("Tip amount: " + tipAmountString);
			System.out.println();
			System.out.println("Total amount: " + totalAmountString);

	
			
			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank You for using Bar Age Checker");
		sc.close();
	
	}	
	
}

