package sample;

import com.coffeemachine.controllers.ClientController;
import com.coffeemachine.controllers.MachineController;
import com.coffeemachine.controllers.ProductController;
import com.coffeemachine.controllers.TechnicianController;
import com.coffeemachine.models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller {
    @FXML
    private TableView<Technician> tech_table;
    @FXML
    private TableView<Product> pro_table;
    @FXML
    private TableView<Client> cli_table;
    @FXML
    private TableView<Machine> machine_table;


    @FXML
    private TextField accessCode;

    @FXML
    private Button add_tech;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private TextField idRef;

    @FXML
    private TextField id;

    @FXML
    private Button show_tech;

    @FXML
    private Button add_product;

    @FXML
    private TextField id_product;

    @FXML
    private TextField name_product;
    @FXML
    private Label error;
    @FXML
    private Label errr;
    @FXML
    private TextField price_product;
    @FXML
    private TableColumn<?, ?> id_column;
    @FXML
    private TableColumn<?, ?> name_column;
    @FXML
    private TableColumn<?, ?> phone_column;
    @FXML
    private TableColumn<?, ?> idRF_column;
    @FXML
    private TableColumn<?, ?> code_column;
    @FXML
    private TableColumn<?, ?> id_product_column;
    @FXML
    private TableColumn<?, ?> name_product_column;
    @FXML
    private Label err;
    @FXML
    private Button show_product;
    @FXML
    void AddProduct(ActionEvent event) {

    }
    @FXML
    private TableColumn<?, ?> price_product_column;
    @FXML
    private TextField id_client;
    @FXML
    private TextField name_client;
    @FXML
    private TextField phone_client;
    @FXML
    private TextField choice_client;
    @FXML
    private TextField coins_client;
    @FXML
    private TextField rest_client;
    @FXML
    private Button add_client;
    @FXML
    private Button show_client;
    @FXML
    private TableColumn<?, ?> id_client_column;
    @FXML
    private TableColumn<?, ?> name_client_column;
    @FXML
    private TableColumn<?, ?> phone_client_column;
    @FXML
    private TableColumn<?, ?> choice_client_column;
    @FXML
    private TableColumn<?, ?> coins_client_column;
    @FXML
    private Button add_machine;
    @FXML
    private Label error2;
    @FXML
    private ComboBox<Machine> machines_down ;
    @FXML
    private TableColumn<?, ?> machine_id;
    @FXML
    private TableColumn<?, ?> isTurnedOn;
    @FXML
    private TableColumn<?, ?> sumChange;
    @FXML
    private TableColumn<?, ?> products;
    @FXML
    private Button show_mach;
    @FXML
    void AddMachine(ActionEvent event) {
    }
    @FXML
    void loaded(ActionEvent event) {
    }
    @FXML
    void loaddata(ActionEvent event) {
    }
    @FXML
    void AddClient(ActionEvent event) {
    }
    public Controller() {
    }





   //------------------------------------------------------------------------Add Technicien-------------------------------------------------------------------------------------
TechnicianController tech ;
    Technician technician;
    public  ObservableList<Technician> tech_list = FXCollections.observableArrayList();
    Client client;
    public void AddTechnician() throws Exception {
        if(name.getText().isEmpty() || phone.getText().isEmpty() || idRef.getText().isEmpty() || accessCode.getText().isEmpty()) {
            error.setText("please fill all the inputs");
        }else {
            //generate random id
            Random random = new Random();
            long id1 = (long)(random.nextDouble()*100000000L);
            tech = new TechnicianController();
            tech_list.add(new Technician( Long.parseLong(String.valueOf(id.getText())),  name.getText(),  phone.getText(),  idRef.getText(),  accessCode.getText()));
            error.setText("technician is added ");
            clearInputs ();
        }
    }
    //Clearin data from the inputs
    public void clearInputs () {
        id.clear();
        name.clear();
        phone.clear();
        idRef.clear();
        accessCode.clear();
    }
    // Initialise the table view culums to match the attr of the class
    public void loaddata() {
        id_column.setCellValueFactory(new PropertyValueFactory<>("id"));
        name_column.setCellValueFactory(new PropertyValueFactory<>("name"));
        phone_column.setCellValueFactory(new PropertyValueFactory<>("phone"));
        idRF_column.setCellValueFactory(new PropertyValueFactory<>("idRef"));
        code_column.setCellValueFactory(new PropertyValueFactory<>("accessCode"));
        tech_table.setItems(tech_list);
    }



//------------------------------------------------------------------------Add Ptoduct------------------------------------------------------------------------------

    ProductController prod;
    Product product;
    public  ObservableList<Product> prod_list = FXCollections.observableArrayList();
    public void AddProduct() throws Exception {
        if(name_product.getText().isEmpty() || price_product.getText().isEmpty()) {
            err.setText("please fill all the inputs");
        }else {
            //generate random id
            Random rd = new Random();
            long id1 = (long)(rd.nextDouble()*100000000L);
            prod = new ProductController();
            prod_list.add(new Product( Long.parseLong(String.valueOf(id_product.getText())),  name_product.getText(),  Double.parseDouble(String.valueOf(price_product.getText()))));
            err.setText("Product is added ");
            clear();
        }
    }
    //Clearin data from the inputs
    public void clear() {
        id_product.clear();
        name_product.clear();
        price_product.clear();
    }
    // Initialise the table view culums to match the attr of the class
    public void load() {
        id_product_column.setCellValueFactory(new PropertyValueFactory<>("id"));
        name_product_column.setCellValueFactory(new PropertyValueFactory<>("name"));
        price_product_column.setCellValueFactory(new PropertyValueFactory<>("price"));
        pro_table.setItems(prod_list);
    }

    //------------------------------------------------------------------------Add Client-------------------------------------------------------------------------------
    ClientController cli ;
    //Client client;
    public  ObservableList<Client> cli_list = FXCollections.observableArrayList();
    public void AddClient() throws Exception {
        if(name_client.getText().isEmpty() || phone_client.getText().isEmpty() || choice_client.getText().isEmpty() || coins_client.getText().isEmpty()) {
            errr.setText("please fill all the inputs");
        }else {
            //generate random id
            Random dom = new Random();
            long id2 = (long)(dom.nextDouble()*100000000L);
            cli = new ClientController();
            cli_list.add(new Client( Long.parseLong(String.valueOf(id_client.getText())),  name_client.getText(),  phone_client.getText(),  choice_client.getText(),  Double.parseDouble(coins_client.getText())));
            errr.setText("Client is added ");
            clears ();
        }
    }
    //Clearin data from the inputs
    public void clears () {
        id_client.clear();
        name_client.clear();
        phone_client.clear();
        choice_client.clear();
        coins_client.clear();
    }
    // Initialise the table view culums to match the attr of the class
    public void loaded() {
        id_client_column.setCellValueFactory(new PropertyValueFactory<>("id"));
        name_client_column.setCellValueFactory(new PropertyValueFactory<>("name"));
        phone_client_column.setCellValueFactory(new PropertyValueFactory<>("phone"));
        choice_client_column.setCellValueFactory(new PropertyValueFactory<>("choice"));
        coins_client_column.setCellValueFactory(new PropertyValueFactory<>("coins"));
        cli_table.setItems(cli_list);
    }
    MachineController machine_cnotroller ;
    Machine machine;
    ObservableList<Machine> machine_list = FXCollections.observableArrayList();
    // Adding data to the ObservableList (product)
    public void AddMachine() throws Exception {
        //generate random id
        Random rd = new Random();
        long id2 = (long)(rd.nextDouble()*100000000L);
        // product = new Product();
        machine_cnotroller = new MachineController();
        machine = new Machine(id2);
        machine_list.add(machine);
        error2.setText("Machine is added ");
        System.out.println(machine_list);
        loadMachinetData();
    }
    public void initialize2(URL url, ResourceBundle rb) {
        machine_id.setCellValueFactory(new PropertyValueFactory<>("id"));
      //  isTurnedOn.setCellValueFactory(new PropertyValueFactory<>("isTurnedOn"));
        sumChange.setCellValueFactory(new PropertyValueFactory<>("sumChange"));
      //  products.setCellValueFactory(new PropertyValueFactory<>("products"));
        machines_down.setItems(machine_list);
    }
    //load data from the array list (product)
    public void loadMachinetData() {
        machine_table.setItems(machine_list);
        initialize2(null, null);
    }



}