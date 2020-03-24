import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Letter Grade Converter");
		// insert blank line 
		System.out.println();

		//Enter Numerical grade 
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
		System.out.println();

		System.out.print("Enter numberical grade: ");
		int grade = sc.nextInt();
		
		//Letter Grade 
		
		if (grade >= 88) {
			System.out.print( "Letter grade: A");
		}
		else if (grade >=80) {
			System.out.print( "Letter Grade: B");
		}
		else if (grade >=67) {
			System.out.print( "Letter Grade: C");
		}
		else if (grade >=60) {
			System.out.print( "Letter Grade: D");
			}
		else {
			System.out.print( "Letter Grade: F");
		}
		// insert blank line 
		
		System.out.println();

		System.out.println("Continue?" + " "+ "(y/n): ");
		choice = sc.next();
		
		}
		System.out.println();
		


	System.out.println("Thank You for using Grade Calculator!");
	}
}
