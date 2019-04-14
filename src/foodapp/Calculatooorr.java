package foodapp;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculatooorr extends Panels{
    public static void nz() {
        JButton btnPlusMinus = new JButton("\u00B1");
        btnPlusMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlusMinus.setBounds(122, 257, 56, 50);
        calculatorPanel.add(btnPlusMinus);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(10, 257, 56, 50);
        calculatorPanel.add(btn0);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDot.setBounds(66, 257, 56, 50);
        calculatorPanel.add(btnDot);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnEqual.setBounds(178, 257, 56, 50);
        calculatorPanel.add(btnEqual);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDiv.setBounds(178, 207, 56, 50);
        calculatorPanel.add(btnDiv);

        JButton btnMult = new JButton("*");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMult.setBounds(178, 156, 56, 50);
        calculatorPanel.add(btnMult);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMinus.setBounds(178, 105, 56, 50);
        calculatorPanel.add(btnMinus);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPlus.setBounds(178, 54, 56, 50);
        calculatorPanel.add(btnPlus);

        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setColumns(10);
        textField.setBounds(10, 11, 224, 39);
        calculatorPanel.add(textField);

        JButton btnPercent = new JButton("%");
        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPercent.setBounds(122, 54, 56, 50);
        calculatorPanel.add(btnPercent);

        JButton btnClearAll = new JButton("C");
        btnClearAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnClearAll.setBounds(66, 54, 56, 50);
        calculatorPanel.add(btnClearAll);

        JButton btnClearOne = new JButton("<-");
        btnClearOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnClearOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnClearOne.setBounds(10, 54, 56, 50);
        calculatorPanel.add(btnClearOne);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 105, 56, 50);
        calculatorPanel.add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 156, 56, 50);
        calculatorPanel.add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 207, 56, 50);
        calculatorPanel.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(66, 207, 56, 50);
        calculatorPanel.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(122, 207, 56, 50);
        calculatorPanel.add(btn3);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(122, 156, 56, 50);
        calculatorPanel.add(btn6);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(66, 156, 56, 50);
        calculatorPanel.add(btn5);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(66, 105, 56, 50);
        calculatorPanel.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(122, 105, 56, 50);
        calculatorPanel.add(btn9);
    }
}
