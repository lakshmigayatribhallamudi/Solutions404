package com.mani.gayi.pg.app;

public class Fan {

	// Used to define is fan working

	private boolean fanworking;

	// Used to define fanstate i.e On or Off

	private String fanState;

	public boolean isFanworking() {
		return fanworking;
	}

	public void setFanworking(boolean fanworking) {
		this.fanworking = fanworking;
	}

	public String getFanState() {
		return fanState;
	}

	public void setFanState(String fanState) {
		this.fanState = fanState;
	}

}
