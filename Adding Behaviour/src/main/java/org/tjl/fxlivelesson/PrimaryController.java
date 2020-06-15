package org.tjl.fxlivelesson;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML private TextField userField;
    @FXML private PasswordField passField;

    public void cancelBtn(){
        
        System.out.println("The application is closing");
        System.exit(0);
        
    }
    
    public void submitData(){
        
        String username = userField.getText().trim();
        String password = passField.getText().trim();
        
        if(username.equals("") || password.equals("")){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText("You experienced an error");
            alert.setContentText("You left an input box empty");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText("You have entered data");
            alert.setContentText("Username: " + username + "\nPassword: " + password);
            alert.showAndWait();
        }
        
    }
    
}
