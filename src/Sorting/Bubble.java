/*package Sorting;

import model.Flight;
import model.Airport;

public class Bubble {
	
	private Flight firstFlight;
	
	public void SortingDate(){
	
		for (int i = 0; i < firstFlight; i ++) {
		
		boolean current;
		{
			Flight actual = firstFlight;
			Flight next = actual.getNextFlight();
			current = false;
			while ( next != null ) {
				if (actual.getDate().compareTo(next.getDate())>0) {
					current = true;
					if ( next != null ) {
						Flight nexT = actual.getNextFlight();
						actual = next;
					}
					else {
						Flight nexT = actual.getNextFlight();
						firstFlight = next;
					}
					actual = next;
					next = actual.getNextFlight();
				} 
			} 
		} while( current );
	}
	
}
}*/
