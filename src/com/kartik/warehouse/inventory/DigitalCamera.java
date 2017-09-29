package com.kartik.warehouse.inventory;

public class DigitalCamera extends Camera {

	private final Integer zoom;
	
	public DigitalCamera(Double price, Integer zoom) {
		super(price);
		
		if(zoom == null) {
			throw new NullPointerException("Zoom value not Specified \n");
		}
		
		this.zoom = zoom;
	}
	
	/**
	 * A getter method to obtain the zoom value
	 * @return zoom
	 */
	public Integer getZoomValue() {
		return zoom;
	}

}
