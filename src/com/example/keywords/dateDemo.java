package com.example.keywords;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		Date date = new Date();

		System.out.println(date.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
		System.out.println(sdf.format(date));

		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(Calendar.MINUTE);
		
	}

}
