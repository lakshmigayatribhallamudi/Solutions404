package com.mani.gayi.pg.app;

import java.util.ArrayList;
import java.util.List;

public class BedAPIImpl implements IBedAPI {

	@Override
	public void createABed(Room room, Bed bed) {
		// TODO Auto-generated method stub
		List<Bed> bed1 =new ArrayList<Bed>();
		bed1.add(bed);
		room.setListOfBeds(bed1);
	}}
