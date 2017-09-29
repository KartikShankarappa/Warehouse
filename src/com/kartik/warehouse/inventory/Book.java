package com.kartik.warehouse.inventory;

public class Book extends AbstractItem{

	private final String title;
	
	protected Book(Double price, String title) {
		super(price);
		
		if(title == null || title.equals("")) {
			throw new NullPointerException("Title not Specified \n");
		}
		
		this.title = title;
	}	

	/**
	 * A getter method to obtain the title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
}
