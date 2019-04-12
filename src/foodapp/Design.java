package foodapp;
import java.awt.BorderLayout;
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
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Design extends JFrame{
    private JPanel contentPane;
    private JTextField txtNuggets;
    private JTextField txtPizza;
    private JTextField txtBurger;
    private JTextField txtSalad;
    private JTextField textField;
    private JTextField txtSandwich;
    private JTextField txtFries;
    private JTextField txtHotdog;
    private JTextField txtQuantity;



        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Design frame = new Design();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
         * Create the frame.
         */
        public Design() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 844, 585);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JPanel backgroundPanel = new JPanel();
            backgroundPanel.setBackground(new Color(169, 169, 169));
            backgroundPanel.setBounds(0, 0, 828, 546);
            contentPane.add(backgroundPanel);
            backgroundPanel.setLayout(null);

            JPanel panel_1 = new JPanel();
            panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
            panel_1.setBackground(new Color(220, 220, 220));
            panel_1.setBounds(264, 78, 269, 322);
            backgroundPanel.add(panel_1);
            panel_1.setLayout(null);

            JLabel lblFood = new JLabel("Food");
            lblFood.setFont(new Font("Tahoma", Font.ITALIC, 20));
            lblFood.setBounds(20, 11, 67, 25);
            panel_1.add(lblFood);

            JLabel lblNewLabel = new JLabel("Cheese burger:");
            lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblNewLabel.setBounds(20, 47, 107, 25);
            panel_1.add(lblNewLabel);

            JLabel lblPizza = new JLabel("Pizza:");
            lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblPizza.setBounds(20, 83, 67, 25);
            panel_1.add(lblPizza);

            JLabel lblChickenNuggets = new JLabel("Chicken nuggets:");
            lblChickenNuggets.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblChickenNuggets.setBounds(20, 119, 114, 25);
            panel_1.add(lblChickenNuggets);

            txtNuggets = new JTextField();
            txtNuggets.setBounds(137, 123, 102, 20);
            panel_1.add(txtNuggets);
            txtNuggets.setColumns(10);

            txtPizza = new JTextField();
            txtPizza.setColumns(10);
            txtPizza.setBounds(137, 87, 102, 20);
            panel_1.add(txtPizza);

            txtBurger = new JTextField();
            txtBurger.setColumns(10);
            txtBurger.setBounds(137, 51, 102, 20);
            panel_1.add(txtBurger);

            txtSalad = new JTextField();
            txtSalad.setColumns(10);
            txtSalad.setBounds(137, 160, 102, 20);
            panel_1.add(txtSalad);

            JLabel lblSalad = new JLabel("Salad:");
            lblSalad.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblSalad.setBounds(20, 155, 114, 25);
            panel_1.add(lblSalad);

            JLabel lblSandwich = new JLabel("Sandwich:");
            lblSandwich.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblSandwich.setBounds(20, 191, 114, 25);
            panel_1.add(lblSandwich);

            JLabel lblFrenchFries = new JLabel("French fries:");
            lblFrenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblFrenchFries.setBounds(20, 227, 114, 25);
            panel_1.add(lblFrenchFries);

            txtSandwich = new JTextField();
            txtSandwich.setColumns(10);
            txtSandwich.setBounds(137, 191, 102, 20);
            panel_1.add(txtSandwich);

            txtFries = new JTextField();
            txtFries.setColumns(10);
            txtFries.setBounds(137, 227, 102, 20);
            panel_1.add(txtFries);

            JLabel lblHotDog = new JLabel("Hot dog:");
            lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblHotDog.setBounds(20, 263, 114, 25);
            panel_1.add(lblHotDog);

            txtHotdog = new JTextField();
            txtHotdog.setColumns(10);
            txtHotdog.setBounds(137, 267, 102, 20);
            panel_1.add(txtHotdog);

            JPanel panel_2 = new JPanel();
            panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
            panel_2.setBackground(new Color(220, 220, 220));
            panel_2.setBounds(10, 411, 802, 124);
            backgroundPanel.add(panel_2);
            panel_2.setLayout(null);

            JLabel lblCostOfMeals = new JLabel("Cost of meals:");
            lblCostOfMeals.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblCostOfMeals.setBounds(436, 11, 107, 25);
            panel_2.add(lblCostOfMeals);

            JLabel lblCostOfDrinks = new JLabel("Cost of drinks:");
            lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblCostOfDrinks.setBounds(436, 47, 107, 25);
            panel_2.add(lblCostOfDrinks);

            JLabel lblCostOfDelivery = new JLabel("Cost of delivery:");
            lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblCostOfDelivery.setBounds(436, 83, 107, 25);
            panel_2.add(lblCostOfDelivery);

            JLabel lblMeals = new JLabel("0.0");
            lblMeals.setForeground(new Color(0, 0, 0));
            lblMeals.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblMeals.setBounds(553, 11, 66, 25);
            panel_2.add(lblMeals);

            JLabel lblDrinks = new JLabel("0.0");
            lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblDrinks.setBounds(553, 47, 89, 25);
            panel_2.add(lblDrinks);

            JLabel lblDelivery = new JLabel("0.0");
            lblDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblDelivery.setBounds(553, 83, 89, 25);
            panel_2.add(lblDelivery);

            JLabel lblTotalTax = new JLabel("Total tax:");
            lblTotalTax.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblTotalTax.setBounds(627, 11, 78, 25);
            panel_2.add(lblTotalTax);

            JLabel lblTotal = new JLabel("0.0");
            lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
            lblTotal.setBounds(715, 11, 77, 25);
            panel_2.add(lblTotal);

            JButton btnTotal = new JButton("Total");
            btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
            btnTotal.setBounds(10, 14, 154, 30);
            panel_2.add(btnTotal);

            JButton btnClear = new JButton("Clear");
            btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
            btnClear.setBounds(10, 50, 154, 30);
            panel_2.add(btnClear);

            JButton btnExit = new JButton("Exit");
            btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
            btnExit.setBounds(10, 86, 154, 30);
            panel_2.add(btnExit);

            JPanel panel = new JPanel();
            panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
            panel.setBackground(new Color(220, 220, 220));
            panel.setBounds(10, 78, 244, 322);
            backgroundPanel.add(panel);
            panel.setLayout(null);

            JButton btnPlusMinus = new JButton("\u00B1");
            btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnPlusMinus.setBounds(122, 257, 56, 50);
            panel.add(btnPlusMinus);

            JButton btn0 = new JButton("0");
            btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn0.setBounds(10, 257, 56, 50);
            panel.add(btn0);

            JButton btnDot = new JButton(".");
            btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnDot.setBounds(66, 257, 56, 50);
            panel.add(btnDot);

            JButton btnEqual = new JButton("=");
            btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnEqual.setBounds(178, 257, 56, 50);
            panel.add(btnEqual);

            JButton btnDiv = new JButton("/");
            btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnDiv.setBounds(178, 207, 56, 50);
            panel.add(btnDiv);

            JButton btnMult = new JButton("*");
            btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnMult.setBounds(178, 156, 56, 50);
            panel.add(btnMult);

            JButton btnMinus = new JButton("-");
            btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnMinus.setBounds(178, 105, 56, 50);
            panel.add(btnMinus);

            JButton btnPlus = new JButton("+");
            btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnPlus.setBounds(178, 54, 56, 50);
            panel.add(btnPlus);

            textField = new JTextField();
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            textField.setColumns(10);
            textField.setBounds(10, 11, 224, 39);
            panel.add(textField);

            JButton btnPercent = new JButton("%");
            btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
            btnPercent.setBounds(122, 54, 56, 50);
            panel.add(btnPercent);

            JButton btnClearAll = new JButton("C");
            btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnClearAll.setBounds(66, 54, 56, 50);
            panel.add(btnClearAll);

            JButton btnClearOne = new JButton("<-");
            btnClearOne.setFont(new Font("Tahoma", Font.PLAIN, 16));
            btnClearOne.setBounds(10, 54, 56, 50);
            panel.add(btnClearOne);

            JButton btn7 = new JButton("7");
            btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn7.setBounds(10, 105, 56, 50);
            panel.add(btn7);

            JButton btn4 = new JButton("4");
            btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn4.setBounds(10, 156, 56, 50);
            panel.add(btn4);

            JButton btn1 = new JButton("1");
            btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn1.setBounds(10, 207, 56, 50);
            panel.add(btn1);

            JButton btn2 = new JButton("2");
            btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn2.setBounds(66, 207, 56, 50);
            panel.add(btn2);

            JButton btn3 = new JButton("3");
            btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn3.setBounds(122, 207, 56, 50);
            panel.add(btn3);

            JButton btn6 = new JButton("6");
            btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn6.setBounds(122, 156, 56, 50);
            panel.add(btn6);

            JButton btn5 = new JButton("5");
            btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn5.setBounds(66, 156, 56, 50);
            panel.add(btn5);

            JButton btn8 = new JButton("8");
            btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn8.setBounds(66, 105, 56, 50);
            panel.add(btn8);

            JButton btn9 = new JButton("9");
            btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn9.setBounds(122, 105, 56, 50);
            panel.add(btn9);

            JLabel lblFastFoods = new JLabel("FAST FOOD");
            lblFastFoods.setForeground(new Color(0, 0, 0));
            lblFastFoods.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
            lblFastFoods.setBounds(10, 11, 284, 56);
            backgroundPanel.add(lblFastFoods);

            JPanel panel_3 = new JPanel();
            panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
            panel_3.setBackground(new Color(220, 220, 220));
            panel_3.setBounds(543, 78, 269, 322);
            backgroundPanel.add(panel_3);
            panel_3.setLayout(null);

            JLabel lblBeverages = new JLabel("Beverages");
            lblBeverages.setBounds(10, 11, 133, 25);
            panel_3.add(lblBeverages);
            lblBeverages.setFont(new Font("Tahoma", Font.ITALIC, 20));

            JComboBox comboBox = new JComboBox();
            comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
            comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Cola", "Water", "Juice", "Ice tea", "Coffee"}));
            comboBox.setBounds(10, 47, 249, 36);
            panel_3.add(comboBox);

            JLabel lblQuantity = new JLabel("Quantity:");
            lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
            lblQuantity.setBounds(10, 94, 133, 25);
            panel_3.add(lblQuantity);

            txtQuantity = new JTextField();
            txtQuantity.setText("");
            txtQuantity.setBounds(10, 130, 249, 36);
            panel_3.add(txtQuantity);
            txtQuantity.setColumns(10);

            JSeparator separator = new JSeparator();
            separator.setBounds(10, 65, 802, 2);
            backgroundPanel.add(separator);
        }
    }

