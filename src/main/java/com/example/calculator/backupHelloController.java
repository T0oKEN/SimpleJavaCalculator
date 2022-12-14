package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class backupHelloController {

    String temp = "";
    String tempFirstHalf = "";
    String tempSecondHalf = "";
    String sign = "";
    Boolean firstHalf = true;

    @FXML
    private TextField textBox;


    @FXML
    void keypad0(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"0");
    }

    @FXML
    void keypad1(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"1");
    }

    @FXML
    void keypad2(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"2");
    }

    @FXML
    void keypad3(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"3");
    }

    @FXML
    void keypad4(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"4");
    }

    @FXML
    void keypad5(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"5");
    }

    @FXML
    void keypad6(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"6");
    }

    @FXML
    void keypad7(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"7");
    }

    @FXML
    void keypad8(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"8");
    }

    @FXML
    void keypad9(MouseEvent event) {
        temp = textBox.getText();
        textBox.setText(temp+"9");
    }

    @FXML
    void keypadDelete(MouseEvent event) {
        if (!firstHalf){
            tempSecondHalf = "";
            textBox.setText("");
        }
        if (firstHalf){
            tempFirstHalf = "";
            textBox.setText("");
        }
    }

    @FXML
    void keypadDeleteAll(MouseEvent event) {
        tempFirstHalf = "";
        tempSecondHalf = "";
        textBox.setText("");
    }

    String deleteByOne(){
        temp = textBox.getText();
        temp = temp.substring(0, temp.length() - 1);
        /*System.out.println(temp);
        System.out.println(temp.length());
         */
        textBox.setText(temp);
        return null;
    }

    @FXML
    void keypadDeleteByOne(MouseEvent event) {
        if (temp.length() > 0) {
            deleteByOne();
        }
    }


    @FXML
    void keypadDot(MouseEvent event) {
        /*temp = textBox.getText();
        if (!temp.contains(".")) {
            textBox.setText(temp + ".");
        }

         */

    }

    @FXML
    void keypadEqual(MouseEvent event) {

        int num1 = Integer.parseInt(tempFirstHalf);
        /*if (sign == "divide"){
            result = temp1/temp2;
            textBox.setText(String.valueOf(result));
        } else if (sign == "plus") {
            result = temp1+temp2;
            textBox.setText(String.valueOf(result));
        }
        firstHalf = true;

         */
    }

    @FXML
    void keypadPlus(MouseEvent event) {
        clearAndSaveToFH();

        sign = "plus";
        firstHalf = false;
    }
    @FXML
    void keypadMinus(MouseEvent event) {
        sign = "minus";
        firstHalf = false;
    }

    @FXML
    void keypadMulti(MouseEvent event) {
        sign = "multi";
        firstHalf = false;
    }

    @FXML
    void keypadDivide(MouseEvent event) {
        sign = "divide";
        firstHalf = false;
    }



    @FXML
    void keypadOneOfX(MouseEvent event) {

    }

    @FXML
    void keypadPercent(MouseEvent event) {

    }



    @FXML
    void keypadPlusMinus(MouseEvent event) {

    }

    @FXML
    void keypadPower(MouseEvent event) {

    }

    @FXML
    void keypadSquareRoot(MouseEvent event) {

    }

    void clearAndSaveToFH(){
        tempFirstHalf = temp;
        temp = "";
        textBox.setText(temp);
    }

}
