import java.util.Scanner;

public class ShortCircuitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Stop Light Approaching!!!");
		Scanner sc = new Scanner (System.in);
		System.out.print("What color is the light (r,y,g)?  ");
		String light = sc.next();
		System.out.print("How far away is the light (feet)?  ");
		int feet = sc.nextInt();
		
		if (light.equalsIgnoreCase("r")) {
			// light is red - stop
		}
		else if (light.equalsIgnoreCase("y") && feet < 30) {
			// light is yellow and we are super close ! - speed up!
		}
		else if (light.equalsIgnoreCase("g")) {
			// light is green, keep going
		}
		else {
			// light is yellow and we far way - slow to a stop 
		}
		

	}

}
