package sample.classes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class wrong {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button OKbut;

    @FXML
    private Label wrong;

    @FXML
    void initialize() {
     OKbut.setOnAction(actionEvent -> {
         OKbut.getScene().getWindow().hide();
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("/sample/fxml/sample.fxml"));
         try{
             loader.load();
         }catch (Exception e){
             e.printStackTrace();
         }
         Parent root = loader.getRoot();
         Stage stage =new Stage();
         stage.setScene(new Scene(root));
         stage.showAndWait();
     });

    }
}