package ch02_FunWithStrings;

import java.util.Scanner;

public class StringsBasicApp {

	public static void main(String[] args) {
		String message = "Hello there";
		String emptyString = "";
		String nullString = null;
		
		String firstName = "Bob";
		String lastName = "Marley";
		String fullName = firstName+" "+lastName;
		
		
		String fullName2 = "";
		fullName2 +=" ";
		fullName2 += lastName;
		System.out.println(fullName2);
		
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		System.out.println("Enter Something: "+msg);
		
		System.out.println("hello ...\n\"George\t\tMcFly\"");
		System.out.println("println adds a line break...");
		System.out.print("print does not");
		System.out.print(".... cas in point");
		
		System.out.println("Enter a whole #: ");
		double d = sc.nextDouble();
	}

}
