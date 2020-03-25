import java.util.Scanner;


public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Temperature Converter ");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
		

		System.out.print("Enter degrees in Fahrenheit: ");
		double f = sc.nextDouble();
		double c = (f-32) * 5/9;
		c = (double) Math.round(c * 100) /100;

		System.out.println("Degrees in Celsius: " + c);
		
		System.out.println();
		
		
		System.out.print("Continue?" + " "+ "(y/n): ");
		choice = sc.next();
		sc.close();
	
	}
		System.out.println();
		System.out.println("Thank You for using Temperature Converter");
	}
}
