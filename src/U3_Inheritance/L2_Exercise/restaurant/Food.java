package U3_Inheritance.L2_Exercise.restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;


    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
