package com.mani.gayi.pg.app;

import java.util.List;

public class Appartment {

	// is used to define the name of appartment.
	private String appartmentName;

	// is used to list of floor
	private List<Floor> floor;

	// is used to define has appartment has lift facility or not.
	private boolean hasLiftFacility;

	public String getAppartmentName() {
		return appartmentName;
	}

	public void setAppartmentName(String appartmentName) {
		this.appartmentName = appartmentName;
	}

	public List<Floor> getFloor() {
		return floor;
	}

	public void setFloor(List<Floor> floor) {
		this.floor = floor;
	}

	public boolean isHasLiftFacility() {
		return hasLiftFacility;
	}

	public void setHasLiftFacility(boolean hasLiftFacility) {
		this.hasLiftFacility = hasLiftFacility;
	}

}
