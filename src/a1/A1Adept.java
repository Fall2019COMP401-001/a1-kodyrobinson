package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_of_store_items = scan.nextInt();
		
		// Create an array of strings to store all info that must be referenced later
		String[] items = {};
		// Insert a for loop to iterate through all the items, storing the names as strings and their prices
		for (int i = 0; i < num_of_store_items; i++) {
			String item_name = scan.next();
			double item_price = scan.nextDouble();
			items = append(items, item_name);
			items = append(items, String.format("%.2f", item_price));
		}
		int num_of_customers = scan.nextInt();
				
		
		// these strings will need to become arrays
		String[] cust_names_and_totals = {};
		
		String[] list_of_total_prices = {};
		
		double avg = 0.0;
		
		// iteration through the input. leave this but change it up to work with arrays instead of strings
		
		for (int i = 0; i < num_of_customers; i++) {
			String specific_cust_first = scan.next();
			String specific_cust_last = scan.next();
			cust_names_and_totals = append(cust_names_and_totals, specific_cust_first);
			cust_names_and_totals = append(cust_names_and_totals, specific_cust_last);
			int num_of_items = scan.nextInt();
			double cust_total_price = 0.0;
			
			for (int j = 0; j < num_of_items; j++) {
				int num_of_specific_item = scan.nextInt();
				String specific_item = scan.next();
				int k = 0;
				while (!(items[k].contentEquals(specific_item))) {
					k += 1;
				}
				int price_index = k + 1;
				String price_of_specific_item = items[price_index];
				@SuppressWarnings("resource")
				Scanner scan_price = new Scanner(price_of_specific_item);
				double price = scan_price.nextDouble();
				double item_tot_price = num_of_specific_item * price;
				cust_total_price += item_tot_price;
				
			}
			cust_names_and_totals = append(cust_names_and_totals, String.format("%.2f", cust_total_price));
			list_of_total_prices = append(list_of_total_prices, String.format("%.2f", cust_total_price));
			
		}
		System.out.println(items.toString());
		System.out.println(cust_names_and_totals.toString());
		System.out.println(list_of_total_prices.toString());
		// delete these scanners and heavily review the following code
		
	
		
		avg /= num_of_customers;
		
	}
	static String[] append(String[] a, String b) {
		String[] temp = Arrays.copyOf(a, a.length+1);
		temp[temp.length-1] = b;
		return temp;
	}

	// 2 potential ideas: either create a string[] with all the pricing data or create one concatenated string containing
	// all the items and their prices, then use substrings and indexat to retrieve the price given the name of the item

}
