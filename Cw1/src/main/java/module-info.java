module com.mycompany.cw1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.calendarfx.google;
    
    opens com.mycompany.cw1 to javafx.fxml;
    exports com.mycompany.cw1;
}
