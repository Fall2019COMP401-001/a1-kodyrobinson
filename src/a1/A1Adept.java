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
			double item_price = scan.nextDouble();
			items = items + item_name + String.format("%.3f", item_price);
		}
		int num_of_customers = scan.nextInt();
		
		String cust_names_and_totals = "";
		
		for (int i = 0; i < num_of_customers; i++) {
			String specific_cust_first = scan.next();
			String specific_cust_last = scan.next();
			cust_names_and_totals = cust_names_and_totals + specific_cust_first + " " + specific_cust_last + " ";
			int num_of_items = scan.nextInt();
			double cust_total_price = 0.0;
			for (int j = 0; j < num_of_items; j++) {
				int num_of_specific_item = scan.nextInt();
				String specific_item = scan.next();
				int price_index = items.indexOf(specific_item) + specific_item.length();
				String price_of_specific_item = items.substring(price_index, price_index + 5);
				Scanner scan_price = new Scanner(price_of_specific_item);
				double price = scan_price.nextDouble();
				double item_tot_price = num_of_specific_item * price;
				cust_total_price += item_tot_price;
				
			}
			System.out.println(cust_total_price);
		}
		
		
	}

	// 2 potential ideas: either create a string[] with all the pricing data or create one concatenated string containing
	// all the items and their prices, then use substrings and indexat to retrieve the price given the name of the item

}
