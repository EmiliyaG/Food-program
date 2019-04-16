package system.data;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepossitory {
    private List <Product> foods;
    private List <Product> belarages;

    public ProductsRepossitory() {
        foods = new ArrayList<>();
        foods.add(new Product("burger", "3.00","foods"));

    }

    public List<Product> getFoods() {
        return foods;
    }

    public List<Product> getBelarages() {
        return belarages;
    }
}
