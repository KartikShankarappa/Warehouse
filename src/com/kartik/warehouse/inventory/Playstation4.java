package com.kartik.warehouse.inventory;

public class Playstation4<T extends ElectronicAccessory> extends ElectronicDevices<T> {

	public Playstation4(String brandName, Double price, T electronicAccesoryDetails) {
		super(brandName, price, electronicAccesoryDetails);
	}

}
