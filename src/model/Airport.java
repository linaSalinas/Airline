package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import model.Flight.Airlines;
import model.Flight.Citys;
import model.Flight.Doors;

public class Airport {

	private List<Flight> flights;

	public Airport() {

		flights = new ArrayList<Flight>();

	}

	public void generateFlights(int amount) {

		for(int i = 0; i < amount; i++) {
			Flight flight = new Flight(generateHourRandom(),generateDateRandom(),generateAirlineRandom(),generateCode(),generateCityRandom(),generateDoors());
			flights.add(flight);
		}

	}
	//___________________________________________________________________________________________________________________________________
	
	public String generateCode() {
	    UUID uniqueKey = UUID.randomUUID();
	   return uniqueKey.toString();
	  }
	//___________________________________________________________________________________________________________________________________

	public String generateHourRandom() {
		String hour="";
		String mssg= " ";
		int hours = (int)Math.random()*13;
		double minut = Math.random()*61;
		double second = Math.random()*61;

		mssg = (hours+":"+minut+":"+second);

		hour += mssg;

		System.out.println(hour);
		return hour;
	}

	//___________________________________________________________________________________________________________________________________

	public String generateDateRandom() {
		String date = "";
		String mssg = "";
		Random r = new Random();
		int year = r.nextInt(2019)+1;
		int month = r.nextInt(32)+1;
		int dates = 0;

		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12  ) {

			dates = (int)Math.random()*32;

		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {

			dates = (int)Math.random()*31;
		}
		else {
			dates = (int)Math.random()*29;
		}

		mssg = (year+ "-" + month +"-"+ dates);

		date += mssg;

		return date;

	}

	//___________________________________________________________________________________________________________________________________	

	private Airlines generateAirlineRandom() {
		Airlines airline = null;
		int airlin = (int)Math.random()*16;

		if(airlin == 1) {
			airline = Airlines.AVIANCA;
		}
		if(airlin == 2) {
			airline = Airlines.AEROCIVIL;
		}
		if(airlin == 3) {
			airline = Airlines.AEROMEXICO;
		}
		if(airlin == 4) {
			airline = Airlines.AIRCANADA;
		}
		if(airlin == 5) {
			airline = Airlines.AVIATUR;
		}
		if(airlin == 6) { 
			airline = Airlines.CONTINENTAL;
		}
		if(airlin == 7) {
			airline = Airlines.EASYFLY;
		}
		if(airlin == 8) {
			airline = Airlines.IBERIA;
		}
		if(airlin == 9) {
			airline = Airlines.AIRFRANCE;
		}
		if(airlin == 10) {
			airline = Airlines.INTERJET;
		}
		if(airlin == 11) {
			airline = Airlines.LAN;
		}
		if(airlin == 12) {
			airline = Airlines.SATENA;
		}
		if(airlin == 13) {
			airline = Airlines.TRIVAGO;
		}
		if(airlin == 14) {
			airline = Airlines.WINGO;
		}
		if(airlin == 15) {
			airline = Airlines.LATAM;
		}
		return airline;
	}

	//___________________________________________________________________________________________________________________________________

	public Citys generateCityRandom() {
		Citys dCity = null;
		Random r = new Random();
		int city = r.nextInt(16)+1;

		if(city == 1) {
			dCity = Citys.ACAPULCO;
		}
		if(city == 2) {
			dCity = Citys.BARRANQUILLA;
		}
		if(city == 3) {
			dCity = Citys.BOGOTA;
		}
		if(city == 4) {
			dCity = Citys.CALI;
		}
		if(city == 5) {
			dCity = Citys.CARTAGENA;
		}
		if(city == 6) {
			dCity = Citys.CHACO;
		}
		if(city == 7) {
			dCity = Citys.CIUDAD_DE_MEXICO;
		}
		if(city == 8) {
			dCity = Citys.ITALIA;
		}
		if(city == 9) {
			dCity = Citys.MEDELLIN;
		}
		if(city == 10) {
			dCity = Citys.MONTEVIDEO;
		}
		if(city == 11) {
			dCity = Citys.PASTO;
		}
		if(city == 12) {
			dCity = Citys.ROMA;
		}
		if(city == 13) {
			dCity = Citys.SEUL;
		}
		if(city == 14) {
			dCity = Citys.TOKIO;
		}
		if(city == 15) {
			dCity = Citys.BUENOS_AIRES;
		}

		return dCity;

	}

	//___________________________________________________________________________________________________________________________________

	public Doors generateDoors() {
		Doors sDoor= null;
		Random r = new Random();
		int door = r.nextInt(16)+1;  
		
		if(door == 1) {
			sDoor = Doors.A;
		}
		if(door == 2) {
			sDoor = Doors.B;
		}
		if(door == 3) {
			sDoor = Doors.C;
		}
		if(door == 4) {
			sDoor = Doors.D;
		}
		if(door == 5) {
			sDoor = Doors.E;
		}
		if(door == 6) {
			sDoor = Doors.F;
		}
		if(door == 7) {
			sDoor = Doors.G;
		}
		if(door == 8) {
			sDoor = Doors.H;
		}
		if(door == 9) {
			sDoor = Doors.I;
		}
		if(door == 10) {
			sDoor = Doors.J;
		}
		if(door == 11) {
			sDoor = Doors.K;
		}
		if(door == 12) {
			sDoor = Doors.L;
		}
		if(door == 13) {
			sDoor = Doors.M;
		}
		if(door == 14) {
			sDoor = Doors.N;
		}
		if(door == 15) {
			sDoor = Doors.O;
		}
		return sDoor;

	}
	
	
	//___________________________________________________________________________________________________________________________________
	
	public ArrayList<Flight> getFlights(){
		return (ArrayList<Flight>) flights;
	}
	//___________________________________________________________________________________________________________________________________


}
