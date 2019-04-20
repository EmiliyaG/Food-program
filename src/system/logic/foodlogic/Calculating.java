package system.logic.foodlogic;

import system.data.fooddata.Product;

import javax.swing.*;

import system.ui.fastfood.CalcPriceScreen;
import system.ui.fastfood.OrderScreen;
import system.ui.fastfood.ProductsScreen;

public class Calculating {
    private Product product;
    public double allPriceOfDrinks;
    private OrderScreen orderScreen;
    private ProductsScreen productsScreen;
    private CalcPriceScreen calcPriceScreen;
    public double priceOfHomeDelivery = 3.00;
    public double allPriceOfFood;
    private double allPrice;
    public String allPriceAsString;
    public String numberAsString;

    public void setProductsScreen(ProductsScreen productsScreen) {
        this.productsScreen = productsScreen;
    }

    public void setCalcPriceScreen(CalcPriceScreen calcPriceScreen) {
        this.calcPriceScreen = calcPriceScreen;
    }

    public void calcPriceOfDrinks() {

        double priceOfCola = 1.00;
        double cola = Double.parseDouble(productsScreen.priceCola.getText());
        double allPriceCola = cola * priceOfCola;

        double priceOfWater = 1.00;
        double water = Double.parseDouble(productsScreen.priceWater.getText());
        double allPriceWater = water * priceOfWater;

        double priceOfCoffee = 1.50;
        double coffee = Double.parseDouble(productsScreen.priceCoffee.getText());
        double allPriceCoffee = coffee * priceOfCoffee;

        allPriceOfDrinks = allPriceCola + allPriceWater + allPriceCoffee;
    }

    public void calcPriceOfFoods() {
        double priceOfBurger = 1.00;
        double burger = Double.parseDouble(productsScreen.priceBurger.getText());
        double allPriceBurger = burger * priceOfBurger;

        double priceOfPizza = 1.00;
        double pizza = Double.parseDouble(productsScreen.pricePizza.getText());
        double allPricePizza = pizza * priceOfPizza;

        double priceOfHotDog = 1.00;
        double hotDog = Double.parseDouble(productsScreen.priceHotdog.getText());
        double allPriceHotDog = hotDog * priceOfHotDog;

        double priceOfFries = 1.00;
        double fries = Double.parseDouble(productsScreen.priceFries.getText());
        double allPriceFries = fries * priceOfFries;

        allPriceOfFood = allPriceBurger + allPricePizza + allPriceHotDog + allPriceFries;
        String foodPriceAsString = Double.toString(allPriceOfFood);
        calcPriceScreen.mealsPrice.setText(foodPriceAsString);
    }

    public void calcHomeDelivery() {
        if (calcPriceScreen.homeDelivery.isSelected()) {
            priceOfHomeDelivery = 3.00;
        } else {
            priceOfHomeDelivery = 0;
        }
        numberAsString = Double.toString(priceOfHomeDelivery);
        calcPriceScreen.deliveryPrice.setText(numberAsString);
    }

    public void calcAllPrice() {
        allPrice = allPriceOfDrinks + allPriceOfFood + priceOfHomeDelivery;
        allPriceAsString = Double.toString(allPrice);
    }
}