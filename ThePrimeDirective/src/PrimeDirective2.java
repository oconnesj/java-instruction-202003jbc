
// Import statement:
import java.util.ArrayList;
import java.util.Scanner;

class PrimeDirective2 {
	// Add your methods here:
	public boolean isPrime(int number) {
		if (number == 2) {
			return true;
		} else if (number < 2) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Prime Directive Application\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter the value of N: ");
			int n = sc.nextInt();

			PrimeDirective2 pd = new PrimeDirective2();
			int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
			System.out.println(pd.isPrime(n));
			System.out.print("Continue: (y/n)  ");
			choice = sc.next();
		}
		System.out.println("Bye");
		sc.close();
	}
}
