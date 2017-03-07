package com.mani.gayi.pg.app;

import java.util.Date;
import java.util.List;

public class Tenent {
	// Used to define tenentName.																						
	private String tenentName;

	// used to define phone no.
	private String phoneNo;

	// used to define Email id of the tenent.
	private String emailId;

	// used to define the point of contact.
	private String pointOfContact;

	// used to define the bed object.
	private Bed bed;

	// used to define Joiningdate
	private Date joiningDate;

	// used to define advancePaidByTenent
	private Double advancePaid;

	// used to define Balance amount to be paid by the tenent
	private Double balanceRentTobePaid;

	// used to define list of months for which the rent payment is pending
	private List<String> rentPaymentPendingMonths;
	
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

	public Double getBalanceRentTobePaid() {
		return balanceRentTobePaid;
	}

	public void setBalanceRentTobePaid(Double balanceRentTobePaid) {
		this.balanceRentTobePaid = balanceRentTobePaid;
	}

	public List<String> getRentPaymentPendingMonths() {
		return rentPaymentPendingMonths;
	}

	public void setRentPaymentPendingMonths(List<String> rentPaymentPendingMonths) {
		this.rentPaymentPendingMonths = rentPaymentPendingMonths;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Double getAdvancePaid() {
		return advancePaid;
	}

	public void setAdvancePaid(Double advancePaid) {
		this.advancePaid = advancePaid;
	}

	public String getTenentName() {
		return tenentName;
	}

	public void setTenentName(String tenentName) {
		this.tenentName = tenentName;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPointOfContact() {
		return pointOfContact;
	}

	public void setPointOfContact(String pointOfContact) {
		this.pointOfContact = pointOfContact;
	}

}
