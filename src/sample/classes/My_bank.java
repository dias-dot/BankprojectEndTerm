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

public class My_bank {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Menubar;

    @FXML
    private MenuItem Menu_bank;

    @FXML
    private MenuItem Menu_message;

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
    private ImageView ourpartners_img1;

    @FXML
    private ImageView ourpartners_img2;

    @FXML
    private ImageView ourpartners_img3;

    @FXML
    private Label our_partners_main;

    @FXML
    private Button Money;

    @FXML
    private Button Transfers;

    @FXML
    private Button payments;

    @FXML
    private Button history;

    @FXML
    private ImageView history_img;

    @FXML
    private ImageView payments_img;

    @FXML
    private ImageView money_img;

    @FXML
    private ImageView transfers_img;

    @FXML
    void initialize() {
Menu_bank.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/mainpage.fxml");
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
    OpenNewScene("/sample/fxml/help.fxml");
});
Menu_log_out.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/sample.fxml");
});
Money.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/money.fxml");
});
Transfers.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/transfers.fxml");
});
payments.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/payments.fxml");
});
history.setOnAction(actionEvent -> {
    OpenNewScene("/sample/fxml/history.fxml");
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
