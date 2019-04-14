package foodapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class btnClear extends Panels{
    public static void makeBtnClear() {
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
