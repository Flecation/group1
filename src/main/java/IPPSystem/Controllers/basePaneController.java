package IPPSystem.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class basePaneController {
    @FXML
    Button exitBtn,restoreBtn,minimizeBtn,pageAddBtn,reloadBtn,forwardBtn,backBtn,searchBtn;

    @FXML
    StackPane loadPane;

    @FXML
    HBox directoryBar,tapBar;

    @FXML
    TextField searchTxt;

    @FXML
    private void initialize(){

    }
}
