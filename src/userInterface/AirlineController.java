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
	private TextField txtNVuelos;

	@FXML
	private Button start;

	@FXML
	private ComboBox<String> Sort;

	@FXML
	private ComboBox<?> SearchF;
	
	@FXML
	private Button Search;

	private Airport airport;

	private Random random;

	private Integer amount;

	


	//___________________________________________________________________________________________________________________________________

	@FXML
	public void initialize() {

		random = new Random();
		amount = random.nextInt(100);
		airport = new Airport(amount);
		initializeTableView();
		System.out.println("aleatorios "+amount);
	}

	//___________________________________________________________________________________________________________________________________

	@FXML
	void start(ActionEvent event) {

		int num = 0;

		try {

			num = Integer.parseInt(txtNVuelos.getText());
		}
		catch (NumberFormatException numberException) {
			System.err.println(numberException.getMessage());
		}
		airport.generateNewFlights(num);
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

		TableColumn<Flight, Code> id = new TableColumn<>("N_Flight");
		id.setCellValueFactory(new PropertyValueFactory<>("id"));

		TableColumn<Flight, Citys> dCity = new TableColumn<>("D_City");
		dCity.setCellValueFactory(new PropertyValueFactory<>("dCity"));

		TableColumn<Flight, Doors> sDoor = new TableColumn<>("Doors");
		sDoor.setCellValueFactory(new PropertyValueFactory<>("sDoor"));

		TABLE.getColumns().addAll(hour, date, airlines,id, dCity,sDoor);

		TABLE.setItems(getFlights());
		borderpane.setCenter(TABLE);

	}

	//___________________________________________________________________________________________________________________________________

	public ObservableList<Flight> getFlights(){
		System.out.println("en getFlights");
		flights = FXCollections.observableArrayList();
		System.out.println(airport.getFlights());
		
		
		Flight c = airport.getFirstFlight();
		while(c.getNextFlight() != null) {
			flights.add(c);
			c = c.getNextFlight();
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
