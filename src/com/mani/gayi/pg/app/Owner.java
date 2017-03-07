package com.mani.gayi.pg.app;

import java.util.Date;

public class Owner {
	
	//used to define owner name
	private String ownerName;
	
	//used to define ownerPhone
	private String ownerPhno;
	
	//used to define ownerEmail
	private String ownerEmail;
	
	//used to define createDate
	private Date createdOn;
	
	//used to define createdBy
	private String createdBy;
	
	//used to define updatedon
	private Date updatedOn;
	
	//used to define updatedBy
	private Date updatedBy;
	
	
	
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhno() {
		return ownerPhno;
	}

	public void setOwnerPhno(String ownerPhno) {
		this.ownerPhno = ownerPhno;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

}
