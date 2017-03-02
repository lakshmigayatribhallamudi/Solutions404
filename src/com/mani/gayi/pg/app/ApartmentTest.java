package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class ApartmentTest {
	
	public static void main(String[] args) {
		
		Apartment praneethaPG = new Apartment();
		
		praneethaPG.setAppartmentName("Praneetha PG for Ladies and Gents");
		
		Room room100 = new Room();
		room100.setAttachedBathRoom(true);

		// Fan Object.
		Fan fan100 = new Fan();
		fan100.setFanState("Working");
		fan100.setFanworking(true);
		
		// TV Object.
		TV tv100 = new TV();
		tv100.setTvState("Working");
		tv100.setTvworking(true);
		
		// Wifi Object
		Wifi wifi100 = new Wifi();
		wifi100.setWifiState("Working");
		wifi100.setWifiWorking(true);
		
		//Light Object
		Light light100 = new Light();
		light100.setLightState("Working");
		light100.setLightworking(true);
		
		// Fridge Object.
		Fridge fridge100 = new Fridge();
		fridge100.setFridgeState("Working");
		fridge100.setFridgeworking(true);
		
		
		
		Room room1 = new Room();
		room1.setFan(new CollectionUtility<Fan>().addObjectToList(fan100));
		String fandata = room1.getFan().get(0).getFanState();
		System.out.println("Room 100 fan data:"+fandata);
	}
	

}
