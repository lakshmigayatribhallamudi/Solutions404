package com.mani.gayi.pg.app;

import java.util.Date;

public class Tap {
	// used to define is tap working
	private boolean tapWorking;

	// used to define tap state i.e On or Off
	private String tapState;
	
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

	public boolean isTapWorking() {
		return tapWorking;
	}

	public void setTapWorking(boolean tapWorking) {
		this.tapWorking = tapWorking;
	}

	public String getTapState() {
		return tapState;
	}

	public void setTapState(String tapState) {
		this.tapState = tapState;
	}
}
