package model;

import java.util.Random;

public class Date {
	
	private Random r;
	
	public String generateDateRandom() {
		String date = "";
		String mssg = "";
		r = new Random();
		int year = r.nextInt(2019)+1;
		
		if(year < 2019) {
			year = 2019;
		}
		
		int month = r.nextInt(12)+1;
		
		if(month == 0) {
			month = 1;
		}
		
		int dates = 0;

		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12  ) {

			dates = r.nextInt(32);

		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {

			dates = r.nextInt(31);
		}
		else {
			dates = r.nextInt(29);
		}

		mssg = (year+ "-" + month +"-"+ dates);

		date += mssg;
		
		return date;

	}

}
