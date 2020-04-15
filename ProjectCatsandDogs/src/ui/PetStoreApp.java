package ui;

import buisness.Pet;
import buisness.PetRandomAge;
import java.util.*;

import util.Console;

public class PetStoreApp {
	// create List of pets - pets: ArrayList<String>
	private static java.util.List<Pet> pets = new ArrayList<Pet>();

	public void List() {
		pets = new ArrayList<Pet>();
	}

	public static void main(String[] args) {
		PetRandomAge age = new PetRandomAge();

		System.out.println("Welcome to the Pet Store App");
		System.out.println("This application will manage a list of pets. You can add pets to the inventory, and remove\n"
						+ "them when they get adopted");

		System.out.println();

		Pet p1 = new Pet(1, " Goat", " Nigerian Dwarf Goat", " Fred", age.roll());
		Pet p2 = new Pet(2, " Bird", " Cockatiel", " Dumpling", age.roll());
		Pet p3 = new Pet(3, " Cat", " Russian Blue ", " Lucy", age.roll());
		Pet p4 = new Pet(4, " Dog", " Labador Retriever", "Pike", age.roll());

		pets.add(p1);
		pets.add(p2);
		pets.add(p3);
		pets.add(p4);

		String command = "";
		System.out.println();
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command:  ", true);
			switch (command) {
			case "list":
				listPets();
				break;
			case "add":
				addPet();
				break;
			case "adopt":
				adoptPet();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid entry");

			}
		}

		System.out.println("Bye");
	}

	private static void adoptPet() {
		// prompt user for id and get the pet
		System.out.println();
		System.out.println("Pet Adoption");
		System.out.println("==============");
		int id = Console.getInt("Id of pet to adopt?  ", 0, (int) Double.POSITIVE_INFINITY);
		System.out.println();
		Pet removePet = null;
		for (Pet p : pets) {
			if (p.getId() == id) {
				removePet = p;

			}
		}
		if (removePet != null) {
			pets.remove(removePet);
			System.out.println(removePet.getName() + " has been adopted.");
		} else {
			System.out.println("Not pet matches Id entered.");
			System.out.println("Please try again");
		}
	}

	private static void addPet() {
		System.out.println();
		System.out.println("Add a Pet to inventory");
		System.out.println("======================");
		System.out.println();
		int id = Console.getInt("Pet Id?  ", 0, (int) Double.POSITIVE_INFINITY);

		String type = Console.getString("Type?  ", true);
		String species = Console.getString("Species?  ", true);
		String name = Console.getString("Name?  ", true);
		int age = Console.getInt("Age?   ", 0, (int) Double.POSITIVE_INFINITY);

		// add pets
		Pet p = new Pet(id, type, species, name, age);
		pets.add(p);
		System.out.println();
		System.out.println("Pet Added");
	}

	private static void listPets() {
		System.out.println();
		System.out.println("Pets in inventory");
		System.out.println("=================");
		System.out.println();

		for (Pet p : pets) {
			System.out.println(p);

		}

	}

	private static void displayMenu() {
		System.out.println();
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		System.out.println("======================");

		menu.append("list - list all pets\n");
		menu.append("add - add pet to inventory\n");
		menu.append("adopt - remove adopted pet from inventory\n");
		menu.append("exit - Exit the Program\n");
		System.out.println(menu);
	}
}