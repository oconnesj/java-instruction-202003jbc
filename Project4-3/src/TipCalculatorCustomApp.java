import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorCustomApp {
	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		// start scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double mealCost;
		double tipAmountInt;
		double tipAmountDec;
		double totalAmount;

		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Cost of Meal: ");
			mealCost = sc.nextDouble();
			System.out.print("Enter tip % amount: ");
			tipAmountInt = sc.nextInt();
			tipAmountDec = (tipAmountInt / 100) * mealCost;
			// System.out.println(tipAmountDec); for debuging
			totalAmount = tipAmountDec + mealCost;

			tipAmountDec = new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(tipAmountDec).setScale(2, RoundingMode.HALF_UP).doubleValue();

			totalAmount = new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
			new BigDecimal(totalAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String tipAmountString = currency.format(tipAmountDec);

			String totalAmountString = currency.format(totalAmount);

			System.out.println("Tip amount: " + tipAmountString);
			System.out.println("Total amount: " + totalAmountString);

			// System.out.println(totalAmountString);
			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
			System.out.println("Thank You for using Tip Calculator");
			
			sc.close();

		

	}
}
