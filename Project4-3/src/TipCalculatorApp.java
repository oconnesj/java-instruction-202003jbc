import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tip Calculator");
		// start scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		double optionOne;
		double resultOne;
		double resultTwo;
		double resultThree;
		double totalOne;
		double totalTwo;
		double totalThree;

		while (choice.equalsIgnoreCase("y")) {
			// blank line
			System.out.println();

			System.out.print("Cost of meal: ");
			optionOne = sc.nextDouble();
			System.out.println();

			resultOne = optionOne * .15;
			totalOne = resultOne + optionOne;
			
			resultTwo = optionOne * .20;
			totalTwo = resultTwo + optionOne;

			resultThree = optionOne * .25;
			totalThree = resultThree + optionOne;
			
			
			resultOne = new BigDecimal(resultOne).setScale(2, RoundingMode.HALF_UP).doubleValue();
			resultTwo = new BigDecimal(resultTwo).setScale(2, RoundingMode.HALF_UP).doubleValue();
			resultThree = new BigDecimal(resultThree).setScale(2, RoundingMode.HALF_UP).doubleValue();

			
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
            String resultOneString = currency.format(resultOne);
            String totalOneString = currency.format(totalOne);
            String resultTwoString = currency.format(resultTwo);
            String totalTwoString = currency.format(totalTwo);
            String resultThreeString = currency.format(resultThree);
            String totalThreeString = currency.format(totalThree);
            
			System.out.println("15%");
			System.out.println("Tip amount: " + resultOneString );
			System.out.println("Total: " + totalOneString);
			System.out.println();
			System.out.println("20%");
			System.out.println("Tip amount: " + resultTwoString );
			System.out.println("Total: " + totalTwoString);
			System.out.println();
			System.out.println("25%");
			System.out.println("Tip amount: " + resultThreeString );
			System.out.println("Total: " + totalThreeString);
			
			System.out.println();
			System.out.print("Continue?" + " "+ "(y/n): ");
			choice = sc.next();
			

		}
		System.out.println("Thank You for using Tip Calculator");
		sc.close();
	}
}
