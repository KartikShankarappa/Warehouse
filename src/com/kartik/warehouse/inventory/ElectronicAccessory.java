package com.kartik.warehouse.inventory;

/**
 * User: ksh326
 * Date: 03/31/15
 * Time: 1:53 PM
 */

/**
 * This class is for having any type of accessory that can be used with other
 * electronic devices such as TV, BlueRay player, Playstation, Tablets etc.
 * Example of some accessories might be TV stand, BlueRay player lens cleaner, tablet cover etc.
 * @author KARTIK
 *
 */

public class ElectronicAccessory extends Electronic {

	private final String accessoryName;
	
	public ElectronicAccessory(String accessoryName, Double price) {
		super(price);
		
		if(accessoryName == null || accessoryName.equals("")) {
			throw new NullPointerException("Accessory Name not Specified \n");
		}
		
		this.accessoryName = accessoryName;
	}
	
	/**
	 * A getter method to obtain the Accessory name
	 * @return accessoryName
	 */
	public String getAccessoryName() {
		return accessoryName;
	}
	
}
