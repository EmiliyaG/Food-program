package foodapp;

import javax.swing.*;
import java.awt.*;

public class FoodAndBevarages extends Design {
    public void makeFoodLabels(){
        JLabel lblFood = new JLabel("Food");
        lblFood.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblFood.setBounds(20, 11, 67, 25);
        foodAndBevaragesPanel.add(lblFood);
//lbl hrani
        JLabel lblNewLabel = new JLabel("Cheese burger:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(20, 47, 107, 25);
        foodAndBevaragesPanel.add(lblNewLabel);

        JLabel lblPizza = new JLabel("Pizza:");
        lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPizza.setBounds(20, 83, 67, 25);
        foodAndBevaragesPanel.add(lblPizza);

        txtHotDog = new JTextField();
        txtHotDog.setBounds(137, 123, 102, 20);
        foodAndBevaragesPanel.add(txtHotDog);
        txtHotDog.setColumns(10);

        txtPizza = new JTextField();
        txtPizza.setColumns(10);
        txtPizza.setBounds(137, 87, 102, 20);
        foodAndBevaragesPanel.add(txtPizza);

        txtBurger = new JTextField();
        txtBurger.setColumns(10);
        txtBurger.setBounds(137, 51, 102, 20);
        foodAndBevaragesPanel.add(txtBurger);

        txtFrenchFries = new JTextField();
        txtFrenchFries.setColumns(10);
        txtFrenchFries.setBounds(137, 160, 102, 20);
        foodAndBevaragesPanel.add(txtFrenchFries);

        JLabel lblFrenchFries = new JLabel("French fries:");
        lblFrenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblFrenchFries.setBounds(20, 155, 114, 25);
        foodAndBevaragesPanel.add(lblFrenchFries);

        JLabel lblHotDog = new JLabel("Hot dog:");
        lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHotDog.setBounds(20, 119, 114, 25);
        foodAndBevaragesPanel.add(lblHotDog);

        JLabel lblBeverages = new JLabel("Beverages");
        lblBeverages.setBounds(20, 191, 133, 25);
        foodAndBevaragesPanel.add(lblBeverages);
        lblBeverages.setFont(new Font("Tahoma", Font.ITALIC, 20));
    }
    public void makeTakoaZaBelivery(){
        comboBox1 = new JComboBox();
        comboBox1.setBounds(20, 227, 219, 36);
        foodAndBevaragesPanel.add(comboBox1);
        comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"Select a drink", "Cola", "Water", "Juice", "Ice tea", "Coffee"}));

        txtQuantity = new JTextField();
        txtQuantity.setBounds(137, 274, 102, 20);
        foodAndBevaragesPanel.add(txtQuantity);
        txtQuantity.setText("");
        txtQuantity.setColumns(10);

        JLabel lblQuantity = new JLabel("Quantity:");
        lblQuantity.setBounds(20, 274, 107, 25);
        foodAndBevaragesPanel.add(lblQuantity);
        lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JLabel label_4 = new JLabel("Quantity:");
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        label_4.setBounds(137, 11, 107, 25);
        foodAndBevaragesPanel.add(label_4);
    }



}
