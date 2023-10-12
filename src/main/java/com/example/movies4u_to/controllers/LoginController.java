package com.example.movies4u_to.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class LoginController{
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField userNameTextField;
    @FXML
    private javafx.scene.control.PasswordField PasswordField;



    public void loginButtonOnAction(ActionEvent event){
        if (!userNameTextField.getText().isBlank() && !PasswordField.getText().isBlank()) {
            validateLogin();
        }else {
            loginMessageLabel.setText("Please Enter Username & Password");
        }
    }
    public void cancelButtonOnAction(ActionEvent event){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){}

}
