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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Help {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Menubar;

    @FXML
    private MenuItem Menu_help;

    @FXML
    private MenuItem Menu_message;

    @FXML
    private MenuItem Menu_bank;

    @FXML
    private MenuItem Menu_deposit;

    @FXML
    private MenuItem Menu_credit;
    

    @FXML
    private MenuItem Menu_contact_us;

    @FXML
    private MenuItem Menu_log_out;

    @FXML
    private Label field_name;

    @FXML
    private Label information_help;

    @FXML
    private Label main_question_help;

    @FXML
    private RadioButton answer_yes;

    @FXML
    private RadioButton answer_no;

    @FXML
    private Label question_help;

    @FXML
    private Label main_question_help1;

    @FXML
    private Label information_help1;

    @FXML
    private Label question_help1;

    @FXML
    private RadioButton answer_yes1;

    @FXML
    private RadioButton answer_no1;

    @FXML
    private Label main_question_help2;

    @FXML
    private Label information_help2;

    @FXML
    private Label question_help2;

    @FXML
    private RadioButton answer_yes2;

    @FXML
    private RadioButton answer_no2;

    @FXML
    private Label another_ques;

    @FXML
    private TextField text_ques;

    @FXML
    private Button search;

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
            OpenNewScene("/sample/fxml/Contact_us.fxml");
        });
        Menu_help.setOnAction(actionEvent -> {
            OpenNewScene("/sample/fxml/mainpage.fxml");
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
