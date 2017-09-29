package com.kartik.warehouse.inventory;

/**
 * User: ksh326
 * Date: 03/31/15
 * Time: 1:53 PM
 */

public abstract class ElectronicDevices<T extends ElectronicAccessory> extends Electronic {

	private final String brandName;
	private final T electronicAccesoryDetails;
	
	protected ElectronicDevices(String brandName, Double price, T electronicAccesoryDetails) {
		super(price);
		
		if(brandName == null || brandName.equals("")) {
			throw new NullPointerException("Brand Name not Specified \n");
		}
		
		this.brandName = brandName;
		this.electronicAccesoryDetails = electronicAccesoryDetails;
	}
	
	/**
	 * A getter method to obtain the details of the electronic devices
	 * @return electronicAccessoryDetails
	 */
	public T getElectronicDeviceDetails() {
		return electronicAccesoryDetails;
	}
	
	/**
	 * A getter method to obtain the brand name
	 * @return brandName
	 */
	public String getBrandName() {
		return brandName;
	}

}
