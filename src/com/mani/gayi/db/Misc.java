package com.mani.gayi.db;

public class Misc {

	public static final String EMPTY_STRING = "";

	/**
	 * Determine if the given string is null or empty.
	 *
	 * @parm s The string to check for null.
	 *
	 * @return true if the string is null or has zero length.
	 */
	public static boolean isNullString(String s)
	{
		// DB2 TT 31220 : - Modified
		return ((s == null) || (s.length() == 0) || "null".equals(s));
	}

	
	

}
