package model;

import java.util.Random;

public class Hour {
	
	public Hour() {
	
	}

	private Random r;

	private static final String AM = "AM";
	private static final String PM = "PM";
	private String meridiem;
	
	public String generateHour() {
		r = new Random();
		String hour="";
		int hours = r.nextInt(12)+1;
		int minut = r.nextInt(60)+1;
		int second = r.nextInt(60)+1;
		int m = r.nextInt(2);
		
		if(m == 0) {
			meridiem = PM;
		}

		if(m == 1) {
			meridiem = AM;
		}
		if(m ==2) {
			meridiem = PM;
		}
		
		hour += (hours+":"+minut+":"+second+" "+meridiem);
		

			return hour;
	}

}
