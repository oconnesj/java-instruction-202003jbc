
import java.util.Scanner;

public class NameParserApp {
 

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a name: ");
			String name = sc.nextLine();
			boolean index1 = name.contains(" ");
			boolean index2 = name.contains(" ");
		//	int spaceCharacter = name.indexOf(" ");
		//	int lastNameStart = spaceCharacter + 1;

			 if (name.contains(" ")) {
				int spaceCharacter = name.indexOf(" ");
				int lastNameStart = spaceCharacter + 1;
				System.out.println();
				String firstNameSubstring = "First Name: " + name.substring(0, spaceCharacter);
				String lastNameSubstring = "Last Name: " + name.substring(lastNameStart);

				System.out.println(firstNameSubstring);
				System.out.println(lastNameSubstring);

			}
			else if (name.contains(" ") + index2) {
				System.out.println("test");
				
			} 

			else {
				System.out.println("Name has to be at least two words");
			}

			System.out.println();

			System.out.print("Continue?" + " " + "(y/n): ");
			choice = sc.next();

		}

	}
}
