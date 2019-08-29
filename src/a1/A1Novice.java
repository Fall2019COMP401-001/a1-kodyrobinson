package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int num_of_customers = scan.nextInt();
		
		// For loop iterates through each customer and assigns their info to a string
		for(int i = 0; i < num_of_customers; i++) {
			String customer_first_name = scan.next();
			char customer_first_initial = customer_first_name.charAt(0);
			String customer_last_name = scan.next();
			int num_of_items = scan.nextInt();
		
			// This double will compile the prices of all the items purchased by an individual customers
			double specific_cust_tot_price = 0.0;
		
			// For loop iterates for each item for a specified customer, adding the price of the item to the 
			// customer's total price double
			for(int j = 0; j < num_of_items; j++) {
				int num_of_specific_item = scan.nextInt();
				// Specific item name is not relevant for the output of the program
				@SuppressWarnings("unused")
				String specific_item_name = scan.next();
				double specific_item_ind_price = scan.nextDouble();
				double specific_item_tot_price = specific_item_ind_price * num_of_specific_item;
				specific_cust_tot_price += specific_item_tot_price;
			}
			// Insert a print function such that it prints out each customers instances of the variables
			// so it can iterate through using the same variables printing all of its values
			System.out.println(customer_first_initial + ". " + customer_last_name + ": " + String.format("%.2f", specific_cust_tot_price));
		
		}	
	}
}
