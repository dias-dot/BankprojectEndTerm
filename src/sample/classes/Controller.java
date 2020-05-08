package sample.classes;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_text;

    @FXML
    private PasswordField password_text_main;

    @FXML
    private Button SignInBut;

    @FXML
    private Button SignUpBut;

    @FXML
    void initialize() {
    SignInBut.setOnAction(actionEvent -> {
        String loginText =login_text.getText().trim();
        String loginPass =password_text_main.getText().trim();
        if(!loginText.equals("")&&!loginPass.equals("")){
            loginUser(loginText,loginPass);

           }
        else
        {System.out.println("Login and Password are empty");
        SignInBut.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/fxml/wrong.fxml"));
            try{
                loader.load();
            }catch (Exception e){
                e.printStackTrace();
            }
            Parent root=loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }});

    SignUpBut.setOnAction(actionEvent -> {
        SignUpBut.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/fxml/registration.fxml"));
        try {
            loader.load();
        }catch (Exception e){
            e.printStackTrace();
        }
        Parent root=loader.getRoot();
        Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    });
    }

    private void  loginUser(String loginText, String loginPass) {
      DatabaseHandler dbh = new DatabaseHandler() ;
      User user =new User();
      user.setUsername(loginText);
      user.setPassword(loginPass);
      ResultSet resultSet =dbh.getUser(user);
        int c=0;

        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            c++;
        }
          if(c>=1){
              SignInBut.getScene().getWindow().hide();
              FXMLLoader loader = new FXMLLoader();
              loader.setLocation(getClass().getResource("/sample/fxml/mainpage.fxml"));
              try {
                  loader.load();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              Parent root = loader.getRoot();
              Stage stage = new Stage();
              stage.setScene(new Scene(root));
              stage.showAndWait();}
            else{
                  SignInBut.getScene().getWindow().hide();
                  FXMLLoader loader = new FXMLLoader();
                  loader.setLocation(getClass().getResource("/sample/fxml/wrong.fxml"));
                  try {
                      loader.load();
                  } catch (IOException e) {
                      e.printStackTrace();
                  }
                  Parent root = loader.getRoot();
                  Stage stage = new Stage();
                  stage.setScene(new Scene(root));
                  stage.showAndWait();
            }
    }


    }

