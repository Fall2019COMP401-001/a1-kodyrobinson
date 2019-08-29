package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_of_items = scan.nextInt();
		String[] items = null;
		for (int i = 0; i < num_of_items; i++) {
			items = append(items, "0");
			items = append(items, "0");
			items = append(items, scan.next());
			double irrelevant_double = scan.nextDouble();
		}
		int num_of_customers = scan.nextInt();
		for (int i = 0; i < num_of_customers; i++) {
			String name = scan.next();
			name = scan.next();
			int num_of_cust_items = scan.nextInt();
			for (int j = 0; j < num_of_cust_items; j++) {
				int num_of_specific_item = scan.nextInt();
				String next_item = scan.next();
				int k = 0;
				while (!(items[k].equals(next_item))) {
					k += 1;
				}
				int num_customers = Integer.parseInt(items[k-2]);
				num_customers += 1;
				items[k-2] = String.format("%d", num_customers);
				int specific_item_total = Integer.parseInt(items[k-1]);
				specific_item_total += num_of_specific_item;
				items[k-1] = String.format("%d", specific_item_total);
			}
		}
		System.out.println(Arrays.toString(items));
	}
	static String[] append(String[] a, String b) {
		String[] temp = Arrays.copyOf(a, a.length+1);
		temp[temp.length-1] = b;
		return temp;
	}
}
