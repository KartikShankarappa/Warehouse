package com.kartik.warehouse.inventory;

public class Television<T extends ElectronicAccessory> extends ElectronicDevices<T> {

	public Television(String brandName, Double price, T electronicAccesoryDetails) {
		super(brandName, price, electronicAccesoryDetails);
	}
}
