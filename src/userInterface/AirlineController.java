package userInterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Airport;
import model.Flight;
import model.Flight.*;
import java.util.Random;

public class AirlineController {

	private TableView<Flight> TABLE;   

	@FXML
	private BorderPane borderpane;

	@FXML
	private ObservableList<Flight> flights;

	@FXML
	private TextField OCON;

	@FXML
	private Button start;

	@FXML
	private ComboBox<String> co;

	private Airport airport;
	
	private Random random;
	
	private Integer amount;
	
	//___________________________________________________________________________________________________________________________________

	@FXML
	public void initialize() {
		
		random = new Random();
		amount = random.nextInt(100);
		airport = new Airport(amount);
		//prueba();
		initializeTableView();
	}
	
	//___________________________________________________________________________________________________________________________________
	
	  @FXML
	    void ncor(ActionEvent event) {
		 
	    }

	//___________________________________________________________________________________________________________________________________

	@SuppressWarnings("unchecked")
	public void initializeTableView() {
		System.out.println("en initializeTableView");

		TABLE = new TableView<Flight>();

		TableColumn<Flight, String> hour = new TableColumn<>("Hour");
		hour.setCellValueFactory(new PropertyValueFactory<>("hour"));

		TableColumn<Flight, String> date = new TableColumn<>("Date");
		date.setCellValueFactory(new PropertyValueFactory<>("date"));

		TableColumn<Flight, Airlines> airlines = new TableColumn<>("Airlines");
		airlines.setCellValueFactory(new PropertyValueFactory<>("airline"));

		TableColumn<Flight, String> nFlight = new TableColumn<>("nFlight");
		nFlight.setCellValueFactory(new PropertyValueFactory<>("nFlight"));

		TableColumn<Flight, Citys> dCity = new TableColumn<>("dCity");
		dCity.setCellValueFactory(new PropertyValueFactory<>("dCity"));

		TableColumn<Flight, Doors> sDoor = new TableColumn<>("Doors");
		sDoor.setCellValueFactory(new PropertyValueFactory<>("sDoor"));

		TABLE.getColumns().addAll(hour, date, airlines,nFlight,dCity,sDoor);
		TABLE.setItems(getFlights());
		borderpane.setCenter(TABLE);
	}

	//___________________________________________________________________________________________________________________________________

	public ObservableList<Flight> getFlights(){
		System.out.println("en getFlights");
		flights = FXCollections.observableArrayList();
		System.out.println(airport.getFlights().size());
		for(int i=0;i<airport.getFlights().size();i++){
			flights.add(airport.getFlights().get(i));
		} 	
		return flights;
	}
	//___________________________________________________________________________________________________________________________________

	public void prueba() {
    	String mssg = "";
    	for(int i=0;i<airport.getFlights().size();i++) {
    		mssg += airport.getFlights().get(i).getDate() + "-";
    		mssg += airport.getFlights().get(i).getHour() + "-";
    		mssg += " " + airport.getFlights().get(i).getAirline() + " -";
    		mssg += " " + airport.getFlights().get(i).getsDoor() + " -";
    		mssg += " " + airport.getFlights().get(i).getdCity() + "\n";
    		
    		System.out.println(mssg);
    	}
    }




}


