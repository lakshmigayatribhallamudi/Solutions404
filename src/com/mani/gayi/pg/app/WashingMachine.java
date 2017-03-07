package com.mani.gayi.pg.app;

import java.util.Date;

public class WashingMachine {

	// used to define the state of washingmachine

	private String washingmachinestate;

	// used to define if washingmachine is working or not.

	private boolean washingmachineworking;
	
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

	public String getWashingmachinestate() {
		return washingmachinestate;
	}

	public void setWashingmachinestate(String washingmachinestate) {
		this.washingmachinestate = washingmachinestate;
	}

	public boolean isWashingmachineworking() {
		return washingmachineworking;
	}

	public void setWashingmachineworking(boolean washingmachineworking) {
		this.washingmachineworking = washingmachineworking;
	}

}
