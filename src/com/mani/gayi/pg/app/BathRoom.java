package com.mani.gayi.pg.app;

import java.util.Date;

public class BathRoom {

	// is used to define the Tap object.
	private Tap tap;

	// is used to define the Grecor object.
	private Grecor grecor;
	
	//is used to define comode in a bathroom
	private Comode comode;
	
	//is used to define if a bathroom has tap facility
	private boolean tapfacility;
	
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Date getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Date updatedBy) {
		this.updatedBy = updatedBy;
	}

	//used to define createDate
	private Date createdOn;
		
	//used to define createdBy
	private String createdBy;
		
	//used to define updatedon
	private Date updatedOn;
		
	//used to define updatedBy
	private Date updatedBy;
		
	
	public boolean hasTapfacility() {
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
