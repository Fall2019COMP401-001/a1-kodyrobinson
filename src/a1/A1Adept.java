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
		
		String list_of_total_prices = "";
		
		double avg = 0.0;
		
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
				String price_of_specific_item = items.substring(price_index, price_index + 6);
				Scanner scan_price = new Scanner(price_of_specific_item);
				double price = scan_price.nextDouble();
				double item_tot_price = num_of_specific_item * price;
				cust_total_price += item_tot_price;
				
			}
			list_of_total_prices = list_of_total_prices + String.format("%.2f", cust_total_price) + " ";
			
		}
		
		Scanner scan_list = new Scanner(list_of_total_prices);
		
		int price1_index = 1;
		int price2_index = 2;
		
		double price1 = scan_list.nextDouble();
		double price2 = scan_list.nextDouble();
		for (int i = 0; i < num_of_customers-2; i++) {
			
			if (price1 > price2) {
				price2 = scan_list.nextDouble();
				if (price2_index > price1_index) {
					price2_index += 1;
				} else {
					price2_index += 2;
				}
			} else {
				price1 = scan_list.nextDouble();
				if (price1_index > price2_index) {
					price1_index += 1;
				} else {
					price1_index += 2;
				}
				
			}
		
		}
		int max_index = 0;
		if (price1_index > price2_index) {
			max_index = price1_index;
		} else {
			max_index = price2_index;
		}
		double max_price = 0.0;
		Scanner scan_price_list = new Scanner(list_of_total_prices);
		for (int i = 0; i < max_index; i++) {
			max_price = scan_price_list.nextDouble();
		}
		
		System.out.println(max_price);
		
		
		
		avg /= num_of_customers;
		
	}

	// 2 potential ideas: either create a string[] with all the pricing data or create one concatenated string containing
	// all the items and their prices, then use substrings and indexat to retrieve the price given the name of the item

}
