package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import model.Flight.Airlines;
import model.Flight.Citys;
import model.Flight.Code;
import model.Flight.Doors;

public class Airport {

	private List<Flight> flights;
	private Flight firstFlight;
	private Hour hours;
	private Random r;
	private Date dates;

	public Airport(int amount) {
		r = new Random();
		hours = new Hour();
		dates = new Date();
		flights = new ArrayList<Flight>();

	}

	//___________________________________________________________________________________________________________________________________

	public List<Flight> getFlightToArray() {
		List<Flight> flight;
		flight = new LinkedList<Flight>();
		Flight current = firstFlight;
		while(current!=null) {
			flight.add(current);
			current = current.getNextFlight();
		}
		return flights;
	}

	//___________________________________________________________________________________________________________________________________

	public void addFlight(String hour, String date,Code id, Airlines airline, Citys dCity, Doors sDoor) {

		Flight flight = new Flight(hours.generateHour(),dates.generateDateRandom(),generateCodeRandom() ,generateAirlineRandom(),generateCityRandom(),generateDoors());
		if(firstFlight==null) {
			firstFlight = flight;
		} else {
			Flight current = firstFlight;
			while(current.getNextFlight() != null) {
				current = current.getNextFlight();
			}
			current.setNextFlight(flight);
		}

	}

	//__________________________________________________________________________________________________________________________________

	/**public void generateNewFlights(int amount) {
			generateFlights(amount);
		}*/

	//___________________________________________________________________________________________________________________________________

	public Code generateCodeRandom() {

		Code id = null;
		r = new Random();
		int code = r.nextInt(25)+1;

		if(code == 0) {
			code= 1;
		}
		if(code == 1) {
			id = Code.A123;
		}
		if(code == 2) {
			id = Code.B134;
		}
		if(code == 3) {
			id = Code.C2345;
		}
		if(code == 4) {
			id = Code.D243;
		}
		if(code == 5) {
			id = Code.E4355;
		}
		if(code == 6) {
			id = Code.F5433 ;
		}
		if(code == 7) {
			id = Code.G3556;
		}
		if(code == 9) {
			id = Code.H4575;
		}
		if(code == 10) {
			id = Code.J4657;
		}
		if(code == 11) {
			id = Code.K5743;
		}
		if(code == 12) {
			id = Code.L3657;
		}
		if(code == 13) {
			id = Code.M754;
		}
		if(code == 14) {
			id = Code.N34657;
		}
		if(code == 15) {
			id = Code.O67864;
		}
		if(code == 16) {
			id = Code.P4633;
		}
		if(code == 17) {
			id = Code.Q3466;
		}
		if(code == 18) {
			id = Code.R3346;
		}
		if(code == 19) {
			id = Code.S098394;
		}
		if(code == 20) {
			id = Code.T24456;
		}
		if(code == 21) {
			id = Code.U57797;
		}
		if(code == 22) {
			id = Code.V07897;
		}
		if(code == 23) {
			id = Code.W67854;
		}
		if(code == 24) {
			id = Code.X5765;
		}
		if(code == 25) {
			id = Code.Z68679;
		}
		return id;
	}

	//___________________________________________________________________________________________________________________________________	

	private Airlines generateAirlineRandom() {
		Airlines airline = null;
		int airlin = r.nextInt(16);

		if(airlin == 0) {
			airlin = 1;
		}

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
		r = new Random();
		int city = r.nextInt(16);

		if(city == 0) {
			city= 1;
		}

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
		r = new Random();
		int door = r.nextInt(16);  

		if(door == 0) {
			door = 1;
		}

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

	public Flight getFirstFlight() {
		return firstFlight;
	}
	
	//___________________________________________________________________________________________________________________________________

	public void setFirstFlight(Flight firstFlight) {
		this.firstFlight = firstFlight;
	}
	
	//___________________________________________________________________________________________________________________________________


}
