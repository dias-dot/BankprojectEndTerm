package sample.classes;

import java.net.URL;
import java.sql.ResultSet;
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

public class Mainpage {

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
    private Button Message_main;

    @FXML
    private ImageView img_message;

    @FXML
    private ImageView img_my_bank;

    @FXML
    private ImageView img_deposit;

    @FXML
    private Button My_bank_main;

    @FXML
    private Button Deposit_main;

    @FXML
    private ImageView img_credit;

    @FXML
    private ImageView img_help;

    @FXML
    private ImageView img_contact;

    @FXML
    private Button Credit_main;

    @FXML
    private Button Help_main;

    @FXML
    private Button Contact_main;

    @FXML
    private Label our_partners_main;

    @FXML
    private ImageView ourpartners_img1;

    @FXML
    private ImageView ourpartners_img2;

    @FXML
    private ImageView ourpartners_img3;

    @FXML
    void initialize() {
        Message_main.setOnAction(actionEvent -> {
            Message_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/message.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_message.setOnAction(actionEvent -> {
            Menubar.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/message.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_bank.setOnAction(actionEvent -> {
            Menubar.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/My_bank.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        My_bank_main.setOnAction(actionEvent -> {
            My_bank_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/My_bank.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_deposit.setOnAction(actionEvent -> {
            Menubar.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Deposit.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Deposit_main.setOnAction(actionEvent -> {
            Deposit_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Deposit.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_credit.setOnAction(actionEvent -> {
            Message_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Credit.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Credit_main.setOnAction(actionEvent -> {
            Credit_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Credit.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_help.setOnAction(actionEvent -> {
            Message_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/help.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Help_main.setOnAction(actionEvent -> {
            Help_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/help.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Contact_main.setOnAction(actionEvent -> {
            Contact_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Contact_us.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_contact_us.setOnAction(actionEvent -> {
            Message_main.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/Contact_us.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
        Menu_log_out.setOnAction(actionEvent -> {
            Menubar.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
            try {
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage =new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();});





    }
}
