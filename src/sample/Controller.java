package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Controller {
    @FXML
    private Button button;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            button.setText("Спасибо!");
            bindToTimeForLabel1();
            bindToTimeForLabel2();
            bindToTimeForLabel3();
        });
    }

    private void bindToTimeForLabel1() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(100),
                        actionEvent -> {
                            Calendar time = Calendar.getInstance();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                            label1.setText(simpleDateFormat.format(time.getTime()));
                        }
                ),
                new KeyFrame(Duration.millis(100))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void bindToTimeForLabel2() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1),
                        actionEvent -> {
                            Calendar time = Calendar.getInstance();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                            label2.setText(simpleDateFormat.format(time.getTime()));
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void bindToTimeForLabel3() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(10),
                        actionEvent -> {
                            Calendar time = Calendar.getInstance();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                            label3.setText(simpleDateFormat.format(time.getTime()));
                        }
                ),
                new KeyFrame(Duration.seconds(10))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
