package model;

import java.util.List;

public class Flight {

	
	public enum Airlines{AVIANCA,LAN,AIRFRANCE,AEROMEXICO,AIRCANADA,CONTINENTAL,AEROCIVIL,AVIATUR,TRIVAGO,IBERIA,LATAM,INTERJET,WINGO,SATENA,EASYFLY};
	private String hour;
	private String date; 
	/*private List<Integer> id;*/
	private Airlines airline;
	public enum Citys{CALI,CARTAGENA,MEDELLIN,BUENOS_AIRES,ITALIA,ROMA,BARRANQUILLA,CIUDAD_DE_MEXICO,BOGOTA,MONTEVIDEO,SEUL,PASTO,ACAPULCO,CHACO,TOKIO};
	private Citys dCity;
	public enum Doors{A,B,C,D,E,F,G,H,I,J,K,L,M,N,O};
	private Doors sDoor;
	
	//___________________________________________________________________________________________________________________________________

	public Flight(String hour, String date, Airlines airline, Citys dCity, Doors sDoor) {

		this.hour = hour;
		this.date = date;
		this.airline = airline;
		this.dCity = dCity;
		this.sDoor = sDoor;
	}
	
	//___________________________________________________________________________________________________________________________________
	
	/*public List<Integer> getID() {
		return id;
	}*/
	
	//___________________________________________________________________________________________________________________________________
	
	/*public void setID(List<Integer> nid) {
		id = nid;
	}*/
	
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


}
