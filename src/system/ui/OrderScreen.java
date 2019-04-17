package system.ui;

import foodapp.*;
import system.data.ProductsRepository;
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

public class OrderScreen extends JFrame {
    public JLabel lblMeals;
    public JLabel lblDrinks;
    public JLabel lblTotal;
    public JLabel lblDelivery;
    public JPanel taxPanel;
    public JPanel menuPanel;
    public JPanel backgroundPanel;
    public JPanel contentPane;
    public JPanel calculatorPanel;
    public JTextField txtFrenchFries;
    public JTextField txtPizza;
    public JTextField txtBurger;
    public JTextField txtHotDog;
    private JTextField textField;
    public JTextField txtQuantity;
    public JCheckBox chckbxHomeDelivery;
    public JComboBox comboBox1;
    public JPanel foodAndBevaragesPanel;
    public OrderScreenLogic logic;
    public Calculator calculator;


    public OrderScreen() {
        this.contentPane = setUpMainPanel();
        this.backgroundPanel = setUpBackgroundPanel(contentPane);
        this.taxPanel = setUpTaxPanel();
        this.calculatorPanel = setUpCalculatorPanel();
        this.menuPanel = setUpMenuPanel();
        this.foodAndBevaragesPanel = setUpFoodAndBevaragesPanel();

        this.logic = new OrderScreenLogic();
        logic.setScreenLisener(this);

        this.calculator = new Calculator();
        calculator.setScreenLisenerCalculator(this);
        calculator.callButtons();
        makeBtnClear();
        makeBtnExit();
        createLblFastFood();
        makeSeparator();

//        ProductsRepository productsRepository= new ProductsRepository();
//        productsRepository.getBelarages();
//        productsRepository.getFoods();
        setVisible(true);

    }

    private JPanel setUpMainPanel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 839, 585);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
//        setUpMainPanel(contentPane);
        contentPane.setLayout(null);
        return contentPane;
    }

    private JPanel setUpFoodAndBevaragesPanel() {
        foodAndBevaragesPanel = new JPanel();
        foodAndBevaragesPanel.setBounds(264, 78, 269, 322);
        foodAndBevaragesPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        foodAndBevaragesPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(foodAndBevaragesPanel);
        foodAndBevaragesPanel.setLayout(null);
        return contentPane;
    }

    private JPanel setUpMenuPanel() {
        menuPanel = new JPanel();
        menuPanel.setBounds(543, 78, 269, 322);
        menuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        menuPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(menuPanel);
        menuPanel.setLayout(null);
        return contentPane;
    }

    private JPanel setUpCalculatorPanel() {
        JPanel calculatorPanel = new JPanel();
        calculatorPanel.setBounds(10, 78, 244, 322);
        calculatorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        calculatorPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(calculatorPanel);
        calculatorPanel.setLayout(null);
        return contentPane;
    }

    private JPanel setUpTaxPanel() {
        JPanel taxPanel = new JPanel();
        taxPanel.setBounds(10, 411, 802, 124);
        taxPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        taxPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(taxPanel);
        taxPanel.setLayout(null);
        return taxPanel;
    }

    private JPanel setUpBackgroundPanel(JPanel contentPane) {
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(169, 169, 169));
        backgroundPanel.setBounds(0, 0, 823, 546);
        contentPane.add(backgroundPanel);
        backgroundPanel.setLayout(null);
        return backgroundPanel;
    }


    private void makeBtnClear() {
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(arg0 -> logic.clearButtonSelected());
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnClear.setBounds(113, 44, 154, 30);
        taxPanel.add(btnClear);
    }

    public void resetUiElements() {
        txtBurger.setText(null);
        txtPizza.setText(null);
        txtHotDog.setText(null);
        txtFrenchFries.setText(null);
        txtQuantity.setText(null);
        comboBox1.setSelectedItem("Select a drink");
        lblMeals.setText("0.0");
        lblDrinks.setText("0.0");
        lblTotal.setText("0.0");
        lblDelivery.setText("0.0");
    }


    private void makeBtnExit() {
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(arg0 -> System.exit(0));
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnExit.setBounds(113, 80, 154, 30);
        taxPanel.add(btnExit);
    }

    private void makeSeparator() {
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 65, 802, 2);
        backgroundPanel.add(separator);
    }

    private void createLblFastFood() {
        JLabel lblFastFoods = new JLabel("FAST FOOD");
        lblFastFoods.setBounds(10, 11, 284, 56);
        lblFastFoods.setForeground(new Color(0, 0, 0));
        lblFastFoods.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
        backgroundPanel.add(lblFastFoods);
    }

}

