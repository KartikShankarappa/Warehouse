package com.kartik.warehouse.inventory;

public class Tablet<T extends ElectronicAccessory> extends ElectronicDevices<T> {

	public Tablet(String brandName, Double price, T electronicAccesoryDetails) {
		super(brandName, price, electronicAccesoryDetails);
	}

}
