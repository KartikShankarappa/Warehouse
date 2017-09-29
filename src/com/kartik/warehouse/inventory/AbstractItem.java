package com.kartik.warehouse.inventory;

public class AbstractItem implements Item {
	
	private final Double price;
	
	protected AbstractItem(Double price) {
		
		if(price == null) {
			throw new NullPointerException("Price not Specified \n");
		}
		
		this.price = price;
	}

	/**
	 * A getter method to obtain the price
	 * @return price
	 */
	@Override
	public Double getPrice() {
		return price;
	}
}
