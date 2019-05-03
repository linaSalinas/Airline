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

	@FXML
	private Button Search;



	//___________________________________________________________________________________________________________________________________

	@FXML
	public void initialize() {

		random = new Random();
		amount = random.nextInt(100);
		airport = new Airport(amount);
		initializeTableView();
	}

	//___________________________________________________________________________________________________________________________________

	@FXML
	void ncor(ActionEvent event) {
		
		int num = 0;
		
		try {
		
			num = Integer.parseInt(OCON.getText());
		}
		catch (NumberFormatException numberException) {
			System.err.println(numberException.getMessage());
		}
		airport.generateFlights(num);
		prueba();
	}

	//___________________________________________________________________________________________________________________________________

	@SuppressWarnings("unchecked")
	public void initializeTableView() {


		TABLE = new TableView<Flight>();

		TableColumn<Flight, String> hour = new TableColumn<>("Hour");
		hour.setCellValueFactory(new PropertyValueFactory<>("hour"));

		TableColumn<Flight, String> date = new TableColumn<>("Date");
		date.setCellValueFactory(new PropertyValueFactory<>("date"));

		TableColumn<Flight, Airlines> airlines = new TableColumn<>("Airlines");
		airlines.setCellValueFactory(new PropertyValueFactory<>("airline"));

		//TableColumn<Flight, String> nFlight = new TableColumn<>("N_Flight");
		//nFlight.setCellValueFactory(new PropertyValueFactory<>("nFlight"));
		
		TableColumn<Flight, Citys> dCity = new TableColumn<>("D_City");
		dCity.setCellValueFactory(new PropertyValueFactory<>("dCity"));

		TableColumn<Flight, Doors> sDoor = new TableColumn<>("Doors");
		sDoor.setCellValueFactory(new PropertyValueFactory<>("sDoor"));

		TABLE.getColumns().addAll(hour, date, airlines, dCity,sDoor);

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
		TABLE.setItems(getFlights());		
	}

	//___________________________________________________________________________________________________________________________________

	public void readCList() {
		
	}
	
	//___________________________________________________________________________________________________________________________________




	@FXML
	void Search(ActionEvent event) {

	}
	//___________________________________________________________________________________________________________________________________

}
