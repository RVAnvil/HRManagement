package com.nagarro.hrManagement.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	public static final String getConvertedDate(String givenDate) {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("dd MMMM yyyy");
        String date = null;
		Date convetedDate = null;
		try {
			convetedDate = format1.parse(givenDate);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
        date  = (format2.format(convetedDate));
		return date;
	}
}
