package com.mani.gayi.pg.app;

public class Tap {
	// used to define is tap working
	private boolean tapWorking;

	// used to define tap state i.e On or Off
	private String tapState;

	public boolean isTapWorking() {
		return tapWorking;
	}

	public void setTapWorking(boolean tapWorking) {
		this.tapWorking = tapWorking;
	}

	public String getTapState() {
		return tapState;
	}

	public void setTapState(String tapState) {
		this.tapState = tapState;
	}
}
