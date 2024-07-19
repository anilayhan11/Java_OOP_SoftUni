package U4_Interfaces.L1_Lab.car_extended;

public interface Rentable extends Car  {
    int getMinRentDay();

    double getPricePerDay();

    default double getPriceForDays(int numberOfDays) {
        if (numberOfDays < getMinRentDay()) {
            String message = String.format("Cannot rent %s for less than %d days",
                    getModel(), getMinRentDay());
            throw new IllegalArgumentException(message);
        }

        return numberOfDays * getPricePerDay();
    }
}
