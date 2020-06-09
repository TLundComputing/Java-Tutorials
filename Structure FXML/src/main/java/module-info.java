module org.tjl.fxlivelesson {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.tjl.fxlivelesson to javafx.fxml;
    exports org.tjl.fxlivelesson;
}