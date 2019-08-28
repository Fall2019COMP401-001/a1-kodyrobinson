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
			items = append(items, String.format("%.3f", item_price));
		}
		int num_of_customers = scan.nextInt();
				
		
		// these strings will need to become arrays
		String[] cust_names_and_totals = {};
		
		double[] list_of_total_prices = {};
		
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
			avg += cust_total_price;
			cust_names_and_totals = append(cust_names_and_totals, String.format("%.2f", cust_total_price));
			list_of_total_prices = doubleappend(list_of_total_prices, cust_total_price);
			
		}
		
		
		
		
		// Now create the method to find the max, min, average, and names
		
		avg /= num_of_customers;
		
		int max_ind = max(list_of_total_prices);
		int min_ind = min(list_of_total_prices);
		double max_val = list_of_total_prices[max_ind];
		double min_val = list_of_total_prices[min_ind];
		int first_max_ind = 3 * max_ind;
		int last_max_ind = first_max_ind + 1;
		int first_min_ind = 3 * min_ind;
		int last_min_ind = first_min_ind + 1;
		String max_name = cust_names_and_totals[first_max_ind] + " " + cust_names_and_totals[last_max_ind];
		String min_name = cust_names_and_totals[first_min_ind] + " " + cust_names_and_totals[last_min_ind];
		
		
		
		// Now put the output here
		System.out.println("Biggest: " + max_name + " (" + String.format("%.2f", max_val) + ")");
		System.out.println("Smallest: " + min_name + " (" + String.format("%.2f", min_val) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
		
		
	}
	static String[] append(String[] a, String b) {
		String[] temp = Arrays.copyOf(a, a.length+1);
		temp[temp.length-1] = b;
		return temp;
	}
	static double[] doubleappend(double[] a, double b) {
		double[] temp = Arrays.copyOf(a, a.length+1);
		temp[temp.length-1] = b;
		return temp;
	}
	static int max(double[] a) {
		int max_index = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[max_index]) {
				max_index = i;
			}
		}
		return max_index;
	}
	static int min(double[] a) {
		int min_index = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[min_index]) {
				min_index = i;
			}
		}
		return min_index;
	}

}
