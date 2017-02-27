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
	
	public static Double calculateRentForGivenDays(Double rentForMonth,String daysInAmonth,int givenDays)
	{
		//Intialising the rent value to  '0'
		Double rent=0.0;
		//Converting the String type daysInAmonth value into double
		 
		Double daysInaGivenMonth=Double.parseDouble(daysInAmonth);
		
		if(rentForMonth<0 || Double.parseDouble(daysInAmonth)<0 || givenDays<0)
		{
			rent=0.0;
		}
		else
		{
		rent=(Double) ((rentForMonth*givenDays)/daysInaGivenMonth);
		}
		
		return rent;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double rent=calculateRentForGivenDays(5000.00,EVEN_DATE,12);
		System.out.println("rent::::"+rent);

	}

}
