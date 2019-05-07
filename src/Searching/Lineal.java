package Searching;

import model.Flight;
import model.Flight.Airlines;
import model.Flight.Citys;
import model.Flight.Code;
import model.Flight.Doors;

public class Lineal {

	public Flight searchAirline(Flight first,Airlines airline) {

		Flight current = first;
		Flight searched = null;

		while(current.getNextFlight()!=null) {

			if(current.getAirline().equals(airline)) {
				searched = current;
				break;
			}
			current = current.getNextFlight();
			if(current == null) {
				break;
			}
		}	
		return searched;
	}


	public Flight searchDate(Flight first,String date) {

		Flight current = first;
		Flight searched = null;

		while(current.getNextFlight()!=null) {

			if(current.getDate().toString().equals(date)) {
				searched = current;
				break;
			}

			current = current.getNextFlight();
			if(current == null) {
				break;
			}
		}	
		return searched;
	}

	public Flight searchHour(Flight first,String Hour) {

		Flight current = first;
		Flight searched = null;

		System.out.println(first.getAirline());
		System.out.println(Hour);
		System.out.println();

		while(current.getNextFlight()!=null) {

			System.out.println(current.getHour().length());
			System.out.println(Hour.length());
			System.out.println();
			if(current.getHour().toString().equals(Hour)) {
				System.out.println("entré al if");
				searched = current;
				break;
			}

			current = current.getNextFlight();
			if(current == null) {
				break;
			}
		}	
		return searched;
	}

	public Flight searchIdentifier(Flight first, Code id) {

		Flight current = first;
		Flight searched = null;

		while(current.getNextFlight()!=null ) {

			if(current.getID() == id) {
				searched = current;
				break;
			}

			current = current.getNextFlight();
			if(current == null) {
				break;
			}
		}	
		return searched;
	}

	public Flight searchGate(Flight first, Doors sDoor) {

		Flight current = first;
		Flight searched = null;

		int i=0;

		while(current.getNextFlight()!=null) {

			if(current.getsDoor().equals(sDoor)) {
				searched = current;
				break;
			}

			current = current.getNextFlight();
			i++;
			if(current == null) {
				break;
			}
		}	
		return searched;
	}
	public Flight searchDestination(Flight first, Citys dCity) {

		Flight current = first;
		Flight searched = null;

		while(current.getNextFlight()!=null) {

			if(current.getdCity().equals(dCity)) {
				searched = current;
				break;
			}

			current = current.getNextFlight();
			if(current == null) {
				break;
			}
		}	
		return searched;
	}

}
