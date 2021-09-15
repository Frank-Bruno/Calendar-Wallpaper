module com.mycompany.cw1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.calendarfx.google;
    requires com.calendarfx.google.view.GoogleCalendarAppView;
    requires java.desktop;
    requires java.logging;

    
    opens com.mycompany.cw1 to javafx.fxml;
    exports com.mycompany.cw1;
    requires com.calendarfx.view;
}
