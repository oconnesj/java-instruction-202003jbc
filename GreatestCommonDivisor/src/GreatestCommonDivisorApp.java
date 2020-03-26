import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Greatest Common Divisor App");

		// get user input
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// do biz logic
		while (choice.equalsIgnoreCase("y")) { 
			System.out.println("Enter first number (x):  ");
			int x = sc.nextInt();
			System.out.println("Enter second number (y):  ");
			int y = sc.nextInt();
			
			
			//dpo this until x == 0
			while (x > 0) {
				while (y >= x ) {
					// subtract x from y
					y = y - x;
					// y -= x;
				}
				// swap values of x and y
				int hold = y;
				y = x;
				x = hold;
			}
			// y should be the gcd
			
			System.out.println("Greatest common divisor: "+y);
			System.out.println();
			
// - while loops ends
			
			System.out.print("Continue? ");
			choice = sc.next();
			System.out.println();;
		}
		// bye
		System.out.println("Bye");
		sc.close();

	}

}
