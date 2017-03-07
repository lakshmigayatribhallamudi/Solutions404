package com.mani.gayi.pg.app;

import java.util.Date;
import java.util.List;

public class Apartment {

	// is used to define the name of appartment.
	private String appartmentName;

	// is used to list of floor
	private List<Floor> floor;

	// is used to define has appartment has lift facility or not.
	private boolean hasLiftFacility;
		
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	//used to define createDate
	private Date createdOn;
		
	//used to define createdBy
	private String createdBy;
		
	//used to define updatedon
	private Date updatedOn;
		
	//used to define updatedBy
	private Date updatedBy;

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
