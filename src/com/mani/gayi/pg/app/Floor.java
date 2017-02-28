package com.mani.gayi.pg.app;

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

	public boolean isLiftFacility() {
		return liftFacility;
	}

	public void setLiftFacility(boolean liftFacility) {
		this.liftFacility = liftFacility;
	}

	public boolean isWifiFacility() {
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
