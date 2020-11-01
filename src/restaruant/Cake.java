package restaruant;

import java.math.BigDecimal;

public class Cake extends Desert{
    final private double CAKE_GRAMS = 250;
    final private double CAKE_CALORIES = 1000;
    final private BigDecimal CAKE_PRICE = new BigDecimal(5);

    public Cake(String name) {
        super(name, new BigDecimal("5"), 250, 1000);
    }
}
