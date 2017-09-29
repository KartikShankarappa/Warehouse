package com.kartik.warehouse;

import java.util.ArrayList;
import java.util.Collection;

import com.kartik.warehouse.inventory.Item;

public class Warehouse {

    //the warehouse can hold any Collection of Item type

    private final Collection<? extends Item> items;

    public Warehouse(Collection<? extends Item> items) {
        this.items = items;
    }

    public Collection<? extends Item> getItems() {
        return items;
    }

    public Warehouse copy() {
    	int size;
    	
    	if(this.items == null) {
    		size = 0;
    	}
    	else {
    		size = this.items.size();
    	}
    	
    	Collection<Item> newItemCollection = new ArrayList<>(size);
    	
    	Warehouse.copy(items, newItemCollection);
    	
        return new Warehouse(newItemCollection);
    }

    private static Collection<? super Item> copy(Collection<? extends Item> from, Collection<? super Item> into) {
    	for (Item item : from) {
    		into.add(item);
    	}
        return into;
    }

}
