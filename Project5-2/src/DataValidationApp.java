import java.util.InputMismatchException;
import java.util.Scanner;

import util.Console;


public class DataValidationApp {

	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator\n");
		 System.out.println("Console accepts: Whole numbers ex 55, Deciamls ex 22.5, whole numbers with comma 2,000");
		while (choice.equalsIgnoreCase("y")) {
String test= "this is a test";
Console.getInt(test);
System.out.println(test);
			double miles = 0;
			double mph = 0;

			try {
				miles = getDoublWithinRangeMiles(sc, "\nEnter miles:  ", 5, 10000);
			} catch (InputMismatchException e) {
				System.out.println("\nError, please enter a valid numerical value\n");
				sc.nextLine();
				continue;
			}

			try {
				mph = getDoubleWtihinRangeMph(sc, "Enter miles per hour:  ", 10, 120);

			} catch (InputMismatchException e) {
				System.out.println("\nError, please enter a valid numerical value\n");

				sc.nextLine();
				continue;
			}
			System.out.println("\nEstimated travel time");
			System.out.println("---------------------\n");
			convertInputHours(miles, mph, "Hours:     	 ", "Days:       	 ");
			convertInputMinutes(miles, mph, "Minutes:    	 ");
			System.out.println();

			choice = continuePrompt(sc, "Continue? (y/n): ");

		}
		// Bye
		System.out.println("\nBye!");
		sc.close();

	}

	private static double convertInputMinutes(double miles, double mph, String Minutes) {
		double min = (miles / mph % 1) * 60;
		System.out.println(Minutes + Math.round(min));
		return min;
	}

	private static double convertInputHours(double miles, double mph, String Hours, String Days) {
		double hour = (miles / mph);
		if (hour > 24 ) {
			double days = (hour / 24);
			double hoursRemaining = (hour % 24);
			//	if (hour {
		//			hour = 0;
					
			//	}
			System.out.println(Days + Math.round(days));
			System.out.println(Hours + Math.round(hoursRemaining));

		}
		else if (hour <= 0.9) {
			hour = 0;
			System.out.println(Hours + Math.round(hour));

		}

		else 
			System.out.println(Hours + Math.round(hour));
		return hour;
		
	}

	public static double getDoublWithinRangeMiles(Scanner sc, String prompt, double min, double max) {
		double miles = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			miles = sc.nextDouble();

			if (miles <= min) {
				System.out.println("\nError! Number must be greater than " + min + " Miles" + ".");
			} else if (miles >= max) {
				System.out.println("\nError! Number must be less than " + max + " Miles" + ".");
			} else {
				isValid = true;
			}
		}

		return miles;

	}

	private static double getDoubleWtihinRangeMph(Scanner sc, String prompt, double min, double max) {
		double mph = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			mph = sc.nextDouble();
			if (mph <= min) {
				System.out.println("\nError! Number must be greater than " + min + " Mph" + ".");
			} else if (mph >= max) {
				System.out.println("\nError! Number must be less than " + max + " Mph" + ".");
			} else {
				isValid = true;
			}
		}

		return mph;

	}

	private static String continuePrompt(Scanner sc, String prompt) {
		String choice = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			choice = sc.next();
			if (choice.equals("y") || choice.equals("n")) {
				isValid = true;
			} else {
				System.out.println("\nInvalid choice.  Try again.");
			}
		}
		return choice;
	}
}