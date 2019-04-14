package foodapp;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Menu extends Design {
    public JLabel burger;
    public JLabel pizza;
    public JLabel hotDog;
    public JLabel frenchFries;
    public JLabel water;
    public JLabel cola;
    public JLabel coffee;
    public JLabel lblMenu;
    public JLabel lblBurger;
    public JLabel lblPizza;
    public JLabel lblHotDog;
    public JLabel lblFrenchFries;
    public JLabel lblWater;
    public JLabel lblCola;
    public JLabel lblCoffee;

    public void createLabels() {
        menuPanel = new JPanel();
        menuPanel.setBounds(543, 78, 269, 322);
        menuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        menuPanel.setBackground(new Color(220, 220, 220));
        backgroundPanel.add(menuPanel);
        menuPanel.setLayout(null);

        lblMenu = new JLabel("Menu");
        lblMenu.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblMenu.setBounds(10, 11, 133, 25);
        menuPanel.add(lblMenu);

        lblBurger = new JLabel("Cheese burger:");
        lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBurger.setBounds(10, 47, 107, 25);
        menuPanel.add(lblBurger);

        lblPizza = new JLabel("Pizza:");
        lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPizza.setBounds(10, 83, 67, 25);
        menuPanel.add(lblPizza);

        lblHotDog = new JLabel("Hot dog:");
        lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHotDog.setBounds(10, 119, 114, 25);
        menuPanel.add(lblHotDog);

        lblFrenchFries = new JLabel("French fries:");
        lblFrenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblFrenchFries.setBounds(10, 155, 114, 25);
        menuPanel.add(lblFrenchFries);

        lblWater = new JLabel("Water:");
        lblWater.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWater.setBounds(10, 191, 114, 25);
        menuPanel.add(lblWater);

        lblCola = new JLabel("Cola:");
        lblCola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCola.setBounds(10, 227, 114, 25);
        menuPanel.add(lblCola);

        lblCoffee = new JLabel("Coffee:");
        lblCoffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCoffee.setBounds(10, 263, 114, 25);
        menuPanel.add(lblCoffee);

        burger = new JLabel("3.00");
        burger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        burger.setBounds(145, 47, 114, 25);
        menuPanel.add(burger);

        pizza = new JLabel("2.00");
        pizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pizza.setBounds(145, 83, 114, 25);
        menuPanel.add(pizza);

        hotDog = new JLabel("2.50");
        hotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        hotDog.setBounds(145, 119, 114, 25);
        menuPanel.add(hotDog);

        frenchFries = new JLabel("3.50");
        frenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frenchFries.setBounds(145, 155, 114, 25);
        menuPanel.add(frenchFries);

        water = new JLabel("0.50");
        water.setFont(new Font("Tahoma", Font.PLAIN, 14));
        water.setBounds(145, 191, 114, 25);
        menuPanel.add(water);

        cola = new JLabel("1.00");
        cola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cola.setBounds(145, 227, 114, 25);
        menuPanel.add(cola);

        coffee = new JLabel("1.50");
        coffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coffee.setBounds(145, 263, 114, 25);
        menuPanel.add(coffee);
    }


}