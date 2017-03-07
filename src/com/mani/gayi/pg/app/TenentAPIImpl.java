package com.mani.gayi.pg.app;

public class TenentAPIImpl implements ITenentAPI {

	@Override
	public void addTenentToABed(Tenent tenent, Bed bed) {
		// TODO Auto-generated method stub
		tenent.setBed(bed);
		bed.setTenet(tenent);

	}

}
