import java.util.Scanner;

public class TableofPowersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Squares and Cubes Table");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter an integer: ");
			int inputNumber = sc.nextInt();
			System.out.println();

			System.out.println("Number" + "    " + "Square" + "    " + "Cubed");
			System.out.println("======" + "    " + "======" + "    " + "=====");
			System.out.println();

			for (int i = 1; i <= inputNumber; i++) {
				int square = i * i;
				int cube = i * i * i;

				System.out.println(i + "           " + square + "       " + cube);

			}
			System.out.println();

			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
			System.out.println();

		}
		System.out.println("Thank You for using Squares and Cubes table");
		sc.close();

	}
}
