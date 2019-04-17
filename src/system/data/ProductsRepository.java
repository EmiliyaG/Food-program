package system.data;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepository {
    private List<Product> foods;
    private List<Product> belarages;

    public ProductsRepository() {
        foods = new ArrayList<>();
        foods.add(new Product("Burger", 3.00, "foods"));
        foods.add(new Product("Pizza", 1.20, "foods"));
        foods.add(new Product("Hot dog", 2.00, "foods"));
        foods.add(new Product("French fries", 3.50, "foods"));

        belarages = new ArrayList<>();
        belarages.add(new Product("Water", 0.80, "bevarages"));
        belarages.add(new Product("Cola", 1.00, "bevarages"));
        belarages.add(new Product("Coffee", 1.50, "bevarages"));
        belarages.add(new Product("Ice tea", 1.80,"bevarages"));

    }

    public List<Product> getFoods() {
        return foods;
    }

    public List<Product> getBelarages() {
        return belarages;
    }
}

