import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Travel Time Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.println();
			
		System.out.print("Enter Miles: ");
		double m = sc.nextDouble();
		
		System.out.print("Enter Miles Per hour: ");
		double mph = sc.nextDouble();
		
		double travelTimeHours = m / mph;
		double travelTimeMin = m / mph % 1;
		// converting from floating to a whole number 
		
		int hour = (int) travelTimeHours;
		int min = (int) (travelTimeMin * 60);

		System.out.println();
		
		System.out.println("Esitmated travel time");
		System.out.print("----------------------");
	// blank line 	
		System.out.println();
		
		System.out.println("Hours: " + hour);
		System.out.println("Minutes: " + min);
		System.out.println();
		
		System.out.print("Continue?" + " "+ "(y/n): ");
		choice = sc.next();
		
		}
		System.out.println();
		System.out.println("Thank You for using Travel Time Calculator");	
		sc.close();

	}
}
//		double travelTime = m / mph %1; 
