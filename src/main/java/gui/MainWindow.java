package gui;

import com.jonte.DemoSpringFxApplication;
import controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;

/**
 * Created by jonatan on 2016-04-08.
 */
public class MainWindow extends Application {

    private Button btnClick;
    private Label label;
    private Label label1;
    private Controller ctrl;
    private String[] sads;
    private Scene scene;


    @Override
    public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Hello");
            //windowsize 420x380 / fullsize

            label = new Label();
            label.setText("hello World");
            label1 = new Label();
            label.setText("arduino");

            btnClick = new Button("Click Me");
            btnClick.setOnAction(e -> {
            //setLabel(Controller.getFromServer());
            setLabel(DemoSpringFxApplication.test());
        });


        VBox layout = new VBox();
        layout.getChildren().addAll(label,btnClick);

        Scene scene = new Scene(layout,420,380);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void setLabel(String txt){
        label.setText(txt);

    }
    public void setLabel1(String txt){
        label1.setText(txt);
    }
    public void hej(String txt){
        label1.setText(txt);
        //label.setText(DemoSpringFxApplication.test());
    }
    public void setCtrl(Controller ctrl){
        this.ctrl = ctrl;
    }



    public static void main(String[] args) {
        launch(args);
    }
}
