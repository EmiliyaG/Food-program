package system.logic;

import system.ui.Calculator;
import system.ui.OrderScreen;

import javax.swing.*;
import java.util.jar.JarFile;

public class CalculatorLogic {
    public double firstNumber;
    public double secondNumber;
    public char chaar;
    public JTextField display;
    public double result;
    //    public void makeEqualLogic() {
//        switch (chaar) {
//            case '+':
//                result = firstNumber + secondNumber;
//                break;
//            case '-':
//                result = firstNumber - secondNumber;
//                break;
//            case '*':
//                result= firstNumber*secondNumber;
//                break;
//            case '%':
//                try {
//                    result = firstNumber % secondNumber;
//                } catch (ArithmeticException excp) {
//                    cl.displayLabel.setText("Divide by 0.");
//                    return;
//                }
//                break;
//            case '/':
//                try {
//                    temp = cl.number / temp;
//                } catch (ArithmeticException excp) {
//                    cl.displayLabel.setText("Divide by 0.");
//                    return;
//                }
//                break;
    public Calculator calculator;

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
        display.setText(calculator.enterNumber = display.getText() + calculator.btnEqual.getText());
    }
    public void btnDotSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnDot.getText());
    }
    public void btnPlusSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnPlus.getText());
    }
    public void btnMinusSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnMinus.getText());
    }
    public void btnPercentSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnPercent.getText());
    }
    public void btnDivSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnDiv.getText());
    }
    public void btnMultSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnMult.getText());
    }
    public void btnPlusMinusSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnPlusMinus.getText());
    }
    public void btnClearAllSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnClearAll.getText());
    }
    public void btnClearOneCharSelected() {
        display.setText(calculator.enterNumber = display.getText() + calculator.btnClearOne.getText());
    }

}
