package com.mani.gayi.pg.app;

public class AddTenent implements ITenent {

	@Override
	public void addTenentToABed(Tenent tenent, Bed bed) {
		// TODO Auto-generated method stub
		tenent.setBed(bed);
		bed.setTenet(tenent);

	}

}
