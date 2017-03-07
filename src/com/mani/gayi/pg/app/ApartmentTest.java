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
		room1.setRoomNo("101");
		List<Bed> listOfBeds=new ArrayList<Bed>();
		/*room1.setFan(new CollectionUtility<Fan>().addObjectToList(fan100,1));
		String fandata = room1.getFan().get(0).getFanState();
		System.out.println("Room 100 fan data:"+fandata);*/
		
		Bed b=new Bed();
		b.setBedNo("1");
		b.setBedType("SingleCot");
		b.setRoom(room1);
		Tenent t=new Tenent();
		t.setTenentName("Gayi");
		t.setRoom(room1);
		b.setTenet(t);
		
		
		
		
		Bed b1=new Bed();
		b1.setBedNo("2");
		b1.setBedType("DoubleCot");
		b1.setRoom(room1);
		Tenent t2=new Tenent();
		t2.setTenentName("Mani");
		t2.setRoom(room1);
		b1.setTenet(t2);
		
		listOfBeds.add(b);
		listOfBeds.add(b1);
		room1.setListOfBeds(listOfBeds);

		for(Bed b2:listOfBeds)
		{
	System.out.println("Tenent " +b2.getTenet().getTenentName() + 
			" is satying in " +b2.getRoom().getRoomNo() +" room on bed No" +b2.getBedNo() +
		" out of total beds in a room are " +b2.getRoom().getListOfBeds().size());
		}
	

}
}