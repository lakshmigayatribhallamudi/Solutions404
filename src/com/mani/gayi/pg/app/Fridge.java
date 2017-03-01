package com.mani.gayi.pg.app;

public class Fridge {
	// Used to define is fridge working

	private boolean fridgeworking;

	// Used to define fanstate i.e On or Off

	private String fridgeState;

	public boolean isFridgeworking() {
		return fridgeworking;
	}

	public void setFridgeworking(boolean fridgeworking) {
		this.fridgeworking = fridgeworking;
	}

	public String getFridgeState() {
		return fridgeState;
	}

	public void setFridgeState(String fridgeState) {
		this.fridgeState = fridgeState;
	}

}
