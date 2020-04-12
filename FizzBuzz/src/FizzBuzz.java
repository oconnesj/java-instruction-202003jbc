import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("Welcome to the Fizzbuzz Application\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter a number: ");
			 int n = sc.nextInt();

			// Create a loop that outputs 1 - 100

			for (int i = 1; i <= n; i++) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i + " = FizzBuzz");
				} else if ((i % 3 == 0)) {
					System.out.println(i + " = Fizz");

				} else if ((i % 5 == 0)) {
					System.out.println(i + " = Buzz");
				}

				else {
					System.out.println(i);
				}
			}
			System.out.print("Continue: (y/n)  ");
			choice = sc.next();
		}
		System.out.println("Bye");
		sc.close();
	}
}