package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class BedAPIImpl implements IBedAPI {

	/****
	 * This Method creates a bed to a room.
	 * 
	 * Bed has room object so, we need to set Room first.
	 * 
	 * Can get the room object set from bed and add the bed to the room.
	 * 
	 */
	@Override
	public boolean createABed(Bed bed) {
		// TODO Auto-generated method stub

		// if bed object is not set return false

		if (bed == null) {

			return false;
		}

		// if the room object has already list of bed objects
		// i.e bed.getRoom().getListOfBeds()!= null
		// then add the incoming bed object to existing list of bed objects of a
		// room.

		if (bed.getRoom().getListOfBeds() != null) {
			bed.getRoom().getListOfBeds().add(bed);

		}
		// if the room object itself is not set.
		// then returning false
		else {

			if (bed.getRoom() == null) {
				return false;
			}

			// if the room object is set to a bed, but the list of beds are not
			// set to a room.
			// then set list of beds in a room
			else {
				bed.getRoom().setListOfBeds(new CollectionUtility<Bed>().addObjectToList(bed));
			}
		}
		return true;

	}
}
