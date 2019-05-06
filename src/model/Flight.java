package model;



public class Flight {

	
	public enum Airlines{AVIANCA,LAN,AIRFRANCE,AEROMEXICO,AIRCANADA,CONTINENTAL,AEROCIVIL,AVIATUR,TRIVAGO,IBERIA,LATAM,INTERJET,WINGO,SATENA,EASYFLY};
	private String hour;
	private String date; 
	private Code id;
	public enum Code{A123,B134,C2345,D243,E4355,F5433,G3556,H4575,Y5765,J4657,K5743,L3657,M754,N34657,O67864,P4633,Q3466,R3346,S098394,T24456,U57797,V07897,W67854,X5765,Z68679};
	private Airlines airline;
	public enum Citys{CALI,CARTAGENA,MEDELLIN,BUENOS_AIRES,ITALIA,ROMA,BARRANQUILLA,CIUDAD_DE_MEXICO,BOGOTA,MONTEVIDEO,SEUL,PASTO,ACAPULCO,CHACO,TOKIO};
	private Citys dCity;
	public enum Doors{A,B,C,D,E,F,G,H,I,J,K,L,M,N,O};
	private Doors sDoor;
	private Flight nextFlight;
	
	//___________________________________________________________________________________________________________________________________

	public Flight(String hour, String date,Code id, Airlines airline, Citys dCity, Doors sDoor) {

		this.hour = hour;
		this.date = date;
		this.airline = airline;
		this.id = id;
		this.dCity = dCity;
		this.sDoor = sDoor;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public Code getID() {
		return id;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public void setID(Code nid) {
		id = nid;
	}
	
	//___________________________________________________________________________________________________________________________________

	public String getHour() {
		return hour;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public String getDate() {
		return date;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public void setDate(String date) {
		this.date = date;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public Airlines getAirline() {
		return airline;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public void setAirline(Airlines airline) {
		this.airline = airline;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public Citys getdCity() {
		return dCity;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public void setdCity(Citys dCity) {
		this.dCity = dCity;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public Doors getsDoor() {
		return sDoor;
	}
	
	//___________________________________________________________________________________________________________________________________	
	
	public void setsDoor(Doors sDoor) {
		this.sDoor = sDoor;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	public Flight getNextFlight(){
		return nextFlight;	
	}

	public void setNextFlight(Flight nextFlight) {
		this.nextFlight = nextFlight;
	}

}
