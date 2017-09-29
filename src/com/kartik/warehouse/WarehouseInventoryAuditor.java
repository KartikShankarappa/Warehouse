package com.kartik.warehouse;

import java.util.Collection;

import com.kartik.warehouse.inventory.Book;
import com.kartik.warehouse.inventory.Electronic;
import com.kartik.warehouse.inventory.Item;


public class WarehouseInventoryAuditor {

    // method to print the individual prices of a Collection of any Item type
	/**
	 * Method to print the individual prices of a Collection of any Item type
	 * @param items
	 */
	public static void printItemPrices(Collection<? extends Item> items) {
		
		// I have used a helper method to check if the specified collection is empty or not
		if (isCollectionEmpty(items)) {
			throw new IllegalArgumentException("Collection is Empty \n");
		}
		
		for (Item item : items) {
			System.out.printf("The price of this item is : %f%n", item.getPrice());
		}
	}

    // method to print the individual prices of a Collection of any Electronic types
	
	/**
	 * Method to print the individual prices of a Collection of any Electronic type
	 * @param electronicItems
	 */
	public static void printElectronicItemPrices(Collection<? extends Electronic> electronicItems) {
		
		printItemPrices(electronicItems);
	}
	
	
    // method to print the individual prices of a Collection of any Book types
	
	/**
	 * Method to print the individual prices of a Collection of any Book type
	 * @param bookItems
	 */
	public static void printBookPrices(Collection<? extends Book> bookItems) {
		
		printItemPrices(bookItems);
	}
	
	/**
	 * A helper method to check if the collection is empty or not
	 * @param items
	 */
	public static boolean isCollectionEmpty(Collection<? extends Item> items) {
		
		return items == null || items.isEmpty();
	}

}
