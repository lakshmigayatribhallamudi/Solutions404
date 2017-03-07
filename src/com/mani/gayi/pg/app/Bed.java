package com.mani.gayi.pg.app;

import java.util.Date;

public class Bed {

	// used to define BedNo;
	private String BedNo;

	// used to define bed type i.e either individual bed or double decker.
	private String BedType;

	// used to define the room object;
	private Room room;

	// used to define Tenet object
	private Tenent tenet;

	// used to define is bed vacant
	private boolean isVacant;

	// used to define date Bed Will Get Vacated
	private Date bedGetWillVacatedon;
	
	//used to define Flat 
	private Flat flat;

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	public boolean isVacant() {
		return isVacant;
	}

	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}

	public Date getBedGetWillVacatedon() {
		return bedGetWillVacatedon;
	}

	public void setBedGetWillVacateond(Date bedGetWillVacatedon) {
		this.bedGetWillVacatedon = bedGetWillVacatedon;
	}

	public Tenent getTenet() {
		return tenet;
	}

	public void setTenet(Tenent tenet) {
		this.tenet = tenet;
	}

	public String getBedNo() {
		return BedNo;
	}

	public void setBedNo(String bedNo) {
		BedNo = bedNo;
	}

	public String getBedType() {
		return BedType;
	}

	public void setBedType(String bedType) {
		BedType = bedType;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
