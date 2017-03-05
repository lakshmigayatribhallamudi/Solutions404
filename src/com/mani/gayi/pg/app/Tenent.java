package com.mani.gayi.pg.app;

import java.util.Date;
import java.util.List;

public class Tenent {
	// Used to define tenentName
	private String tenentName;

	// used to define the room object
	private Room room;

	// used to define Joiningdate
	private Date joiningDate;

	// used to define advancePaidByTenent
	private Double advancePaid;
	
	//used to define Balance amount to be paid by the tenent
	private Double balanceRentTobePaid;
	
	
	//used to define list of months for which the rent payment is pending
	private List<String> rentPaymentPendingMonths;

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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
