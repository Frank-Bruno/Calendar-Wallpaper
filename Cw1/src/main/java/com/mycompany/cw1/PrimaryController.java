package com.mycompany.cw1;


import com.calendarfx.google.*;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class PrimaryController {
    
    
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        App.primaryStage.show();
    }
    @FXML
    private void abrircalendario() throws IOException {
         App.setRoot("secondary");
         App.primaryStage.show();
    }
}
