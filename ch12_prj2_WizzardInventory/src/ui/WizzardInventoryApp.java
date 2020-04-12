package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.Console;

public class WizzardInventoryApp {
	private static List<String> items = new ArrayList<>();
	// create list of items

	public static void main(String[] args) {
		// welcome
		System.out.println("The Wizard Inventory Game");

		// initialize with 3 items: wooden staff, wizard hat, cloth shoes
		String[] itemsArray = { "wooden staff", "wizard hat", "cloth shoes" };
		items.addAll(Arrays.asList(itemsArray));
		String command = " ";
		while (!command.equalsIgnoreCase("exit")) {
			// Display menu
			displayMenu();
			// - start loop

			// get user input
			command = Console.getString("Command: ", true);

			// Business logic

			// - inspect the command entered, and perform appropriate logic
			// CRUD function
			// display results - built into biz logic
			switch (command) {
			case "show":
				showItems();
				break;
			case "grab":
				addItem();
				break;
			case "edit":
				editItem();
				break;
			case "drop":
				dropItem();
				break;
			case "exit":
				// do nothing, loop will end
				break;
			case "defualt":
				System.out.println("Invalid Entry. Try Again.");
				break;

			}
			System.out.println();
		}
		// - end loop

	}

	private static void dropItem() {
		int itemNumber = Console.getInt("Number: ", 0, items.size() + 1);
		String droppedItem = items.remove(itemNumber - 1);
		System.out.println(droppedItem+ " was dropped.");

	}

	private static void editItem() {
		int itemNumber = Console.getInt("Number: ", 0, items.size() + 1);
		String updatedName = Console.getString("Updated name: ", true);
		items.remove(itemNumber - 1);
		items.add(itemNumber - 1, updatedName);
		System.out.println("Item number " + itemNumber + " was updated.");
	}

	private static void addItem() {
		// we can only hold 4 items at a time
		// display msg if already at max limit
		if (items.size() >= 4) {
			System.out.println("Cannot grab an item.  Max limit (4) reached.");
		} else {
			String itemName = Console.getString("Name: ", true);
			items.add(itemName);
			System.out.println(itemName + " was added");
		}
	}

	private static void showItems() {
		// list all items
		for (int i = 0; i < items.size(); i++) {
			// items # will be more than index (i)
			int itemNbr = i + 1;
			System.out.println(itemNbr + ". " + items.get(i));
		}
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("show - Show all Items\n");
		menu.append("grab - Grab (Add) an Item\n");
		menu.append("edit - Edit an Item\n");
		menu.append("drop - Drop (Delete) ann Item\n");
		menu.append("exit - Exit the Program\n");
		System.out.println(menu);
	}
}
