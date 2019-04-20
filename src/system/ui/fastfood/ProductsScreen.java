package system.ui.fastfood;
import javax.swing.*;
import java.awt.*;

public class ProductsScreen {
    private OrderScreen orderScreen;
    public JTextField priceWater, priceCola, priceCoffee;
    public JTextField priceBurger, priceHotdog, priceFries, pricePizza;

    public void setOrderScreen(OrderScreen orderScreen) {
        this.orderScreen = orderScreen;
    }

    public void callAllMethods() {
        createLblQuantity();
        createLblFood();
        makeBurderLabel();
        makeFriesLabel();
        makeHotDogLabel();
        makePizzaLabel();
        createTextFieldBurger();
        createTextFieldFries();
        createTextFieldHotDog();
        createTextFieldPizza();

        createLblBevarages();
        createWaterLabel();
        createCoffeeLabel();
        createColaLabel();
        createTextFieldWater();
        createTextFieldCola();
        createTextFieldCoffee();
    }

    private void createLblQuantity() {
        JLabel quantity = new JLabel("Quantity:");
        quantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
        quantity.setBounds(407, 88, 107, 25);
        orderScreen.backgroundPanel.add(quantity);
    }

    //foods
    private void createLblFood() {
        JLabel lblFood = new JLabel("Food");
        lblFood.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblFood.setBounds(290, 88, 67, 25);
        orderScreen.backgroundPanel.add(lblFood);
    }

    private void makeBurderLabel() {
        JLabel burger = new JLabel("Cheese burger:");
        burger.setFont(new Font("Tahoma", Font.PLAIN, 14));
        burger.setBounds(290, 124, 107, 25);
        orderScreen.backgroundPanel.add(burger);

    }

    private void makeFriesLabel() {
        JLabel fries = new JLabel("French fries:");
        fries.setFont(new Font("Tahoma", Font.PLAIN, 14));
        fries.setBounds(290, 232, 114, 25);
        orderScreen.backgroundPanel.add(fries);
    }

    private void makeHotDogLabel() {
        JLabel hotDog = new JLabel("Hot dog:");
        hotDog.setFont(new Font("Tahoma", Font.PLAIN, 14));
        hotDog.setBounds(290, 196, 114, 25);
        orderScreen.backgroundPanel.add(hotDog);
    }

    private void makePizzaLabel() {
        JLabel pizza = new JLabel("Pizza:");
        pizza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        pizza.setBounds(290, 160, 67, 25);
        orderScreen.backgroundPanel.add(pizza);
    }

    private void createTextFieldBurger() {
        priceBurger = new JTextField();
        priceBurger.setColumns(10);
        priceBurger.setBounds(407, 128, 102, 20);
        orderScreen.backgroundPanel.add(priceBurger);
    }

    private void createTextFieldHotDog() {
        priceHotdog = new JTextField();
        priceHotdog.setColumns(10);
        priceHotdog.setBounds(407, 200, 102, 20);
        orderScreen.backgroundPanel.add(priceHotdog);
    }

    private void createTextFieldFries() {
        priceFries = new JTextField();
        priceFries.setColumns(10);
        priceFries.setBounds(407, 237, 102, 20);
        orderScreen.backgroundPanel.add(priceFries);
    }

    private void createTextFieldPizza() {
        pricePizza = new JTextField();
        pricePizza.setColumns(10);
        pricePizza.setBounds(407, 164, 102, 20);
        orderScreen.backgroundPanel.add(pricePizza);

    }

    //beveragers
    private void createLblBevarages() {
        JLabel lblBeverages = new JLabel("Beverages");
        lblBeverages.setFont(new Font("Tahoma", Font.ITALIC, 20));
        lblBeverages.setBounds(290, 268, 133, 25);
        orderScreen.backgroundPanel.add(lblBeverages);
    }

    private void createWaterLabel() {
        JLabel water = new JLabel("Water:");
        water.setFont(new Font("Tahoma", Font.PLAIN, 14));
        water.setBounds(290, 306, 114, 25);
        orderScreen.backgroundPanel.add(water);
    }

    private void createColaLabel() {
        JLabel cola = new JLabel("Cola:");
        cola.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cola.setBounds(290, 334, 114, 25);
        orderScreen.backgroundPanel.add(cola);
    }

    private void createCoffeeLabel() {
        JLabel coffee = new JLabel("Coffee:");
        coffee.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coffee.setBounds(290, 360, 114, 25);
        orderScreen.backgroundPanel.add(coffee);
    }

    private void createTextFieldWater() {
        priceWater = new JTextField();
        priceWater.setColumns(10);
        priceWater.setBounds(407, 303, 102, 20);
        orderScreen.backgroundPanel.add(priceWater);
    }

    private void createTextFieldCola() {
        priceCola = new JTextField();
        priceCola.setColumns(10);
        priceCola.setBounds(407, 334, 102, 20);
        orderScreen.backgroundPanel.add(priceCola);
    }

    private void createTextFieldCoffee() {
        priceCoffee = new JTextField();
        priceCoffee.setText("");
        priceCoffee.setColumns(10);
        priceCoffee.setBounds(407, 364, 102, 20);
        orderScreen.backgroundPanel.add(priceCoffee);
    }
}
