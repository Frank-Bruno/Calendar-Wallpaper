package com.mycompany.cw1;


import com.calendarfx.view.CalendarView;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
   
    @FXML
    private Label dia;
    
    @FXML
    private void switchToSecondary() throws IOException {
        // Tentei fazer o retorno do dia no wallpaper, mas ainda não deu certo.
        //CalendarView calendarView = new CalendarView();
        /*dia.setText(""+*/App.GoogleCalendarApp.calendarView.showDeveloperConsoleProperty()/*)*/;
        
    }
    @FXML
    private void abrircalendario() throws IOException {
         //App.setRoot("secondary");
         App.primaryStage.show();
    }
}
