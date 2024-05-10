package com.example.java_31_set_di_una_label_tramite_casella_di_testo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Button applica;
    public TextField textBox;
    public Label text;

    public void applicaOnAction(){
        text.setText(textBox.getText());
    }
}