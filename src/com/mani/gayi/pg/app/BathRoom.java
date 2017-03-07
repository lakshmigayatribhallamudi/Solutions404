package com.mani.gayi.pg.app;

public class BathRoom {

	// is used to define the Tap object.
	private Tap tap;

	// is used to define the Grecor object.
	private Grecor grecor;
	
	//is used to define comode in a bathroom
	private Comode comode;
	
	//is used to define if a bathroom has tap facility
	private boolean tapfacility;
	
	public boolean hassTapfacility() {
		return tapfacility;
	}

	public void setTapfacility(boolean tapfacility) {
		this.tapfacility = tapfacility;
	}

	public Comode getComode() {
		return comode;
	}

	public void setComode(Comode comode) {
		this.comode = comode;
	}

	public Tap getTap() {
		return tap;
	}

	public void setTap(Tap tap) {
		this.tap = tap;
	}

	public Grecor getGrecor() {
		return grecor;
	}

	public void setGrecor(Grecor grecor) {
		this.grecor = grecor;
	}

}
