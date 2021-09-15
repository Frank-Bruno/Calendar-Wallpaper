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
    public static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        //wallpaper
        scene = new Scene(loadFXML("primary"), 156, 156);
        scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setX(0);
        stage.setY(0);
        stage.show();
        
        // calendário do google
        primaryStage = new Stage();
        GoogleCalendarApp GoogleCalendarApp = new GoogleCalendarApp();
        GoogleCalendarApp.start(primaryStage);
        primaryStage.hide();
        
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