package com.mani.gayi.pg.app;

import java.util.Date;

public class Wifi {

	// Used to define is wifi working

	private boolean wifiWorking;

	// Used to define wifistate i.e On or Off

	private String wifiState;
	
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

	public boolean isWifiWorking() {
		return wifiWorking;
	}

	public void setWifiWorking(boolean wifiWorking) {
		this.wifiWorking = wifiWorking;
	}

	public String getWifiState() {
		return wifiState;
	}

	public void setWifiState(String wifiState) {
		this.wifiState = wifiState;
	}

}
