package userInterface;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import model.Airport;

public class AirlineController {

    @FXML
    private TableView<Airport> TABLE;
    
    @FXML
    private Pane pane;
    
    @FXML
    private ComboBox<?> co;

    
    public void inicialize() {
    	
    	 TABLE = new TableView();
    	 
    	 TableColumn hour = new TableColumn("Hour");
    	 TableColumn date = new TableColumn("Date");
    	 TableColumn airline = new TableColumn("Airline");
    	 TableColumn nFlight = new TableColumn("N.Flight");
    	 TableColumn dCity = new TableColumn("Destination City");
    	 TableColumn sDoor = new TableColumn("Shipment Door");
    	 
    	TABLE.getColumns().addAll(hour, date, airline, nFlight, dCity, sDoor);
    	pane.getChildren().add(TABLE);
    	
    }
    
   

}
