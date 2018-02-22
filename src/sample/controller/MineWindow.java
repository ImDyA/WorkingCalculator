package sample.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MineWindow{
    @FXML
    public TextField test1;
    @FXML
    public TextField test2;
    @FXML
    public TextField test3;
    @FXML
    public TextField test4;
    @FXML
    public Label labelText;

    public void summr(ActionEvent actionEvent, String s, String s1, String s2, String s3){
        if(s.length() > 1 || s1.length() > 1 || s2.length() > 1 || s3.length() > 1){
            try {
                Stage stage = new Stage();
                Parent root = null;
                root = FXMLLoader.load(getClass().getResource("../fxml/falsePass2.fxml"));
                stage.setTitle("False Password");
                stage.setMinWidth(350);
                stage.setMaxHeight(100);
                stage.setResizable(false);
                stage.setScene(new Scene(root));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (s.equals("")||s1.equals("")||s2.equals("")||s3.equals("")) {
            try {
                Stage stage = new Stage();
                Parent root = null;
                root = FXMLLoader.load(getClass().getResource("../fxml/falsePass.fxml"));
                stage.setTitle("False Password");
                stage.setMinWidth(350);
                stage.setMaxHeight(100);
                stage.setResizable(false);
                stage.setScene(new Scene(root));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void showDialog(ActionEvent actionEvent) {
        String t = test1.getText();
        String t1 = test2.getText();
        String t2 = test3.getText();
        String t3 = test4.getText();
        summr(actionEvent, t, t1, t2, t3);

        if (t.equals("a")&&t1.equals("s")&&t2.equals("d")&&t3.equals("f")) {
            try {
                Stage stage = new Stage();
                Parent root = null;
                root = FXMLLoader.load(getClass().getResource("../fxml/calculator.fxml"));
                stage.setTitle("Calculator");
                stage.setMinWidth(400);
                stage.setMaxHeight(420);
                stage.setResizable(false);
                stage.setScene(new Scene(root));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if (!t.equals("")||!t.equals("")||!t.equals("")||!t.equals("")) {
            try {
                Stage stage = new Stage();
                Parent root = null;
                root = FXMLLoader.load(getClass().getResource("../fxml/falsePass.fxml"));
                stage.setTitle("False Password");
                stage.setMinWidth(350);
                stage.setMaxHeight(100);
                stage.setResizable(false);
                stage.setScene(new Scene(root));
                stage.initModality(Modality.WINDOW_MODAL);
                stage.initOwner(((Node) actionEvent.getSource()).getScene().getWindow());
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

