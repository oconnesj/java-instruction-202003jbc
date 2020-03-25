import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Area and Parimeter Calculator ");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			
			System.out.print("Enter Length: ");
			int length = sc.nextInt();
			
			System.out.print("Enter width: ");
			int width =sc.nextInt();
			
			double area = width * length;
			double perimeter = 2 * width + 2 * length;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			
			System.out.println();
			
			
			System.out.println("Continue?" + " "+ "(y/n): ");
			choice = sc.next();
		
	}
		System.out.println();
		System.out.println("Thank You for using Rectangle Calculator");
		sc.close();

	}
}
