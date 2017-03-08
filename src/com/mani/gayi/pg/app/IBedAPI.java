package com.mani.gayi.pg.app;

public interface IBedAPI {

	public Bed createABed(Room room);

	public Bed createABed(Room room, String bedNumber);

	public Bed createABed(Room room, String bedNumber, String bedType);

	public Bed createABed(Room room, String bedNumber, String bedType, boolean isVacant);
}