package sample.classes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Contact {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Menubar;

    @FXML
    private MenuItem Menu_contact_us;

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
    private MenuItem Menu_log_out;

    @FXML
    private Label field_name;

    @FXML
    private Label emails_cont;

    @FXML
    private Label email1;

    @FXML
    private Label email2;

    @FXML
    private Label number_cont;

    @FXML
    private Label number1;

    @FXML
    private Label number2;

    @FXML
    private Label address_cont;

    @FXML
    private Label address1;

    @FXML
    private ImageView map;

    @FXML
    private Label address2;

    @FXML
    void initialize() {

        Menu_bank.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/my_bank.fxml");
        });
        Menu_message.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/message.fxml");
        });
        Menu_deposit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Deposit.fxml");
        });
        Menu_credit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Credit.fxml");
        });
        Menu_contact_us.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/mainpage.fxml");
        });
        Menu_help.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/help.fxml");
        });
        Menu_log_out.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/sample.fxml");
        });
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
