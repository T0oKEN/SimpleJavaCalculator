package com.example.calculator;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    int number;
    int result;
    String addOrDelete = "";
    String sign = "";

    String temporary = "";
    String firstHalfTemporary = "";
    String secondHalfTemporary = "";
    Boolean firstHalf = true;
    boolean renewSeason = false;

    @FXML
    private TextField textBox;

    protected void writeToTextBox(int number){
        this.number = number;
        this.addOrDelete = addOrDelete;

        if(renewSeason){
            renewSeason("All");
            renewSeason=false;
            //System.out.println("adadada");
            firstHalf=true;
        }
        temporary = textBox.getText();

        //adds number to textbox
        if (temporary.equals("0")){
            textBox.setText(String.valueOf(number));
        }
        else {
            textBox.setText(temporary + number);
        }

        //saves number to temporarily depending on boolean firstHalf
        if (firstHalf) {firstHalfTemporary = textBox.getText();}
        else {secondHalfTemporary = textBox.getText();}

        //System.out.println(temporary);
    }

    protected void changeSign(String sign){
        this.sign = sign;
        firstHalf = false;
        textBox.setText("");
    }

    protected void calculate(int a, int b){

        if (sign.equals("plus")){
            result = a+b;
        } else if (sign.equals("minus")) {
            result = a-b;
        } else if (sign.equals("multiply")) {
            result = a*b;
        } else if (sign.equals("divide")) {
            result = a/b;
        } else{
            System.out.println("Chyba v zadání znaménka");
        }
        textBox.setText(String.valueOf(result));
        firstHalfTemporary = String.valueOf(result);
    }

    protected void renewSeason(String AllOrPart){
        if (Objects.equals(AllOrPart, "All")){
            firstHalfTemporary = "";
            secondHalfTemporary = "";
        }else if(Objects.equals(AllOrPart, "Part")){
            if (firstHalf){
                firstHalfTemporary = "";
            }else if(!firstHalf){
                secondHalfTemporary = "";
            }
        }else{
            System.out.println("Chyba v zadání renewSeason");
        }


        firstHalf=true;
        textBox.setText("");
    }



    @FXML
    void keypad0(MouseEvent event) {
        writeToTextBox(0);
    }

    @FXML
    void keypad1(MouseEvent event) {
        writeToTextBox(1);
    }

    @FXML
    void keypad2(MouseEvent event) {
        writeToTextBox(2);
    }

    @FXML
    void keypad3(MouseEvent event) {
        writeToTextBox(3);
    }

    @FXML
    void keypad4(MouseEvent event) {
        writeToTextBox(4);
    }

    @FXML
    void keypad5(MouseEvent event) {
        writeToTextBox(5);
    }

    @FXML
    void keypad6(MouseEvent event) {
        writeToTextBox(6);
    }

    @FXML
    void keypad7(MouseEvent event) {
        writeToTextBox(7);
    }

    @FXML
    void keypad8(MouseEvent event) {
        writeToTextBox(8);
    }

    @FXML
    void keypad9(MouseEvent event) {
        writeToTextBox(9);
    }


    @FXML
    void keypadPlus(MouseEvent event) {
        changeSign("plus");
    }
    @FXML
    void keypadMinus(MouseEvent event) {
        changeSign("minus");
    }

    @FXML
    void keypadMulti(MouseEvent event) {
        changeSign("multiply");
    }
    @FXML
    void keypadDivide(MouseEvent event) {
        changeSign("divide");
    }

    @FXML
    void keypadDot(MouseEvent event) {

    }

    @FXML
    void keypadEqual(MouseEvent event) {
        if (secondHalfTemporary.isBlank()){
            textBox.setText(firstHalfTemporary);
        }else{
            calculate(Integer.parseInt(firstHalfTemporary), Integer.parseInt(secondHalfTemporary));
        }

        firstHalfTemporary = textBox.getText();
        //renewSeason = true;
    }

    @FXML
    void keypadDelete(MouseEvent event) {
        renewSeason("Part");
    }

    @FXML
    void keypadDeleteAll(MouseEvent event) {
        renewSeason("All");
    }

    @FXML
    void keypadDeleteByOne(MouseEvent event) {

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
