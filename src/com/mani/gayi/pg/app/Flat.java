package com.mani.gayi.pg.app;

import java.util.List;

public class Flat {
	
	//is used to define the list of the bathrooms in a flat.
	private List<BathRoom> bathroom;

	// Defines list of room objects.
	
	public List<BathRoom> getBathroom() {
		return bathroom;
	}

	public void setBathroom(List<BathRoom> bathroom) {
		this.bathroom = bathroom;
	}

	private List<Room> rooms;

	// is set to true if flat has bathroom else it is false
	
	private boolean bathRoomfacility;

	// is set to true if flat has tv else it is false
	
	private boolean tvfacility;

	// is set to true if flat has fridge else it is false
	
	private boolean fridgefacility;

	// is set to true if flat has fan else it is false
	
	private boolean fanfacility;

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
	
	private boolean washingMachinefacility;

	// is set to true if a flat has wifiFacility else false.
	
	private boolean wifiFacility;

	// used to define the wifi password of the router in a flat
	
	private String wifiPassword;
	
	//used to define list of fans objects in a flat

	private List<Fan> fan;

	// used to define List of tv objects in a flat
	
	private List<TV> tv;
	
	// used to define List of wifi objects in a flat
	
	private List<Wifi> wifi;
	
	//used to define List of washingmachines.
	
	private List<WashingMachine> washingmachine;
	
	//used to define List of fridge in floor.
	
	private List<Fridge> fridge;
		

	public List<Fridge> getFridge() {
		return fridge;
	}

	public void setFridge(List<Fridge> fridge) {
		this.fridge = fridge;
	}

	public List<WashingMachine> getWashingmachine() {
		return washingmachine;
	}

	public void setWashingmachine(List<WashingMachine> washingmachine) {
		this.washingmachine = washingmachine;
	}

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

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public boolean isBathRoomfacility() {
		return bathRoomfacility;
	}

	public void setBathRoomfacility(boolean bathRoomfacility) {
		this.bathRoomfacility = bathRoomfacility;
	}

	public boolean isTvfacility() {
		return tvfacility;
	}

	public void setTvfacility(boolean tvfacility) {
		this.tvfacility = tvfacility;
	}

	public boolean isFridgefacility() {
		return fridgefacility;
	}

	public void setFridgefacility(boolean fridgefacility) {
		this.fridgefacility = fridgefacility;
	}

	public boolean isFanfacility() {
		return fanfacility;
	}

	public void setFanfacility(boolean fanfacility) {
		this.fanfacility = fanfacility;
	}

	public boolean isCommonFans() {
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

	public boolean isLiftFacility() {
		return liftFacility;
	}

	public void setLiftFacility(boolean liftFacility) {
		this.liftFacility = liftFacility;
	}

	public boolean isWashingMachinefacility() {
		return washingMachinefacility;
	}

	public void setWashingMachinefacility(boolean washingMachinefacility) {
		this.washingMachinefacility = washingMachinefacility;
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