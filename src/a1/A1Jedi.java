package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_of_items = scan.nextInt();
		String[] items = {};
		// iterate through all of the items and append 0 for the number of customers and 0 for the number of that item sold
		// then append the name of the item. This allows the items info to remain constant and be tracking through iteration
		for (int i = 0; i < num_of_items; i++) {
			items = append(items, "0");
			items = append(items, "0");
			items = append(items, scan.next());
			// the price of the item does not matter for a1jedi, hence price is an irrelevant double
			double irrelevant_double = scan.nextDouble();
		}
		int num_of_customers = scan.nextInt();
		// iterate through the customers 
		for (int i = 0; i < num_of_customers; i++) {
			String name = scan.next();
			name = scan.next();
			int num_of_cust_items = scan.nextInt();
			String specific_cust_items = "";
			// iterate through the customers orders
			for (int j = 0; j < num_of_cust_items; j++) {
				int num_of_specific_item = scan.nextInt();
				String next_item = scan.next();
				int k = 0;
				// find the index of the specific item in the master array to add 1 customer and x number of the specific item
				while (!(items[k].equals(next_item))) {
					k += 1;
				}
				int num_customers = Integer.parseInt(items[k-2]);
				if (specific_cust_items.contains(next_item)) {
					num_customers -= 1;
				}
				specific_cust_items += next_item;
				num_customers += 1;
				items[k-2] = String.format("%d", num_customers);
				int specific_item_total = Integer.parseInt(items[k-1]);
				specific_item_total += num_of_specific_item;
				items[k-1] = String.format("%d", specific_item_total);
			}
		}
		// for loop to iterate through the array that says how many customers bought how many of what item
		// and print the desired output
		for (int i = 0; i < items.length; i+=3) {
			if (items[i].equals("0")) {
				System.out.println("No customers bought " + items[i+2]);
			} else {
				System.out.println(items[i] + " customers bought " + items[i+1] + " " + items[i+2]);
			}
		}
	}
	// method to append to a string array
	static String[] append(String[] a, String b) {
		String[] temp = Arrays.copyOf(a, a.length+1);
		temp[temp.length-1] = b;
		return temp;
	}
}
