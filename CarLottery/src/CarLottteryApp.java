import java.util.Scanner;

public class CarLottteryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Car Lottery\n");
		System.out.println("Roll for your car tier\n");
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Your Car Tier is: " + rollDice());
			System.out.println();
			choice = askToContinue(sc);

		}
		System.out.println("bye");

	}

	public static String rollDice() {
		int tierDie = (int) (Math.random() * 6) + 1;

		return tierResult(tierDie);
	}

	public static String tierResult(int tierDie) {
		String message = " ";


		if (tierDie == 1) {
			message += "Tier 1";
		} else if (tierDie == 2 ) {
			message += "Tier 1";
		} else if (tierDie == 3 ) {
			message += "Tier 2";

		} else if (tierDie == 4 ) {
			message += "Tier 2";

		} else if (tierDie == 5 ) {
			message += "Tier 3";

		}else if (tierDie == 6 ) {
			message += "Tier 6"; 

		}

		return message;
	}
	
	public static String tierRoll() {
		
		return null;
	}

	private static String askToContinue(Scanner sc) {
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		return choice;
	}

}
