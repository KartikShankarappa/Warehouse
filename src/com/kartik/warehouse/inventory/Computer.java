package com.kartik.warehouse.inventory;

public class Computer extends Electronic {
	
	private final Double ghz;
	
	public Computer(Double price, Double ghz) {
		super(price);
		
		if(ghz == null) {
			throw new NullPointerException("Ghz value not Specified \n");
		}
		
		this.ghz = ghz;
	}
	
	/**
	 * A getter method to obtain the ghz field value
	 * @return ghz
	 */
	public Double getGhzValue() {
		return ghz;
	}

}
