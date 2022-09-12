module com.silverlink.piandpbpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.silverlink.piandpbpractice to javafx.fxml;
    exports com.silverlink.piandpbpractice;
}