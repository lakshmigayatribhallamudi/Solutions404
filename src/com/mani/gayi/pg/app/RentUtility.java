package com.mani.gayi.pg.app;

/***
 * 
 * @author lbhallamudi
 *
 */

/**
 * This class contains utility functions based on rent calculations...
 * */
public class RentUtility {
	
	private static final  String ODD_DATE="31";
	private static final  String EVEN_DATE="30";
	private static final String FEB_DATE="29";
	
	public static int calculateRentForGivenDays(int rentForMonth,String daysOfmonth,int givenDays)
	{
		int rent=0;
		
		if(rentForMonth<0 || Integer.parseInt(daysOfmonth)<0 || givenDays<0)
		{
			rent=0;
		}
		else
		{
		rent=(rentForMonth*givenDays)/Integer.parseInt(daysOfmonth);
		}
		
		return rent;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rent=calculateRentForGivenDays(-250,EVEN_DATE,12);
		System.out.println("rent::::"+rent);

	}

}
