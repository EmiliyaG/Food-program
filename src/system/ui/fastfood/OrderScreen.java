package system.ui.fastfood;


import system.logic.foodlogic.Calculating;
import system.logic.foodlogic.Calculating;
import system.logic.foodlogic.OrderScreenLogic;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderScreen extends JFrame {
    public JPanel backgroundPanel;
    public JPanel contentPane;
    private CalcPriceScreen calcPriceScreen;
    private OrderScreenLogic logic;
    private Calculator calculator;
    private MenuDesign menuDesign;
    private ProductsScreen productsScreen;
    private Calculating calculating;

    public OrderScreen() {
        this.contentPane = setUpMainPanel();
        this.backgroundPanel = setUpBackgroundPanel(contentPane);
//        this.taxPanel = setUpTaxPanel();
//        this.calculatorPanel = setUpCalculatorPanel();
//        this.menuPanel = setUpMenuPanel();
//        this.foodAndBevaragesPanel = setUpFoodAndBevaragesPanel();
        this.logic = new OrderScreenLogic();
        logic.setScreenLisener(this);

        this.menuDesign = new MenuDesign();
        menuDesign.setOrderScreen(this);
        menuDesign.createLabels();

        this.calcPriceScreen = new CalcPriceScreen();
        calcPriceScreen.setOrderScreen(this);
        calcPriceScreen.allCalculations();

        this.calculator = new Calculator();
        calculator.setScreenLisenerCalculator(this);
        calculator.callButtons();

        this.productsScreen = new ProductsScreen();
        productsScreen.setOrderScreen(this);
        productsScreen.callAllMethods();

        this.calculating = new Calculating();
        calculating.setProductsScreen(this.productsScreen);
        calculating.setCalcPriceScreen(this.calcPriceScreen);
        calculating.calcAllPrice();
        calculating.calcHomeDelivery();
//calcPriceScreen.totalTaxPrice.setText(calculating.allPrice);

        makeBtnTotal();
        makeBtnClear();
        makeBtnExit();
        createLblFastFood();
        makeSeparator();


        setVisible(true);

    }

    //panels
    private JPanel setUpMainPanel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 839, 585);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        return contentPane;
    }

//    private JPanel setUpFoodAndBevaragesPanel() {
//        foodAndBevaragesPanel = new JPanel();
//        foodAndBevaragesPanel.setBounds(264, 78, 269, 322);
//        foodAndBevaragesPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
//        foodAndBevaragesPanel.setBackground(new Color(220, 220, 220));
//        backgroundPanel.add(foodAndBevaragesPanel);
//        foodAndBevaragesPanel.setLayout(null);
//        return contentPane;
//    }
//
//    private JPanel setUpMenuPanel() {
//        menuPanel = new JPanel();
//        menuPanel.setBounds(543, 78, 269, 322);
//        menuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
//        menuPanel.setBackground(new Color(220, 220, 220));
//        backgroundPanel.add(menuPanel);
//        menuPanel.setLayout(null);
//        return contentPane;
//    }
//
//    private JPanel setUpCalculatorPanel() {
//        JPanel calculatorPanel = new JPanel();
//        calculatorPanel.setBounds(10, 78, 244, 322);
//        calculatorPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
//        calculatorPanel.setBackground(new Color(220, 220, 220));
//        backgroundPanel.add(calculatorPanel);
//        calculatorPanel.setLayout(null);
//        return contentPane;
//    }
//
//    private JPanel setUpTaxPanel() {
//        JPanel taxPanel = new JPanel();
//        taxPanel.setBounds(10, 411, 802, 124);
//        taxPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
//        taxPanel.setBackground(new Color(220, 220, 220));
//        backgroundPanel.add(taxPanel);
//        taxPanel.setLayout(null);
//        return taxPanel;
//    }

    private JPanel setUpBackgroundPanel(JPanel contentPane) {
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBackground(new Color(169, 169, 169));
        backgroundPanel.setBounds(0, 0, 823, 546);
        contentPane.add(backgroundPanel);
        backgroundPanel.setLayout(null);
        return backgroundPanel;
    }

    //btn total
    private void makeBtnTotal() {
        JButton btnTotal = new JButton("Total");
        btnTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                calcPriceScreen.totalTaxPrice.setText(String.valueOf(calculating.allPriceOfDrinks));
            }
        });
        btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnTotal.setBounds(123, 410, 154, 30);
        backgroundPanel.add(btnTotal);
    }

    //clear
    private void makeBtnClear() {
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(arg0 -> logic.clearButtonSelected());
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnClear.setBounds(123, 446, 154, 30);
        backgroundPanel.add(btnClear);
    }

    public void resetUiElements() {
        productsScreen.priceCoffee.setText(null);
        productsScreen.priceCola.setText(null);
        productsScreen.priceWater.setText(null);
        productsScreen.priceBurger.setText(null);
        productsScreen.pricePizza.setText(null);
        productsScreen.priceHotdog.setText(null);
        productsScreen.priceFries.setText(null);
        calcPriceScreen.totalTaxPrice.setText("0.0");
        calcPriceScreen.mealsPrice.setText("0.0");
        calcPriceScreen.deliveryPrice.setText("0.0");
        calcPriceScreen.drinksPrice.setText("0.0");
        calcPriceScreen.homeDelivery.setSelected(false);
    }

    //exit
    private void makeBtnExit() {
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(arg0 -> logic.exitBtnSelected());
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnExit.setBounds(123, 482, 154, 30);
        backgroundPanel.add(btnExit);
    }

    public void exitOfTheProgram() {
        System.exit(0);
    }

    //nadpisi
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

