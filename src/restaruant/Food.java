package restaruant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;

    public Food(String name, BigDecimal price, double grimes) {
        super(name, price);
        this.grams = grimes;
    }

    public double getGrams() {
        return this.grams;
    }
}
