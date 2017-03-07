package com.mani.gayi.pg.app;

import java.util.Date;
import java.util.List;

public class Floor {
	// used to define floor number
	
	private int floorNo;
	
	// used to define flats in a floor
	
	private List<Flat> flats;
	
	// used to define if a floor has lift facility.
	
	private boolean liftFacility;
	
	// is set to true if a flat has wifiFacility else false.
	
	private boolean wifiFacility;
	
	// used to define the wifi password of the router in a flat
	
	private String wifiPassword;
	
	//used to define list of fan objects in floor.
	
	private List<Fan> fan;

	//used to define List of fridge in floor.
	
	private List<Fridge> fridge;
	
	// used to define List of tv objects
	
	private List<TV> tv;
		
	//used to define List of washingmachines.
	
	public List<WashingMachine> getWashingmachine() {
		return washingmachine;
	}

	public List<Fridge> getFridge() {
		return fridge;
	}

	public void setFridge(List<Fridge> fridge) {
		this.fridge = fridge;
	}

	public void setWashingmachine(List<WashingMachine> washingmachine) {
		this.washingmachine = washingmachine;
	}

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

	private List<WashingMachine> washingmachine;

	//used to define createDate
	private Date createdOn;
			
	//used to define createdBy
	private String createdBy;
			
	//used to define updatedon
	private Date updatedOn;
			
	//used to define updatedBy
	private Date updatedBy;
			
		
	
	public List<Fan> getFan() {
		return fan;
	}

	public void setFan(List<Fan> fan) {
		this.fan = fan;
	}

	public List<TV> getTv() {
		return tv;
	}

	public void setTv(List<TV> tv) {
		this.tv = tv;
	}

	public List<Wifi> getWifi() {
		return wifi;
	}

	public void setWifi(List<Wifi> wifi) {
		this.wifi = wifi;
	}

	private List<Wifi> wifi;
	

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public List<Flat> getFlats() {
		return flats;
	}

	public void setFlats(List<Flat> flats) {
		this.flats = flats;
	}

	public boolean hasLiftFacility() {
		return liftFacility;
	}

	public void setLiftFacility(boolean liftFacility) {
		this.liftFacility = liftFacility;
	}

	public boolean hasWifiFacility() {
		return wifiFacility;
	}

	public void setWifiFacility(boolean wifiFacility) {
		this.wifiFacility = wifiFacility;
	}

	public String getWifiPassword() {
		return wifiPassword;
	}

	public void setWifiPassword(String wifiPassword) {
		this.wifiPassword = wifiPassword;
	}

}


