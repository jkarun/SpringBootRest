package com.ebix.ifbieapp.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Util {

	public static String getDateStringFromTimeStamp(Timestamp dateTime) {
		if (dateTime != null) {
			SimpleDateFormat monthDayYearformatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss.SSS");
			return monthDayYearformatter.format((java.util.Date) dateTime);
		} else {
			return "";
		}
	}

}
