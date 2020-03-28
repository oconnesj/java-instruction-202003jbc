import java.util.Scanner;

public class BarAgeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Java Happy Hour");
			System.out.println();


			System.out.println("Can I see your ID");
			System.out.println();
			System.out.print("Enter your Age: ");
			int age = sc.nextInt();
			System.out.println();


			if (age < 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				while (!menuChoice.equalsIgnoreCase("x")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - RootBeer\n" +
							  "G - Gingerale\n" +
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					

					case "W":
						System.out.println("Water Please");
						System.out.println();
						break;

					case "R":
						System.out.println("Rootbeer Pleae");
						System.out.println();
						break;
					case "G":
						System.out.println("Gingerale Please");
						System.out.println();
						break;
					case "X":
						System.out.println("Thank you, come again");
						System.out.println();
						break;
					default:
						System.out.println("Invalid Choice, try again.");
						System.out.println();
						break;
					// end switch menu
					}
					// end while
				}

			} else if (age >= 21) {
				System.out.println("You can order from this Menu");
				System.out.println();

				String menuChoice = " ";
				while (!menuChoice.equalsIgnoreCase("x")) {
					// display the menu
					System.out.println();
					String menu = "MENU\n" +
							  "============\n" +
							  "W - Water\n" +
							  "R - RootBeer\n" +
							  "G - Gingerale\n" +
							  "B - Beer\n" +
							  "M - Martini\n" +
							  "X - exit\n";
					System.out.println(menu);
					menuChoice = sc.next();
					// do something based on that choice
					System.out.println();
					switch (menuChoice) {
					case "W":
						System.out.println("Water Please");
						System.out.println();
						break;

					case "R":
						System.out.println("Rootbeer Pleae");
						System.out.println();
						break;
					case "G":
						System.out.println("Gingerale Please");
						System.out.println();
						break;
					

					case "B":
						System.out.println("Beer Please");
						System.out.println();

						break;

					case "M":
						System.out.println("Martini Please");
						System.out.println();
						break;
					case "X":
						System.out.println("Thank you, come again");
						System.out.println();
						break;
					default:
						System.out.println("Invalid Choice, try again.");
						System.out.println();
						break;
					// end switch menu
					}
					// end while
				}
			}
			System.out.println();
			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();
		}
		System.out.println("Thank You for using Bar Age Checker");
		sc.close();
	}
}

// do something based on that choice +
