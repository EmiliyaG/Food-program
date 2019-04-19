package system.ui;

import foodapp.*;
import system.data.ProductsRepository;
import system.logic.CalculatorLogic;
import system.logic.OrderScreenLogic;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
    public JButton btnPlusMinus;
    public JButton btn0;
    public JButton btnDot;
    public JButton btnEqual;
    public JButton btnDiv;
    public JButton btnMult;
    public JButton btnMinus;
    public JButton btnPlus;
    public JButton btnPercent;
    public JButton btnClearAll;
    public JButton btnClearOne;
    private OrderScreen orderScreen;
    public CalculatorLogic logicCalculator;
    public JTextField display;

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

//    public void makeBtnPlusMinus() {
//        btnPlusMinus = new JButton("\u00B1");
//        btnPlusMinus.addActionListener(arg0 -> logicCalculator.btnPlusMinusSelected());
//        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
//        btnPlusMinus.setBounds(122, 257, 56, 50);
//        orderScreen.calculatorPanel.add(btnPlusMinus);
//    }

    public void makeBtn0() {
        btn0 = new JButton("0");
        btn0.addActionListener(arg0 -> logicCalculator.btn0Selected());
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(10, 257, 56, 50);
        orderScreen.calculatorPanel.add(btn0);
    }

    public void makeBtnDot() {
        btnDot = new JButton(".");
        btnDot.addActionListener(arg0 -> logicCalculator.btnDotSelected());
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDot.setBounds(66, 257, 56, 50);
        orderScreen.calculatorPanel.add(btnDot);
    }

    public void makeBtnEqual() {
        btnEqual = new JButton("=");
        btnEqual.addActionListener(arg0 -> logicCalculator.btnEqualSelected());
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(178, 257, 56, 50);
        orderScreen.calculatorPanel.add(btnEqual);
    }

    public void makeBtnDiv() {
        btnDiv = new JButton("/");
        btnDiv.addActionListener(arg0 -> logicCalculator.btnDivSelected());
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDiv.setBounds(178, 207, 56, 50);
        orderScreen.calculatorPanel.add(btnDiv);
    }

    public void makeBtnMult() {
        btnMult = new JButton("*");
        btnMult.addActionListener(arg0 -> logicCalculator.btnMultSelected());
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(178, 156, 56, 50);
        orderScreen.calculatorPanel.add(btnMult);
    }

    public void makeBtnMinus() {
        btnMinus = new JButton("-");
        btnMinus.addActionListener(arg0 -> logicCalculator.btnMinusSelected());
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMinus.setBounds(178, 105, 56, 50);
        orderScreen.calculatorPanel.add(btnMinus);
    }

    public void makeBtnPlus() {
        btnPlus = new JButton("+");
        btnPlus.addActionListener(arg0 -> logicCalculator.btnPlusSelected());
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(178, 54, 56, 50);
        orderScreen.calculatorPanel.add(btnPlus);
    }

    public void makeTextField() {
        logicCalculator.display = new JTextField();
        logicCalculator.display.setHorizontalAlignment(SwingConstants.RIGHT);
        logicCalculator.display.setColumns(10);
        logicCalculator.display.setBounds(10, 11, 224, 39);
        orderScreen.calculatorPanel.add(logicCalculator.display);
    }
    public void makeBtnPlusMinus() {
        btnPlusMinus = new JButton("\u00B1");
        btnPlusMinus.addActionListener(arg0 -> logicCalculator.btnPlusMinusSelected());
        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlusMinus.setBounds(122, 257, 56, 50);
        orderScreen.backgroundPanel.add(btnPlusMinus);
    }
    public void makeBtnPercent() {
        btnPercent = new JButton("%");
        btnPercent.addActionListener(arg0 -> logicCalculator.btnPercentSelected());
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPercent.setBounds(122, 54, 56, 50);
        orderScreen.calculatorPanel.add(btnPercent);
    }

    public void makeBtnClearAll() {
        btnClearAll = new JButton("C");
        btnClearAll.addActionListener(arg0 -> logicCalculator.btnClearAllSelected());
        btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClearAll.setBounds(66, 54, 56, 50);
        orderScreen.calculatorPanel.add(btnClearAll);
    }

    public void makeBtnClearOnlyOneChar() {
        btnClearOne = new JButton("<-");
        btnClearOne.addActionListener(arg0 -> logicCalculator.btnClearOneCharSelected());
        btnClearOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnClearOne.setBounds(10, 54, 56, 50);
        orderScreen.calculatorPanel.add(btnClearOne);
    }

    public void makeBtn7() {
        btn7 = new JButton("7");
        btn7.addActionListener(arg0 -> logicCalculator.btn7Selected());
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 105, 56, 50);
        orderScreen.calculatorPanel.add(btn7);
    }

    public void makeBtn9() {
        btn9 = new JButton("9");
        btn9.addActionListener(arg0 -> logicCalculator.btn9Selected());
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(122, 105, 56, 50);
        orderScreen.calculatorPanel.add(btn9);
    }

    public void makeBtn8() {
        btn8 = new JButton("8");
        btn8.addActionListener(arg0 -> logicCalculator.btn8Selected());
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(66, 105, 56, 50);
        orderScreen.calculatorPanel.add(btn8);
    }

    public void makeBtn6() {
        btn6 = new JButton("6");
        btn6.addActionListener(arg0 -> logicCalculator.btn6Selected());
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(122, 156, 56, 50);
        orderScreen.calculatorPanel.add(btn6);
    }

    public void makeBtn5() {
        btn5 = new JButton("5");
        btn5.addActionListener(arg0 -> logicCalculator.btn5Selected());
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(66, 156, 56, 50);
        orderScreen.calculatorPanel.add(btn5);
    }

    public void makeBtn4() {
        btn4 = new JButton("4");
        btn4.addActionListener(arg0 -> logicCalculator.btn4Selected());
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 156, 56, 50);
        orderScreen.calculatorPanel.add(btn4);
    }

    public void makeBtn3() {
        btn3 = new JButton("3");
        btn3.addActionListener(arg0 -> logicCalculator.btn3Selected());
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(122, 207, 56, 50);
        orderScreen.calculatorPanel.add(btn3);
    }

    public void makeBtn2() {
        btn2 = new JButton("2");
        btn2.addActionListener(arg0 -> logicCalculator.btn2Selected());
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(66, 207, 56, 50);
        orderScreen.calculatorPanel.add(btn2);
    }

    public void makeBtn1() {
        btn1 = new JButton("1");
        btn1.addActionListener(arg0 -> logicCalculator.btn1Selected());
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 207, 56, 50);
        orderScreen.calculatorPanel.add(btn1);
    }
}
