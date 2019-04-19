package system.logic;

import system.data.Product;

import javax.swing.*;

import system.ui.OrderScreen;

public class DrinksCalculating {
    public Product product;
    public JTextField txtQuantity;
    public double allPrice;
    public OrderScreen orderScreen;

    public void makeAddList() {

    }

    public void setDrinks() {
        JTextField txtQuantity = new JTextField();
        txtQuantity.setBounds(137, 274, 102, 20);
        orderScreen.foodAndBevaragesPanel.add(txtQuantity);
        txtQuantity.setText("");
        txtQuantity.setColumns(10);

        if (product.name.equals("Cola")) {
            product.price = 1.00;

        } else if (product.name.equals("Water")) {
            product.price = 0.80;
        } else if (product.name.equals("Coffee")) {
            product.price = 1.50;
        }
    }
}