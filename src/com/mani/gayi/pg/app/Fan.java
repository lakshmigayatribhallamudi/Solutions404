package com.mani.gayi.pg.app;

import java.util.Date;

public class Fan {

	// Used to define is fan working

	private boolean fanworking;

	// Used to define fanstate i.e On or Off

	private String fanState;
	
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

	public boolean isFanworking() {
		return fanworking;
	}

	public void setFanworking(boolean fanworking) {
		this.fanworking = fanworking;
	}

	public String getFanState() {
		return fanState;
	}

	public void setFanState(String fanState) {
		this.fanState = fanState;
	}

}
