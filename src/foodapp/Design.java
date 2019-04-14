package foodapp;

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

public class Design extends JFrame {
    public JPanel taxPanel;
    public JPanel menuPanel;
    public JPanel backgroundPanel;
    public JPanel contentPane;
    public JTextField txtFrenchFries;
    public JTextField txtPizza;
    public JTextField txtBurger;
    public JTextField txtHotDog;
    public JTextField textField;
    public JTextField txtQuantity;
    public JCheckBox chckbxHomeDelivery;
    public JComboBox comboBox1;
    public JLabel lblMeals;
    public JLabel lblDrinks;
    public JLabel lblTotal;
    public JLabel lblDelivery;
    public JPanel foodAndBevaragesPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Design frame = new Design();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
       Design n = new Design();

    }
public void nz(){
    Panels panels = new Panels();
    panels.setBackgroundPanel();
}
    public Design() {
        //main panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 839, 585);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


//      panels.setFoodAndBevaragesPanel();
//      panels.setTaxPanel();
//        makeBtnClear();
//        makeBtnExit();
//        Calculatooorr calculator = new Calculatooorr();
//        calculator.nz();

//        createLblFastFood();

//      Menu menuu = new Menu();
//      menuu.createLabels();

//        makeSeparator();
    }


//    public void makeMainPanel() {
//
//    }
    public void makeBtnExit() {
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnExit.setBounds(113, 80, 154, 30);
        taxPanel.add(btnExit);
    }

    public void makeSeparator() {
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 65, 802, 2);
        backgroundPanel.add(separator);
    }

    public void createLblFastFood() {
        JLabel lblFastFoods = new JLabel("FAST FOOD");
        lblFastFoods.setBounds(10, 11, 284, 56);
        lblFastFoods.setForeground(new Color(0, 0, 0));
        lblFastFoods.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
        backgroundPanel.add(lblFastFoods);
    }

    public void makeBtnClear() {
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
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
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnClear.setBounds(113, 44, 154, 30);
        taxPanel.add(btnClear);
    }
}
