package U4_Interfaces.L1_Lab.car_extended;

public class Seat extends CarImpl implements Sellable {
    private double price;

    public Seat(String model, String color, int horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);

        this.price = price;
    }


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s sells for %f",
            super.toString(), getModel(), getPrice());
    }
}
