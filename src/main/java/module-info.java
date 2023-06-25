module com.twowaffles.lolam {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.twowaffles.lolam to javafx.fxml;
    exports com.twowaffles.lolam;
}