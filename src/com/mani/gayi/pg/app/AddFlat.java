package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class AddFlat implements IFlat {

	@Override
	public void addRoomsToAFlat(Room room, Flat flat) {
		// TODO Auto-generated method stub
		List<Room> rooms=new ArrayList<Room>();
		flat.setRooms(rooms);
		room.setFlat(flat);
	}

	@Override
	public void addFlatToaFloor(Flat flat, Floor floor) {
		// TODO Auto-generated method stub
		flat.setFloor(floor);
		List<Flat> l=new ArrayList<Flat>();
		l.add(flat);
		floor.setFlats(l);
		
	}

}
