package com.mani.gayi.pg.app;

public class Bed {
	
	//used to define BedNo;
	private String BedNo;
	
	//used to define bed type i.e either individual bed or double decker.
	private String BedType;
	
	//used to define the room object;
	private Room room;
	
	//useed to define Tenet object
	private  Tenent tenet;

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
