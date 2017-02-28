package com.mani.gayi.pg.app;

import java.util.List;

public class Room {
	// Used to define the numberOfBeds in a room
	private int numberOfBeds;

	// Used to define the roomNumber
	private String roomNo;

	// used to define the floor Number of a room
	private String floorNo;

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

	// Used to define the room types i.e single sharing,two sharing,three
	// sharing
	private String roomType;

	// is set to true if a flat has wifiFacility else false.
	private boolean wifiFacility;

	// used to define the wifi password of the router in a flat
	private String wifiPassword;

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


	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	public boolean hasAttachedBathRoom() {
		return attachedBathRoom;
	}

	public void setAttachedBathRoom(boolean attachedBathRoom) {
		this.attachedBathRoom = attachedBathRoom;
	}

	public boolean hasFanFacility() {
		return fanFacility;
	}

	public void setFanFacility(boolean fanFacility) {
		this.fanFacility = fanFacility;
	}

	public boolean hasLightFacility() {
		return lightFacility;
	}

	public void setLightFacility(boolean lightFacility) {
		this.lightFacility = lightFacility;
	}

	public boolean hasTvFacility() {
		return tvFacility;
	}

	public void setTvFacility(boolean tvFacility) {
		this.tvFacility = tvFacility;
	}

	public boolean hasFridgeFacility() {
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
