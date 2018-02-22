package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorControll {
    @FXML
    public Label result;
    public Button one;
    public Button two;
    public Button four;
    public Button seven;
    public Button delite;
    public Button five;
    public Button eight;
    public Button nol;
    public Button three;
    public Button six;
    public Button nine;
    public Button equally;
    public Button multiply;
    public Button divide;
    public Button add;
    public Button away;


    public void test(ActionEvent actionEvent){
        result.setText(result.getText());
    }
    public void setOne(ActionEvent actionEvent){
        result.setText(one.getText());
    }
    public void setTwo(ActionEvent actionEvent){
        result.setText(two.getText());
    }
    public void setThree(ActionEvent actionEvent){
        result.setText(three.getText());
    }
    public void setFour(ActionEvent actionEvent){
        result.setText(four.getText());
    }
    public void setFive(ActionEvent actionEvent){
        result.setText(five.getText() + five.getText());
    }
    public void setSix(ActionEvent actionEvent){
        result.setText(six.getText());
    }
    public void setSeven(ActionEvent actionEvent){
        result.setText(seven.getText());
    }
    public void setEight(ActionEvent actionEvent){
        result.setText(eight.getText());
    }
    public void setNine(ActionEvent actionEvent){
        result.setText(nine.getText());
    }
    public void setNol(ActionEvent actionEvent){
        result.setText(nol.getText());
    }
    public void setAdd(ActionEvent actionEvent){
        result.setText(add.getText());
    }
    public void setAway(ActionEvent actionEvent){
        result.setText(away.getText());
    }
    public void setMultiply(ActionEvent actionEvent){
        result.setText(multiply.getText());
    }
    public void setDivide(ActionEvent actionEvent){
        result.setText(divide.getText());
    }
    public void setDelite(ActionEvent actionEvent) {result.setText("0");}
}
