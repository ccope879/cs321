module com.mycompany.monopolyguiexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.monopolyguiexample to javafx.fxml;
    exports com.mycompany.monopolyguiexample;
}
