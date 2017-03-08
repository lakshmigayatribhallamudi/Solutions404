package com.mani.gayi.pg.app;

import java.util.List;

public class BedAPIImpl implements IBedAPI {


	@Override
	public Bed createABed(Room room,String bedNumber,String bedType,boolean isVacant) {
		
		Bed bed = new Bed();
		
		if(room == null || room.getFlat()==null)
		{
			return bed;
		}
		
		bed.setBedNo(bedNumber);
		bed.setBedType(bedType);
		bed.setRoom(room);
		bed.setFlat(room.getFlat());
		bed.setVacant(isVacant);
		
		// updating the room object as well...
		
		// adding the new room to the bed.
		room.getListOfBeds().add(bed);
		
		return bed;
	}

	@Override
	public Bed createABed(Room room) {
		return createABed(room,null);
	}

	@Override
	public Bed createABed(Room room, String bedNumber) {
		return createABed(room,bedNumber,null);
	}

	@Override
	public Bed createABed(Room room, String bedNumber, String bedType) {
		return createABed(room,bedNumber,bedType,false);
	}

	
}
