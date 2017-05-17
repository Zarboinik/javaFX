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
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    private Date date = new Date();

    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");

    @FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            button.setText("Спасибо!");
            label1.setText(formatForDateNow.format(date));
            label2.setText(formatForDateNow.format(date));
            label3.setText(formatForDateNow.format(date));
        });
    }
}
