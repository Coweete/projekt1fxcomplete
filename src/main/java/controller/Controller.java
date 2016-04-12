package controller;

import com.jonte.DemoSpringFxApplication;
import gui.MainWindow;
import gui.SceneClass;
import input.SebbeTest;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jonatan on 2016-04-08.
 */
public class Controller extends Application{
    private MainWindow window;
    private DemoSpringFxApplication client;
    private SebbeTest input;
    private SceneClass sceneC = new SceneClass();


    public Controller(MainWindow window, DemoSpringFxApplication client, SebbeTest input){
        this.window = window;
        this.client = client;
        this.input = input;
    }

    public Controller(MainWindow gui, SebbeTest input) {
        this.window = gui;
        this.input = input;
    }

    public static String getFromServer(){
        return null; //DemoSpringFxApplication.test();
    }
    public void setWindowCtrl() {
        window.setCtrl(this);
    }
    public void setSebbTestCtrl() {input.setCtrl(this);}

    public void sendToServer(String inputLine) {
        String answer = client.sendToServer(inputLine);
        //sentToGui(answer);
        System.out.println(answer);
        //sentToGui(answer);
    }
    public void sentToGui(String answer){
        sceneC.setLabel(answer);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HelloTeam");
        Scene scene = sceneC.getScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        DemoSpringFxApplication dsmfa = new DemoSpringFxApplication();
        MainWindow gui = new MainWindow();
        SebbeTest input = new SebbeTest();
        Controller ctrl = new Controller(gui,dsmfa,input);
        MainWindow.launch(MainWindow.class);
        ctrl.setSebbTestCtrl();
        //gui.setCtrl(ctrl);c
        input.initialize();

    }


}
