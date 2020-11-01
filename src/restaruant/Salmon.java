package restaruant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    final private double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, 22);
    }
}
