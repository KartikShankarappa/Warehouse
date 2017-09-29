package com.kartik.warehouse.inventory;

public class Refridgerator<T extends ElectronicAccessory> extends ElectronicDevices<T> {

	public Refridgerator(String brandName, Double price, T electronicAccesoryDetails) {
		super(brandName, price, electronicAccesoryDetails);
	}

}
