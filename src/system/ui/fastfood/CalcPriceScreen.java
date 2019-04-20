package system.ui.fastfood;

import system.logic.foodlogic.Calculating;
import system.ui.fastfood.OrderScreen;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class CalcPriceScreen {
    private OrderScreen orderScreen;
    public JLabel totalTaxPrice;
    public JCheckBox homeDelivery;
    public JLabel deliveryPrice, drinksPrice, mealsPrice;
private Calculating calculating;
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

    private void homeDelivery() {
        homeDelivery = new JCheckBox("Home delivery");
        homeDelivery.setBounds(20, 409, 97, 23);
        orderScreen.backgroundPanel.add(homeDelivery);
    }

    private void makeDeliveryPrice() {
        deliveryPrice = new JLabel("0.0");
        deliveryPrice.setForeground(Color.BLACK);
        deliveryPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        deliveryPrice.setBounds(563, 413, 66, 25);
        orderScreen.backgroundPanel.add(deliveryPrice);
    }

    private void makeDrinksPrice() {
        drinksPrice = new JLabel("0.0");
        drinksPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        drinksPrice.setBounds(563, 449, 89, 25);
        orderScreen.backgroundPanel.add(drinksPrice);
    }

    private void makeMealsPrice() {
        mealsPrice = new JLabel("0.0");
        mealsPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        mealsPrice.setBounds(563, 485, 89, 25);
        orderScreen.backgroundPanel.add(mealsPrice);
    }

    private void makeCostOfDelivery() {
        JLabel costOfDelivery = new JLabel("Cost of delivery:");
        costOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfDelivery.setBounds(446, 485, 107, 25);
        orderScreen.backgroundPanel.add(costOfDelivery);
    }

    private void makeLblCostOfDrinks() {
        JLabel costOfDrinks = new JLabel("Cost of drinks:");
        costOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfDrinks.setBounds(446, 449, 107, 25);
        orderScreen.backgroundPanel.add(costOfDrinks);
    }

    private void makeLblCostOfMeal() {
        JLabel costOfMeal = new JLabel("Cost of meal:");
        costOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 14));
        costOfMeal.setBounds(446, 413, 107, 25);
        orderScreen.backgroundPanel.add(costOfMeal);
    }


    private void makeTotalTax() {
        JLabel totalTax = new JLabel("Total tax:");
        totalTax.setFont(new Font("Tahoma", Font.PLAIN, 14));
        totalTax.setBounds(637, 413, 78, 25);
        orderScreen.backgroundPanel.add(totalTax);

    }

    private void makeTotalTaxPrice() {
        totalTaxPrice = new JLabel("0.0");
        totalTaxPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        totalTaxPrice.setBounds(725, 413, 77, 25);
        orderScreen.backgroundPanel.add(totalTaxPrice);
    }
}

