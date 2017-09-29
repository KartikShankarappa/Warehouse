package com.kartik.warehouse.inventory;

public class BlueRayPlayer<T extends ElectronicAccessory> extends ElectronicDevices<T> {

	public BlueRayPlayer(String brandName, Double price, T electronicAccesoryDetails) {
		super(brandName, price, electronicAccesoryDetails);
	}

}
