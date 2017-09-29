package com.kartik.warehouse.inventory;

public class Bookcover<T extends Book> extends AbstractItem {

	private final T book;
	
	public Bookcover(Double price, T book) {
		super(price);
		this.book = book;
	}
	
	/**
	 * A getter method to obtain the book.
	 * @return book
	 */
	public T getBook() {
		return book;
	}
	
}
