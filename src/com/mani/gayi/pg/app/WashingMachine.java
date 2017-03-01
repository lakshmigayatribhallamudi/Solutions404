package com.mani.gayi.pg.app;

public class WashingMachine {

	// used to define the state of washingmachine

	private String washingmachinestate;

	// used to define if washingmachine is working or not.

	private boolean washingmachineworking;

	public String getWashingmachinestate() {
		return washingmachinestate;
	}

	public void setWashingmachinestate(String washingmachinestate) {
		this.washingmachinestate = washingmachinestate;
	}

	public boolean isWashingmachineworking() {
		return washingmachineworking;
	}

	public void setWashingmachineworking(boolean washingmachineworking) {
		this.washingmachineworking = washingmachineworking;
	}

}
