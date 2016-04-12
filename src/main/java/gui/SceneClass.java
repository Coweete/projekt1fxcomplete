package gui;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Created by jonatan on 2016-04-11.
 */
public class SceneClass {
    private Label label;
    private Label label1;

    public  Scene getScene(){
        label = new Label();
        label.setText("hello World");
        label1 = new Label();
        label.setText("arduino");


        VBox layout = new VBox();
        layout.getChildren().addAll(label,label1);

        return new Scene(layout,420,380);
    }
    public void setLabel(String txt){
        label.setText(txt);

    }
    public void setLabel1(String txt){
        label1.setText(txt);
    }

}
