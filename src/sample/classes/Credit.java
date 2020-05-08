package sample.classes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Credit {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Creditbar;

    @FXML
    private MenuItem Menu_deposit;

    @FXML
    private MenuItem Menu_message;

    @FXML
    private MenuItem Menu_bank;

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
    private Label our_partners_deposit;

    @FXML
    private Button Open_Credit_but;



    @FXML
    private Button help_but;

    @FXML
    private Button contact_us_but;

    @FXML
    private Button Pay_Credits_but;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private ImageView img5;

    @FXML
    private ImageView img6;

    @FXML
    private ImageView img7;

    @FXML
    private ImageView img8;

    @FXML
    void initialize() {
        Menu_bank.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/my_bank.fxml");
        });
        Menu_message.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/message.fxml");
        });
        Menu_deposit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/mainpage.fxml");
        });
        Menu_credit.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Deposit.fxml");
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
        Open_Credit_but.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/openC.fxml");
        });

        help_but.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/help.fxml");
        });
        contact_us_but.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/Contact_us.fxml");
        });
        Pay_Credits_but.setOnAction(actionEvent->{
            OpenNewScene("/sample/fxml/paycres.fxml");
        });

    }
    public void OpenNewScene(String window){
        Creditbar.getScene().getWindow().hide();
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
