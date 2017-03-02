package com.mani.gayi.pg.app;

public class Comode {
	
	//is used to define Comode cleaned.
	private boolean comodeworking;
	
	//is used to define problemStatement
	private String problemStatement;
	
	//is used to define style i.e indian or westren.
	private String style;

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
