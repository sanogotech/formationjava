package com.cnss.demo.utils;

import static org.junit.Assert.assertFalse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateUtilsTest {
	
	 //private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	    public static void main(String[] args) throws ParseException {

	        Date currentDate = dateFormat.parse("28/02/2019");
	        System.out.println(dateFormat.format(currentDate));

	        // convert date to calendar
	        Calendar c = Calendar.getInstance();
	        c.setTime(currentDate);

	        // manipulate date
	        c.add(Calendar.DAY_OF_MONTH, 365);
	       /* c.add(Calendar.MONTH, 1);
	        c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
	        c.add(Calendar.HOUR, 1);
	        c.add(Calendar.MINUTE, 1);
	        c.add(Calendar.SECOND, 1);
*/
	        // convert calendar to date
	        Date currentDatePlusOne = c.getTime();

	        System.out.println(dateFormat.format(currentDatePlusOne));

	    }


}
