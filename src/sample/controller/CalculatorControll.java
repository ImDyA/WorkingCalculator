package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class CalculatorControll {
    Float data = 0f;
    int operator = -1;
    @FXML
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button nol;
    public Button delite;
    public Button equally;
    public Button multiply;
    public Button divide;
    public Button add;
    public Button away;
    public Text text;


    public void buttonViev(ActionEvent actionEvent) {
        if(actionEvent.getSource() == one){
            text.setText(text.getText() + "1");
        }else if(actionEvent.getSource() == two){
            text.setText(text.getText() + "2");
        }else if(actionEvent.getSource() == three){
            text.setText(text.getText() + "3");
        }else if(actionEvent.getSource() == four){
            text.setText(text.getText() + "4");
        }else if(actionEvent.getSource() == five){
            text.setText(text.getText() + "5");
        }else if(actionEvent.getSource() == six){
            text.setText(text.getText() + "6");
        }else if(actionEvent.getSource() == seven){
            text.setText(text.getText() + "7");
        }else if(actionEvent.getSource() == eight){
            text.setText(text.getText() + "8");
        }else if(actionEvent.getSource() == nine){
            text.setText(text.getText() + "9");
        }else if(actionEvent.getSource() == nol){
            text.setText(text.getText() + "0");
        }else if(actionEvent.getSource() == delite){
            text.setText("");
        }else if(actionEvent.getSource() == add){
            data = Float.parseFloat(text.getText());
            operator = 1;
            text.setText("");
        }else if(actionEvent.getSource() == away){
            data = Float.parseFloat(text.getText());
            operator = 2;
            text.setText("");
        }else if(actionEvent.getSource() == multiply){
            data = Float.parseFloat(text.getText());
            operator = 3;
            text.setText("");
        }else if(actionEvent.getSource() == divide){
            data = Float.parseFloat(text.getText());
            operator = 4;
            text.setText("");
        }else if(actionEvent.getSource() == equally){
            Float secondOperator = Float.parseFloat(text.getText());
            switch (operator){
                case 1:
                    Float ans = data + secondOperator;
                    text.setText(String.valueOf(ans));break;
                case 2:
                    ans = data - secondOperator;
                    text.setText(String.valueOf(ans));break;
                case 3:
                    ans = data * secondOperator;
                    text.setText(String.valueOf(ans));break;
                case 4:
                    ans = 0f;
                    try {
                        ans = data / secondOperator;
                    }catch (Exception e){
                        text.setText("ERROR");
                    }
                    text.setText(String.valueOf(ans));break;
            }
        }
    }
}
