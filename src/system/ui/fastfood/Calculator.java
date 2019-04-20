package system.ui.fastfood;

import system.logic.foodlogic.CalculatorLogic;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator {
    public String enterNumber;
    public JButton btn1;
    public JButton btn2;
    public JButton btn3;
    public JButton btn4;
    public JButton btn5;
    public JButton btn6;
    public JButton btn7;
    public JButton btn8;
    public JButton btn9;
    private JButton btnPlusMinus;
    public JButton btn0;
    private JButton btnDot;
    private JButton btnEqual;
    private JButton btnDiv;
    private JButton btnMult;
    private JButton btnMinus;
    private JButton btnPlus;
    private JButton btnPercent;
    private JButton btnClearAll;
    private JButton btnClearOne;
    private OrderScreen orderScreen;
    private CalculatorLogic logicCalculator;

    public void setScreenLisenerCalculator(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    public void callButtons() {
        this.logicCalculator = new CalculatorLogic();
        logicCalculator.setScreenLisenerLogicCalculator(this);
        makeBtnPlusMinus();
        makeBtnDot();
        makeBtnEqual();
        makeBtnDiv();
        makeBtnMult();
        makeBtnMinus();
        makeBtnPlus();
        makeTextField();
        makeBtnPercent();
        makeBtnClearAll();
        makeBtnClearOnlyOneChar();
        makeBtn0();
        makeBtn1();
        makeBtn2();
        makeBtn3();
        makeBtn4();
        makeBtn5();
        makeBtn6();
        makeBtn7();
        makeBtn8();
        makeBtn9();
    }

    private void makeBtn0() {
        btn0 = new JButton("0");
        btn0.addActionListener(arg0 -> logicCalculator.btn0Selected());
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(20, 336, 56, 50);
        orderScreen.backgroundPanel.add(btn0);
    }

    private void makeBtnDot() {
        btnDot = new JButton(".");
        btnDot.addActionListener(arg0 -> logicCalculator.btnDotSelected());
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDot.setBounds(76, 336, 56, 50);
        orderScreen.backgroundPanel.add(btnDot);
    }

    private void makeBtnEqual() {
        btnEqual = new JButton("=");
        btnEqual.addActionListener(arg0 -> logicCalculator.btnEqualSelected());
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(188, 336, 56, 50);
        orderScreen.backgroundPanel.add(btnEqual);
    }

    private void makeBtnDiv() {
        btnDiv = new JButton("/");
        btnDiv.addActionListener(arg0 -> logicCalculator.btnDivSelected());
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDiv.setBounds(188, 286, 56, 50);
        orderScreen.backgroundPanel.add(btnDiv);
    }

    private void makeBtnMult() {
        btnMult = new JButton("*");
        btnMult.addActionListener(arg0 -> logicCalculator.btnMultSelected());
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(188, 235, 56, 50);
        orderScreen.backgroundPanel.add(btnMult);
    }

    private void makeBtnMinus() {
        btnMinus = new JButton("-");
        btnMinus.addActionListener(arg0 -> logicCalculator.btnMinusSelected());
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMinus.setBounds(188, 184, 56, 50);
        orderScreen.backgroundPanel.add(btnMinus);
    }

    private void makeBtnPlus() {
        btnPlus = new JButton("+");
        btnPlus.addActionListener(arg0 -> logicCalculator.btnPlusSelected());
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(188, 133, 56, 50);
        orderScreen.backgroundPanel.add(btnPlus);
    }

    private void makeTextField() {
        logicCalculator.display = new JTextField();
        logicCalculator.display.setHorizontalAlignment(SwingConstants.RIGHT);
        logicCalculator.display.setColumns(10);
        logicCalculator.display.setBounds(20, 90, 224, 39);
        orderScreen.backgroundPanel.add(logicCalculator.display);
    }

    private void makeBtnPlusMinus() {
        btnPlusMinus = new JButton("\u00B1");
        btnPlusMinus.addActionListener(arg0 -> logicCalculator.btnPlusMinusSelected());
        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlusMinus.setBounds(132, 336, 56, 50);
        orderScreen.backgroundPanel.add(btnPlusMinus);
    }

    private void makeBtnPercent() {
        btnPercent = new JButton("%");
        btnPercent.addActionListener(arg0 -> logicCalculator.btnPercentSelected());
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPercent.setBounds(132, 133, 56, 50);
        orderScreen.backgroundPanel.add(btnPercent);
    }

    private void makeBtnClearAll() {
        btnClearAll = new JButton("C");
        btnClearAll.addActionListener(arg0 -> logicCalculator.btnClearAllSelected());
        btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClearAll.setBounds(76, 133, 56, 50);
        orderScreen.backgroundPanel.add(btnClearAll);
    }

    private void makeBtnClearOnlyOneChar() {
        btnClearOne = new JButton("<-");
        btnClearOne.addActionListener(arg0 -> logicCalculator.btnClearOneCharSelected());
        btnClearOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnClearOne.setBounds(20, 133, 56, 50);
        orderScreen.backgroundPanel.add(btnClearOne);
    }

    private void makeBtn7() {
        btn7 = new JButton("7");
        btn7.addActionListener(arg0 -> logicCalculator.btn7Selected());
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(20, 184, 56, 50);
        orderScreen.backgroundPanel.add(btn7);
    }

    private void makeBtn9() {
        btn9 = new JButton("9");
        btn9.addActionListener(arg0 -> logicCalculator.btn9Selected());
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(132, 184, 56, 50);
        orderScreen.backgroundPanel.add(btn9);
    }

    private void makeBtn8() {
        btn8 = new JButton("8");
        btn8.addActionListener(arg0 -> logicCalculator.btn8Selected());
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(76, 184, 56, 50);
        orderScreen.backgroundPanel.add(btn8);
    }

    private void makeBtn6() {
        btn6 = new JButton("6");
        btn6.addActionListener(arg0 -> logicCalculator.btn6Selected());
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(132, 235, 56, 50);
        orderScreen.backgroundPanel.add(btn6);
    }

    private void makeBtn5() {
        btn5 = new JButton("5");
        btn5.addActionListener(arg0 -> logicCalculator.btn5Selected());
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(76, 235, 56, 50);
        orderScreen.backgroundPanel.add(btn5);
    }

    private void makeBtn4() {
        btn4 = new JButton("4");
        btn4.addActionListener(arg0 -> logicCalculator.btn4Selected());
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(20, 235, 56, 50);
        orderScreen.backgroundPanel.add(btn4);
    }

    private void makeBtn3() {
        btn3 = new JButton("3");
        btn3.addActionListener(arg0 -> logicCalculator.btn3Selected());
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(132, 286, 56, 50);
        orderScreen.backgroundPanel.add(btn3);
    }

    private void makeBtn2() {
        btn2 = new JButton("2");
        btn2.addActionListener(arg0 -> logicCalculator.btn2Selected());
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(76, 286, 56, 50);
        orderScreen.backgroundPanel.add(btn2);
    }

    private void makeBtn1() {
        btn1 = new JButton("1");
        btn1.addActionListener(arg0 -> logicCalculator.btn1Selected());
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(20, 286, 56, 50);
        orderScreen.backgroundPanel.add(btn1);
    }
}
