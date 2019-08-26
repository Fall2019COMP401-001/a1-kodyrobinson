package a1;

import java.util.Scanner;

// the hashmap utility imported below is for experimental purposes only
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_of_store_items = scan.nextInt();
		
		// Create a hashmap (for temporary experimental purposes)
		
		HashMap<Integer, String> item_prices = new HashMap<Integer, String>();
		
		
		// Insert a for loop to iterate through all the items, storing the names as strings and their prices
		for (int i = 0; i < num_of_store_items; i++) {
			String item_name = scan.next();
			double item_price = scan.nextDouble();
			item_prices.put(Integer.valueOf(item_name), String.format("%.2f", item_price));
			System.out.println(item_prices.get(Integer.valueOf(item_name)));
			
		}
	}
}
