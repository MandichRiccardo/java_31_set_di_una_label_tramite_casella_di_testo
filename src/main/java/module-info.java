module com.example.java_31_set_di_una_label_tramite_casella_di_testo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_31_set_di_una_label_tramite_casella_di_testo to javafx.fxml;
    exports com.example.java_31_set_di_una_label_tramite_casella_di_testo;
}