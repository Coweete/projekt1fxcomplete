package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by jonatan on 2016-04-11.
 */
public class WindowClass extends Application {
    private int counter = 0;
    private int counter1 = 0;
    private Label label1;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("test");


        Label label = new Label("hello");
        label1 = new Label("2");
        VBox la = new VBox();
        Button btn = new Button("Click Me");
        btn.setOnAction(e -> {
            label.setText("Counter" + (counter++));
        });
        la.getChildren().addAll(label,btn,label1);
        Scene scene = new Scene(la,320,480);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
