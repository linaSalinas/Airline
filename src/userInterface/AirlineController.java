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
	public void ncor(ActionEvent event) {
		
		createList();

	}

	@FXML
	private ComboBox<String> co;

	private Airport airport;

	//___________________________________________________________________________________________________________________________________

	@FXML
	public void initialize() {
		airport = new Airport();
		//createList();
		//prueba();
		initializeTableView();
	}

	//___________________________________________________________________________________________________________________________________

	@SuppressWarnings("unchecked")
	public void initializeTableView() {

		TABLE = new TableView<>();

		TableColumn<Flight, String> hour = new TableColumn<>("Hour");
		hour.setCellValueFactory(new PropertyValueFactory<>("hour"));

		TableColumn<Flight, String> date = new TableColumn<>("Date");
		hour.setCellValueFactory(new PropertyValueFactory<>("date"));

		TableColumn<Flight, Airlines> airlines = new TableColumn<>("Airlines");
		hour.setCellValueFactory(new PropertyValueFactory<>("airline"));

		TableColumn<Flight, String> nFlight = new TableColumn<>("nFlight");
		hour.setCellValueFactory(new PropertyValueFactory<>("nFlight"));

		TableColumn<Flight, Citys> dCity = new TableColumn<>("dCity");
		hour.setCellValueFactory(new PropertyValueFactory<>("dCity"));

		TableColumn<Flight, Doors> sDoor = new TableColumn<>("Doors");
		hour.setCellValueFactory(new PropertyValueFactory<>("sDoor"));

		TABLE.setItems(getFlights());
		TABLE.getColumns().addAll(hour, date, airlines,nFlight,dCity,sDoor);
		borderpane.setCenter(TABLE);
	}
	//___________________________________________________________________________________________________________________________________

	public void createList() {
		int amount = Integer.parseInt(OCON.getText());
		airport.generateFlights(amount);

	}

	//___________________________________________________________________________________________________________________________________

	public ObservableList<Flight> getFlights(){
		flights = FXCollections.observableArrayList();

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
    		mssg += " " + airport.getFlights().get(i).getnFlight() + " -";
    		mssg += " " + airport.getFlights().get(i).getsDoor() + " -";
    		mssg += " " + airport.getFlights().get(i).getdCity() + "\n";
    		
    		System.out.println(mssg);
    	}
    }




}


