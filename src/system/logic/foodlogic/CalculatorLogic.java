package system.logic.foodlogic;

import system.ui.fastfood.Calculator;

import javax.swing.*;

public class CalculatorLogic {
    private double firstNumber;
    private double secondNumber;
    public JTextField display;
    private double result;
    private String operations;
    private Calculator calculator;

    public void setScreenLisenerLogicCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    /*
    this method is executed when the clear button is pressed
     */
    public void btn1Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn1.getText());
    }

    public void btn2Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn2.getText());
    }

    public void btn3Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn3.getText());
    }

    public void btn4Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn4.getText());
    }

    public void btn5Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn5.getText());
    }

    public void btn6Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn6.getText());
    }

    public void btn7Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn7.getText());
    }

    public void btn8Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn8.getText());
    }

    public void btn9Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn9.getText());
    }

    public void btn0Selected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btn0.getText());
    }

    public void btnEqualSelected() {
        operations();
    }

    public void btnDotSelected() {
        display.setText(String.valueOf(firstNumber = Double.parseDouble(display.getText() + ".")));
    }

    public void btnPlusSelected() {
        sthThatRepeats();
        operations = "+";
    }

    public void btnMinusSelected() {
        sthThatRepeats();
        operations = "-";
    }

    public void btnPercentSelected() {
        sthThatRepeats();
        operations = "%";
    }

    public void btnDivSelected() {
        display.setText(String.valueOf(firstNumber = Double.parseDouble(display.getText())));
        display.setText("");
        operations = "/";
    }

    public void btnMultSelected() {
        sthThatRepeats();
        operations = "*";
    }

    public void sthThatRepeats() {
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
    }

    public void btnPlusMinusSelected() {
        double change;
        change = Double.parseDouble(String.valueOf(display.getText()));
        change = change * (-1);
        display.setText(String.valueOf(change));
    }

    public void btnClearAllSelected() {
        display.setText(null);
    }

    public void btnClearOneCharSelected() {
        String clearOneChar = null;
        if (display.getText().length() > 0) {
            StringBuilder strBack = new StringBuilder(display.getText());
            strBack.deleteCharAt(display.getText().length() - 1);
            clearOneChar = strBack.toString();
            display.setText(clearOneChar);
        }
    }

    public void operations() {
        String answer;
        secondNumber = Double.parseDouble(display.getText());
        if (operations == "+") {
            result = firstNumber + secondNumber;
            formatAnswer();

        } else if (operations == "-") {
            result = firstNumber - secondNumber;
            formatAnswer();

        } else if (operations == "*") {
            result = firstNumber * secondNumber;
            formatAnswer();

        } else if (operations == "/") {
            result = firstNumber / secondNumber;
            formatAnswer();

        } else if (operations == "%") {
            result = firstNumber / 100 + secondNumber / secondNumber - 1;
            formatAnswer();
        }
    }

    public void formatAnswer() {
        String answer;
        answer = String.format("%.2f", result);
        display.setText(answer);
    }

}
