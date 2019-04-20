package system.ui.fastfood;

import system.ui.fastfood.OrderScreen;

import javax.swing.*;
import java.awt.*;

public class MenuDesign {
    private OrderScreen orderScreen;

    public void setOrderScreen(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    public void createLabels() {
        createLblMenuu();
        createLblCoffee();
        createLblCola();
        createLblWater();
        createLblBurger();
        createLblPizza();
        createLblHotDog();
        createLblFries();
    }

    private void createLblMenuu() {
        JLabel lblMenu = new JLabel("Menu");
        lblMenu.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblMenu.setBounds(563, 88, 133, 25);
        orderScreen.backgroundPanel.add(lblMenu);
    }

    private void createLblBurger() {
        JLabel lblBurger = new JLabel("Cheese burger:");
        lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBurger.setBounds(563, 124, 107, 25);
        orderScreen.backgroundPanel.add(lblBurger);

        JLabel burger = new JLabel("3.00");
        burger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        burger.setBounds(698, 124, 114, 25);
        orderScreen.backgroundPanel.add(burger);
    }

    private void createLblPizza() {
        JLabel lblPizza = new JLabel("Pizza:");
        lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPizza.setBounds(563, 160, 67, 25);
        orderScreen.backgroundPanel.add(lblPizza);

        JLabel pizza = new JLabel("2.00");
        pizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pizza.setBounds(698, 160, 114, 25);
        orderScreen.backgroundPanel.add(pizza);
    }

    private void createLblHotDog() {
        JLabel lblHotDog = new JLabel("Hot dog:");
        lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHotDog.setBounds(563, 196, 114, 25);
        orderScreen.backgroundPanel.add(lblHotDog);

        JLabel hotDog = new JLabel("2.50");
        hotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        hotDog.setBounds(698, 196, 114, 25);
        orderScreen.backgroundPanel.add(hotDog);
    }

    private void createLblFries() {
        JLabel lblFrenchFries = new JLabel("French fries:");
        lblFrenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblFrenchFries.setBounds(563, 232, 114, 25);
        orderScreen.backgroundPanel.add(lblFrenchFries);

        JLabel frenchFries = new JLabel("3.50");
        frenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frenchFries.setBounds(698, 232, 114, 25);
        orderScreen.backgroundPanel.add(frenchFries);
    }

    private void createLblWater() {
        JLabel lblWater = new JLabel("Water:");
        lblWater.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWater.setBounds(563, 268, 114, 25);
        orderScreen.backgroundPanel.add(lblWater);

        JLabel water = new JLabel("1.00");
        water.setFont(new Font("Tahoma", Font.PLAIN, 14));
        water.setBounds(698, 268, 114, 25);
        orderScreen.backgroundPanel.add(water);
    }

    private void createLblCola() {
        JLabel lblCola = new JLabel("Cola:");
        lblCola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCola.setBounds(563, 304, 114, 25);
        orderScreen.backgroundPanel.add(lblCola);

        JLabel cola = new JLabel("1.00");
        cola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cola.setBounds(698, 304, 114, 25);
        orderScreen.backgroundPanel.add(cola);
    }

    private void createLblCoffee() {
        JLabel lblCoffee = new JLabel("Coffee:");
        lblCoffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCoffee.setBounds(563, 340, 114, 25);
        orderScreen.backgroundPanel.add(lblCoffee);

        JLabel coffee = new JLabel("1.50");
        coffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coffee.setBounds(698, 340, 114, 25);
        orderScreen.backgroundPanel.add(coffee);
    }
}
