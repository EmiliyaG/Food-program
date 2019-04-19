package system.ui;

import foodapp.*;
import system.data.ProductsRepository;
import system.logic.OrderScreenLogic;

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

public class MenuScreen {
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
    public OrderScreen orderScreen;

    public void setScreenLisener(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    public void createLabels() {
        createLblMenu();
        createLblCoffee();
        createLblCola();
        createLblWater();
        createLblBurger();
        createLblPizza();
        createLblHotDog();
        createLblFries();
    }

    public void createLblMenu() {
        lblMenu = new JLabel("Menu");
        lblMenu.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblMenu.setBounds(10, 11, 133, 25);
        orderScreen.menuPanel.add(lblMenu);
    }

    public void createLblBurger() {
        lblBurger = new JLabel("Cheese burger:");
        lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblBurger.setBounds(10, 47, 107, 25);
        orderScreen.menuPanel.add(lblBurger);

        burger = new JLabel("3.00");
        burger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        burger.setBounds(145, 47, 114, 25);
        orderScreen.menuPanel.add(burger);
    }

    public void createLblPizza() {
        lblPizza = new JLabel("Pizza:");
        lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPizza.setBounds(10, 83, 67, 25);
        orderScreen.menuPanel.add(lblPizza);

        pizza = new JLabel("2.00");
        pizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pizza.setBounds(145, 83, 114, 25);
        orderScreen.menuPanel.add(pizza);
    }

    public void createLblHotDog() {
        lblHotDog = new JLabel("Hot dog:");
        lblHotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHotDog.setBounds(10, 119, 114, 25);
        orderScreen.menuPanel.add(lblHotDog);

        hotDog = new JLabel("2.50");
        hotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        hotDog.setBounds(145, 119, 114, 25);
        orderScreen.menuPanel.add(hotDog);
    }

    public void createLblFries() {
        lblFrenchFries = new JLabel("French fries:");
        lblFrenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblFrenchFries.setBounds(10, 155, 114, 25);
        orderScreen.menuPanel.add(lblFrenchFries);

        frenchFries = new JLabel("3.50");
        frenchFries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        frenchFries.setBounds(145, 155, 114, 25);
        orderScreen.menuPanel.add(frenchFries);
    }

    public void createLblWater() {
        lblWater = new JLabel("Water:");
        lblWater.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWater.setBounds(10, 191, 114, 25);
        orderScreen.menuPanel.add(lblWater);

        water = new JLabel("0.50");
        water.setFont(new Font("Tahoma", Font.PLAIN, 14));
        water.setBounds(145, 191, 114, 25);
        orderScreen.menuPanel.add(water);
    }

    public void createLblCola() {
        lblCola = new JLabel("Cola:");
        lblCola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCola.setBounds(10, 227, 114, 25);
        orderScreen.menuPanel.add(lblCola);

        cola = new JLabel("1.00");
        cola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cola.setBounds(145, 227, 114, 25);
        orderScreen.menuPanel.add(cola);
    }

    public void createLblCoffee() {
        lblCoffee = new JLabel("Coffee:");
        lblCoffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCoffee.setBounds(10, 263, 114, 25);
        orderScreen.menuPanel.add(lblCoffee);

        coffee = new JLabel("1.50");
        coffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coffee.setBounds(145, 263, 114, 25);
        orderScreen.menuPanel.add(coffee);
    }

}

