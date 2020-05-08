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
import javafx.stage.Stage;

public class succ {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label word;

    @FXML
    private Button but;

    @FXML
    void initialize() {
    but.setOnAction(actionEvent -> {
        OpenNewScene("/sample/fxml/Credit.fxml");
    });}
        public void OpenNewScene(String window){
            but.getScene().getWindow().hide();
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
            stage.showAndWait();}

}
