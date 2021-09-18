package com.mycompany.cw1;



import com.calendarfx.google.GoogleCalendarApp;
import com.calendarfx.view.CalendarView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage stage;
    public static Stage primaryStage;
    public static GoogleCalendarApp GoogleCalendarApp;
    @Override
    public void start(Stage stage1) throws IOException {
        resolucao r = new resolucao();
        // estádio do calendário do google
        primaryStage = new Stage();
        GoogleCalendarApp = new GoogleCalendarApp();
        GoogleCalendarApp.start(primaryStage);
        //primaryStage.show();
        //primaryStage.hide();
        
        //estádio construido para deixar sem botão o wallpaper
        stage1.initStyle(StageStyle.UTILITY);
        stage1.setOpacity(1);
        stage1.setHeight(-1);
        stage1.setWidth(-1);
        stage1.setX(r.getLar() - 20);
        stage1.setY(0);
        stage1.show();
        
        //estádio do wallpaper
        stage = new Stage();
        stage.initOwner(stage1);
        scene = new Scene(loadFXML("primary"), 156, 156);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setX(r.getLar() - (25 + scene.getWidth()));
        stage.setY(25);
        stage.show();
        
        
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}