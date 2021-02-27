
package com.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLController implements Initializable {

    @FXML
    private TextField label;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button comma;
    @FXML
    private Button bol;
    @FXML
    private Button mod;
    @FXML
    private Button vur;
    @FXML
    private Button cix;
    @FXML
    private Button add;
    @FXML
    private Button clear;
    @FXML
    private Button equal;

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Basladi");
    }    

    @FXML
    private void onePr(ActionEvent event) {
    label.setText(label.getText()+"1");
    }

    @FXML
    private void twoPr(ActionEvent event) {
    label.setText(label.getText()+"2");
    }

    @FXML
    private void threePr(ActionEvent event) {
    label.setText(label.getText()+"3");
    }

    @FXML
    private void fourPr(ActionEvent event) {
   label.setText(label.getText()+"4");
    }

    @FXML
    private void fivePr(ActionEvent event) {
    label.setText(label.getText()+"5");
    }

    @FXML
    private void sixPr(ActionEvent event) {
    label.setText(label.getText()+"6");
    }

    @FXML
    private void sevenPr(ActionEvent event) {
    label.setText(label.getText()+"7");
    }

    @FXML
    private void eightPr(ActionEvent event) {
    label.setText(label.getText()+"8");
    }

    @FXML
    private void ninePr(ActionEvent event) {
    label.setText(label.getText()+"9");
    }

    @FXML
    private void zeroPr(ActionEvent event) {
    label.setText(label.getText()+"0");
    }

    @FXML
    private void comm(ActionEvent event) {
   label.setText(label.getText()+".");
    }

    @FXML
    private void bolPr(ActionEvent event) {
   label.setText(label.getText()+" / ");
    }

    @FXML
    private void modPr(ActionEvent event) {
    label.setText(label.getText()+" % ");
    }

    @FXML
    private void vurPr(ActionEvent event) {
    label.setText(label.getText()+" * ");
    }

    @FXML
    private void cixPr(ActionEvent event) {
    
    label.setText(label.getText()+" - ");
    }

    @FXML
    private void addPr(ActionEvent event) {
label.setText(label.getText()+" + ");
    }

    @FXML
    private void clearPr(ActionEvent event) {
   label.setText("");
    }

    @FXML
    private void equalPr(ActionEvent event) {
    String cumle=label.getText();
    String a[]=cumle.split(" ");
    
    double first=Double.parseDouble(a[0]);
    double second=Double.parseDouble(a[2]);
    
    String command=a[1];
    double cavab=0;
    switch (command) {
        case "+" :
            cavab=first+second;
        break;
        case "-" :
            cavab=first-second;
                    break;
        case "*" :
            cavab=first*second;
            break;
        case "/" : 
            cavab=first/second;
            break;
        case "%" :
            cavab=first % second;
            break;
        default :
           label.setText("An error occured");
          
    }
    
    String h=(""+cavab);
label.setText(h);
    
    
    }
    
}

