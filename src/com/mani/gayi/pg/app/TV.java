package com.mani.gayi.pg.app;

public class TV {

	// Used to define is tv working

	private boolean tvworking;

	// Used to define tvstate i.e On or Off

	private String tvState;

	public boolean isTvworking() {
		return tvworking;
	}

	public void setTvworking(boolean tvworking) {
		this.tvworking = tvworking;
	}

	public String getTvState() {
		return tvState;
	}

	public void setTvState(String tvState) {
		this.tvState = tvState;
	}

}
