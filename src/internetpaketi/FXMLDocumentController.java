
package internetpaketi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Marija
 */
public class FXMLDocumentController implements Initializable {
    
   ObservableList lista=FXCollections.observableArrayList();
    ObservableList lista2=FXCollections.observableArrayList();
    ObservableList lista3=FXCollections.observableArrayList();
    
    @FXML
    private TextField ugovor1;
    @FXML
    private TextField brzina1;
    @FXML
    private TextField protok1;
    @FXML private TextField ime1;
    @FXML private TextField prezime1;
    @FXML private TextField id1;
    @FXML private TextField adresa1;
     
    @FXML
    private ChoiceBox brzina;
    @FXML
    private ChoiceBox protok;
    @FXML
    private ChoiceBox ugovor;
    
    @FXML
    private TableView TableView;

    @FXML
    private Label label;
    @FXML
    private Button button;
  
    @FXML private TableColumn<Users,String> ime;
    @FXML private TableColumn<Users,String> prezime;
    @FXML private TableColumn<Users,String> id;
    @FXML private TableColumn<Users,String> adresa;
    @FXML private TableColumn<Users,String> brzina2;
    @FXML private TableColumn<Users,String> protok2;
    @FXML private TableColumn<Users,String> ugovor2;
          
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
      Users user = new Users(id1.getText(),ime1.getText(),prezime1.getText(),adresa1.getText(),brzina.getValue().toString(),protok.getValue().toString(),ugovor.getValue().toString());
                TableView.getItems().add(user);
                
                String ug = (String) brzina.getValue();
                if(ug!=null)
                {
                brzina1.setText(ug);
      
    String br = (String) protok.getValue();
    if(br!=null)
    {
        protok1.setText(ug);
        
        
        String pt = (String) ugovor.getValue();
        if(pt!=null)
        {
            ugovor1.setText(ug);
        }
    }      
                }
       
    }
    
    @FXML
    public void DeleteBTN(){
        ObservableList<Users>selectedRows,allPeople;
        allPeople=TableView.getItems();
        selectedRows=TableView.getSelectionModel().getSelectedItems();
        for(Users p:selectedRows){
            allPeople.remove(p);
            protok1.clear();
            brzina1.clear();
            ugovor1.clear();
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    loadUgovor2();  
      
    loadBrzina2();
        
    loadProtok2();
               
    ime.setCellValueFactory(new PropertyValueFactory<>("ime"));
    id.setCellValueFactory(new PropertyValueFactory<>("id"));
    prezime.setCellValueFactory(new PropertyValueFactory<>("prezime"));
    adresa.setCellValueFactory(new PropertyValueFactory<>("adresa"));
    brzina2.setCellValueFactory(new PropertyValueFactory<>("brzina"));
    protok2.setCellValueFactory(new PropertyValueFactory<>("protok"));
    ugovor2.setCellValueFactory(new PropertyValueFactory<>("ugovor"));
    TableView.setItems(getPeople());    
    }    

    private ObservableList<Users> getPeople() {
        ObservableList<Users>people=FXCollections.observableArrayList();
        return people;
        
    }
    private void loadUgovor2(){
       lista.removeAll(lista);
       String a ="1 godina";
       String b ="2.godine";
       lista.addAll(a,b);
       ugovor.getItems().addAll(lista);
   }
    private void loadBrzina2(){
       lista2.removeAll(lista2);
        String a2 ="2 Mbit";
        
        String b2 ="5 Mbit";        
        String c2 ="10 Mbit";
        String d2 = "20 Mbit";
        String g2 ="50 Mbit";
        String e2 = "100 Mbit";
    lista2.addAll(a2,b2,c2,d2,g2,e2);
    brzina.getItems().addAll(lista2);
   }
    private void loadProtok2(){
       lista3.remove(lista3);
       String a3="1GB";
         String b3="5GB";       
         String c3="10GB";       
        String d3="100GB";  
        String e4="Flat";
        lista3.addAll(a3,b3,c3,d3);
         protok.getItems().addAll(lista3);
               
   }
}