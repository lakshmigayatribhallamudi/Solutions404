package com.mani.gayi.pg.app;

import java.util.List;

public class Flat {

	// Defines list of room objects.
	private List<Room> rooms;
	
	// is set to true if flat has bathroom else it is false
	private boolean bathRoom;
	
	// is set to true if flat has tv else it is false
	private boolean tv;
	
	// is set to true if flat has fridge else it is false
	private boolean fridge;
	
	// is set to true if flat has fan else it is false
	private boolean fan;
	
	// is set to true if flat has commonFans else it is false
	private boolean commonFans;
	
	// Defines the number of fans in a flat
	private int totalFans;
	
	// Defines the number of tvs in a flat
	private int totalTvs;
	
	// Defines the number of Grecors in a flat.
	private int totalGrecors;
	
	// Defines the number of cupboards in a flat.
	private int totalCupBoards;
	
	// is set to true if a flat has Lift facility else false.
	private boolean liftFacility;
	
	// is set to true if a flat has washing machine else false.
	private boolean washingMachine;

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public boolean hasBathRoom() {
		return bathRoom;
	}

	public void setBathRoom(boolean bathRoom) {
		this.bathRoom = bathRoom;
	}

	public boolean hasTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean hasFridge() {
		return fridge;
	}

	public void setFridge(boolean fridge) {
		this.fridge = fridge;
	}

	public boolean hasFan() {
		return fan;
	}

	public void setFan(boolean fan) {
		this.fan = fan;
	}

	public boolean hasCommonFans() {
		return commonFans;
	}

	public void setCommonFans(boolean commonFans) {
		this.commonFans = commonFans;
	}

	public int getTotalFans() {
		return totalFans;
	}

	public void setTotalFans(int totalFans) {
		this.totalFans = totalFans;
	}

	public int getTotalTvs() {
		return totalTvs;
	}

	public void setTotalTvs(int totalTvs) {
		this.totalTvs = totalTvs;
	}

	public int getTotalGrecors() {
		return totalGrecors;
	}

	public void setTotalGrecors(int totalGrecors) {
		this.totalGrecors = totalGrecors;
	}

	public int getTotalCupBoards() {
		return totalCupBoards;
	}

	public void setTotalCupBoards(int totalCupBoards) {
		this.totalCupBoards = totalCupBoards;
	}

	public boolean hasLiftFacility() {
		return liftFacility;
	}

	public void setLiftFacility(boolean liftFacility) {
		this.liftFacility = liftFacility;
	}

	public boolean hasWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(boolean washingMachine) {
		this.washingMachine = washingMachine;
	}

}
