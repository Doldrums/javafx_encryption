import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import org.w3c.dom.Text;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btn;
    @FXML
    private TextField txt_name;

    @FXML
    private void click(ActionEvent event) {

        if(txt_name.getText().isEmpty()&&txt_name.getText()!="PLEASE ENTER YOUR NAME") {
           // showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
            System.out.println("Kek");
            txt_name.setText("PLEASE ENTER U NAME");
            return;
        } else {

        }
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

}
