package com.mani.gayi.pg.app;

public class Wifi {

	// Used to define is wifi working

	private boolean wifiWorking;

	// Used to define wifistate i.e On or Off

	private String wifiState;

	public boolean isWifiWorking() {
		return wifiWorking;
	}

	public void setWifiWorking(boolean wifiWorking) {
		this.wifiWorking = wifiWorking;
	}

	public String getWifiState() {
		return wifiState;
	}

	public void setWifiState(String wifiState) {
		this.wifiState = wifiState;
	}

}
