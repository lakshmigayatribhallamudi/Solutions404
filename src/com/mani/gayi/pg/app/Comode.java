package com.mani.gayi.pg.app;

import java.util.Date;

public class Comode {

	// is used to define Comode cleaned.
	private boolean comodeworking;

	// is used to define problemStatement
	private String problemStatement;

	// is used to define style i.e indian or westren.
	private String style;
	
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

	public boolean isComodeworking() {
		return comodeworking;
	}

	public void setComodeworking(boolean comodeworking) {
		this.comodeworking = comodeworking;
	}

	public String getProblemStatement() {
		return problemStatement;
	}

	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}
