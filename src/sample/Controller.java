package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Controller {
    @FXML
    private Button button;

    @FXML
    private Label label;

    private Date date = new Date();

    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss a");

    @FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            button.setText("Спасибо!");
            label.setText(formatForDateNow.format(date));
        });
    }
}
