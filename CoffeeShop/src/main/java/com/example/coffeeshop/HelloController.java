package com.example.coffeeshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML
    private RadioButton espressoRadioButton;
    @FXML
    private RadioButton latteRadioButton;
    @FXML
    private RadioButton coffeeRadioButton;
    @FXML
    private ToggleGroup beverageCoffeeGroup;
    @FXML
    private Label receiptLabel;

    //can't use a constructor here because the FX stuff isn't loaded
    public HelloController(){
       // showReceipt();
    }

    //kind of like a constructor - this runs AFTER the javafx stuff is added
    public void initialize(){
        showReceipt();
    }

    @FXML
    public void beverageRadioButtonClicked(ActionEvent actionEvent) {
//        if ( actionEvent.getSource() == espressoRadioButton ) {
//            receiptLabel.setText("Espresso $1.50");
//        } else if ( actionEvent.getSource() == coffeeRadioButton ) {
//            receiptLabel.setText("Coffee $1.00");
//        } else if ( actionEvent.getSource() == latteRadioButton ) {
//            receiptLabel.setText("Latte $2.00");
//        }
        showReceipt();
    }

    private void showReceipt(){
        if ( espressoRadioButton.isSelected() ) {
            receiptLabel.setText("Espresso $1.50");
        } else if ( coffeeRadioButton.isSelected() ) {
            receiptLabel.setText("Coffee $1.00");
        } else if ( latteRadioButton.isSelected() ) {
            receiptLabel.setText("Latte $2.00");
        }
    }
}