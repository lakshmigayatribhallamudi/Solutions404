package com.mani.gayi.pg.app;

import java.util.Date;

public class Grecor {

	// is used to is grecor working
	private boolean grecorWorking;

	// is used define the state of grecor i.e on or off
	private String grecorState;
	
	//used to define createDate
	private Date createdOn;
			
	//used to define createdBy
	private String createdBy;
			
	//used to define updatedon
	private Date updatedOn;
			
	//used to define updatedBy
	private Date updatedBy;
			

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

	public boolean isGrecorWorking() {
		return grecorWorking;
	}

	public void setGrecorWorking(boolean grecorWorking) {
		this.grecorWorking = grecorWorking;
	}

	public String getGrecorState() {
		return grecorState;
	}

	public void setGrecorState(String grecorState) {
		this.grecorState = grecorState;
	}

}
