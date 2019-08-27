package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_of_store_items = scan.nextInt();
		
		// This is an experimental scanner used to scan a string concatenated to store all the items and their prices for future reference
		// Scanner scan2 = new Scanner()
		String items = "";
		// Insert a for loop to iterate through all the items, storing the names as strings and their prices
		for (int i = 0; i < num_of_store_items; i++) {
			String item_name = scan.next();
			String item_price = scan.next();
			items = items + item_name + " " + item_price + " ";
			
			
		}
		
		System.out.println(items);
		
	}

	// 2 potential ideas: either create a string[] with all the pricing data or create one concatenated string containing
	// all the items and their prices, then use substrings and indexat to retrieve the price given the name of the item

}
