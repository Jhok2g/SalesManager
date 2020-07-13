module org.jhok2g {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jhok2g to javafx.fxml;
    exports org.jhok2g;
}