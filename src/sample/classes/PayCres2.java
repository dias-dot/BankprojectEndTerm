package sample.classes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class PayCres2 {
    ObservableList list = FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Menubar;

    @FXML
    private MenuItem Menu_message;

    @FXML
    private MenuItem Menu_bank;

    @FXML
    private MenuItem Menu_deposit;

    @FXML
    private MenuItem Menu_credit;

    @FXML
    private MenuItem Menu_help;

    @FXML
    private MenuItem Menu_contact_us;

    @FXML
    private MenuItem Menu_log_out;

    @FXML
    private Label field_name;

    @FXML
    private Button back;

    @FXML
    private Button finish;

    @FXML
    private ChoiceBox<Integer> money;

    @FXML
    private ChoiceBox<String> year;

    @FXML
    private Label money1;

    @FXML
    private Label month;

    @FXML
    void initialize() {
        loadMoney();
        loadYear();

        back.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/paycres.fxml");
        });
        finish.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/succesfull2.fxml");
        });
        Menu_bank.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/my_bank.fxml");
        });
        Menu_message.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/mainpage.fxml");
        });
        Menu_deposit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Deposit.fxml");
        });
        Menu_credit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/message.fxml");
        });
        Menu_contact_us.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Contact_us.fxml");
        });
        Menu_help.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/help.fxml");
        });
        Menu_log_out.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/sample.fxml");
        });
    }
    public void loadYear(){
        list.removeAll(list);
        String a= "January";
        String b="February";
        String c="March";
        String d="April";
        String e="May";
        String f="June";
        String g="July";
        String h="August";
        String i="September";
        String j="October";
        String k="November";
        list.addAll(a,b,c,d,e,f,g,h,i,j,k);
        year.getItems().addAll(list);
    }
    public void loadMoney(){
        list.removeAll(list);
        int a= 100000;
        int b=200000;
        int c=500000;
        int d=1000000;
        list.addAll(a,b,c,d);
        money.getItems().addAll(list);

    }
    public void OpenNewScene(String window){
        Menubar.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(window));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    }

