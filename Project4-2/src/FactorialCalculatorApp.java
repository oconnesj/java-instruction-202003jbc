import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Factorial Calculator");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			Long n = sc.nextLong();
			int r = 3;
			System.out.println("The Factorial of"+ " " +n +" "+ "is" +" "+ r );
			  
	}
	}
}
