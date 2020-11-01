package restaruant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    final private double COFFEE_MILLILITERS = 50;
    final private BigDecimal COFFEE_PRICE = new BigDecimal("3.50");
    private double caffeine;

    public Coffee(String name, BigDecimal price, double millilitres) {
        super(name, price, millilitres);
    }

    public double getCaffeine() {
        return this.caffeine;
    }
}
