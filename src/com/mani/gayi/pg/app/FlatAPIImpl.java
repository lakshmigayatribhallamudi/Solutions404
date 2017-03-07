package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class FlatAPIImpl implements IFlatAPI {

	
	/*
	 * This method creates a room and adds it to the given flat.
	 * */
	@Override
	public boolean addRoomToAFlat(Room room, Flat flat) {
		
		// if any object is null then we cannot add
		if(room==null || flat ==null)
		{
			return false;
		}
		
		// if the flat contains rooms.
		if(flat.getRooms()!=null)
		{
			flat.getRooms().add(room);
		}
		else
		{
			// Fat doesn't contain any rooms...
			flat.setRooms(new CollectionUtility<Room>().addObjectToList(room));
		}
		
		// setting the flat object to the room.
		room.setFlat(flat);
		return true;
	}

	@Override
	public void addFlatToaFloor(Flat flat, Floor floor) {
		// TODO Auto-generated method stub
		flat.setFloor(floor);
		List<Flat> l=new ArrayList<Flat >();
		l.add(flat);
		floor.setFlats(l);
		
	}

}
