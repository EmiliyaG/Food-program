package foodapp;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TotalPrice extends Panels{

    public static void makeHomeDelivery() {
        chckbxHomeDelivery = new JCheckBox("Home delivery");
        chckbxHomeDelivery.setBounds(10, 7, 97, 23);
        taxPanel.add(chckbxHomeDelivery);
    }

    public static void calcPrice() {

        JLabel lblCostOfMeals = new JLabel("Cost of meal:");
        lblCostOfMeals.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCostOfMeals.setBounds(436, 11, 107, 25);
        taxPanel.add(lblCostOfMeals);

        JLabel lblCostOfDrinks = new JLabel("Cost of drinks:");
        lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCostOfDrinks.setBounds(436, 47, 107, 25);
        taxPanel.add(lblCostOfDrinks);

        JLabel lblCostOfDelivery = new JLabel("Cost of delivery:");
        lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCostOfDelivery.setBounds(436, 83, 107, 25);
        taxPanel.add(lblCostOfDelivery);

        lblMeals = new JLabel("0.0");
        lblMeals.setForeground(new Color(0, 0, 0));
        lblMeals.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMeals.setBounds(553, 11, 66, 25);
        taxPanel.add(lblMeals);

         lblDrinks = new JLabel("0.0");
        lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDrinks.setBounds(553, 47, 89, 25);
        taxPanel.add(lblDrinks);

         lblDelivery = new JLabel("0.0");
        lblDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDelivery.setBounds(553, 83, 89, 25);
        taxPanel.add(lblDelivery);

        JLabel lblTotalTax = new JLabel("Total tax:");
        lblTotalTax.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTotalTax.setBounds(627, 11, 78, 25);
        taxPanel.add(lblTotalTax);

        lblTotal = new JLabel("0.0");
        lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTotal.setBounds(715, 11, 77, 25);
        taxPanel.add(lblTotal);

        JButton btnTotal = new JButton("Total");
        btnTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double chooseBurger = Double.parseDouble(txtBurger.getText());
                double priceBurger = 3.00;
                double allBurgers = priceBurger * chooseBurger;
                String burger = String.format("%.2f", allBurgers);
                lblMeals.setText(burger);
            }
        });
        btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnTotal.setBounds(113, 8, 154, 30);
        taxPanel.add(btnTotal);
    }
}
