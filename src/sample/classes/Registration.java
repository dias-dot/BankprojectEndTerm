package sample.classes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Registration {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Name_registr;

    @FXML
    private TextField Surname_registr;

    @FXML
    private TextField Phone_number_registr;

    @FXML
    private TextField Email_registr;

    @FXML
    private TextField Login_registr;

    @FXML
    private PasswordField Password_registr;

    @FXML
    private Button Enter_registr;

    @FXML
    private Button Back_registr;

    @FXML
    void initialize() {

        Enter_registr.setOnAction(event ->{
            signUpNewUser();
            Back_registr.setOnAction(actionEvent -> {
                backto();
            });
        });
    }

    private void signUpNewUser() {

        Enter_registr.setOnAction(event -> {
            String firstNameText = Name_registr.getText().trim();
            String lastNameText = Surname_registr.getText().trim();
            String phonenumber = Phone_number_registr.getText().trim();
            String email = Email_registr.getText().trim();
            String loginText = Login_registr.getText().trim();
            String loginPassword = Password_registr.getText().trim();
            if (!loginText.equals("") && !loginPassword.equals("") && !firstNameText.equals("") && !lastNameText.equals("") && !email.equals("") && !phonenumber.equals("")){

                Enter_registr.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
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
            else
                System.out.println("Error");
        });

        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstname = Name_registr.getText();
        String lastname = Surname_registr.getText();
        String phonenumber = Phone_number_registr.getText();
        String email = Email_registr.getText();
        String username = Login_registr.getText();
        String password = Password_registr.getText();

        User user = new User(firstname, lastname, phonenumber, email, username, password);

        Client.connect(user);
     //   dbHandler.signUpUser(user);
    Back_registr.setOnAction(actionEvent -> {
        backto();
    });}
        private void backto(){
            Back_registr.setOnAction(actionEvent -> {
                Back_registr.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            });

}}

