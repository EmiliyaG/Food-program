package system.ui;

import system.logic.DrinksCalculating;
import system.logic.OrderScreenLogic;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.*;

public class CalcPriceScreen {
    private OrderScreen orderScreen;

    public void setOrderScreen(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    public void allCalculations() {
        makeLblCostOfMeal();
        makeLblCostOfDrinks();
        makeCostOfDelivery();
        makeMealsPrice();
        makeDrinksPrice();
        makeDeliveryPrice();
        makeTotalTax();
        makeTotalTaxPrice();
        homeDelivery();
    }

    public void homeDelivery() {
        JCheckBox homeDelivery = new JCheckBox("Home delivery");
        homeDelivery.setBounds(20, 409, 97, 23);
        orderScreen.backgroundPanel.add(homeDelivery);
    }

    public void makeDeliveryPrice() {
        JLabel deliveryPrice = new JLabel("0.0");
        deliveryPrice.setForeground(Color.BLACK);
        deliveryPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        deliveryPrice.setBounds(563, 413, 66, 25);
        orderScreen.backgroundPanel.add(deliveryPrice);
    }

    public void makeDrinksPrice() {
        JLabel drinksPrice = new JLabel("0.0");
        drinksPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        drinksPrice.setBounds(563, 449, 89, 25);
        orderScreen.backgroundPanel.add(drinksPrice);
    }

    public void makeMealsPrice() {
        JLabel mealsPrice = new JLabel("0.0");
        mealsPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mealsPrice.setBounds(563, 485, 89, 25);
        orderScreen.backgroundPanel.add(mealsPrice);
    }

    public void makeCostOfDelivery() {
        JLabel costOfDelivery = new JLabel("Cost of delivery:");
        costOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfDelivery.setBounds(446, 485, 107, 25);
        orderScreen.backgroundPanel.add(costOfDelivery);
    }

    public void makeLblCostOfDrinks() {
        JLabel costOfDrinks = new JLabel("Cost of drinks:");
        costOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfDrinks.setBounds(446, 449, 107, 25);
        orderScreen.backgroundPanel.add(costOfDrinks);
    }

    public void makeLblCostOfMeal() {
        JLabel costOfMeal = new JLabel("Cost of meal:");
        costOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfMeal.setBounds(446, 413, 107, 25);
        orderScreen.backgroundPanel.add(costOfMeal);
    }


    public void makeTotalTax() {
        JLabel totalTax = new JLabel("Total tax:");
        totalTax.setFont(new Font("Tahoma", Font.PLAIN, 14));
        totalTax.setBounds(637, 413, 78, 25);
        orderScreen.backgroundPanel.add(totalTax);
    }

    public void makeTotalTaxPrice() {
        JLabel totalTaxPrice = new JLabel("0.0");
        totalTaxPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        totalTaxPrice.setBounds(725, 413, 77, 25);
        orderScreen.backgroundPanel.add(totalTaxPrice);
    }
}

