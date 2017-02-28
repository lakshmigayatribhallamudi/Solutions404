package com.mani.gayi.pg.app;

import java.util.List;

public class Room {
	// Used to define the numberOfBeds in a room
	private int numberOfBeds;
	
	// Used to define the roomNumber
	private int roomNo;
	
	// used to define the floor Number of a room
	private int floorNo;
	
	// is set to true if a room has attachedBathRoom else attachedBathRoom is
	// false
	private boolean attachedBathRoom;
	
	// is set to true if a room has fanFacility else fanFacility is false
	private boolean fanFacility;
	
	// is set to true if a room has lightFacility else lightFacility is false
	private boolean lightFacility;
	
	// is set to true if a room has tvFacility else tvFacility is false
	private boolean tvFacility;
	
	// is set to true if a room has fridgeFacility else fridgeFacility is false
	private boolean fridgeFacility;
	
	// Used to define the numberOfCupboards
	private int numberOfCupboards;

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public boolean isAttachedBathRoom() {
		return attachedBathRoom;
	}

	public void setAttachedBathRoom(boolean attachedBathRoom) {
		this.attachedBathRoom = attachedBathRoom;
	}

	public boolean isFanFacility() {
		return fanFacility;
	}

	public void setFanFacility(boolean fanFacility) {
		this.fanFacility = fanFacility;
	}

	public boolean isLightFacility() {
		return lightFacility;
	}

	public void setLightFacility(boolean lightFacility) {
		this.lightFacility = lightFacility;
	}

	public boolean isTvFacility() {
		return tvFacility;
	}

	public void setTvFacility(boolean tvFacility) {
		this.tvFacility = tvFacility;
	}

	public boolean isFridgeFacility() {
		return fridgeFacility;
	}

	public void setFridgeFacility(boolean fridgeFacility) {
		this.fridgeFacility = fridgeFacility;
	}

	public int getNumberOfCupboards() {
		return numberOfCupboards;
	}

	public void setNumberOfCupboards(int numberOfCupboards) {
		this.numberOfCupboards = numberOfCupboards;
	}

}
