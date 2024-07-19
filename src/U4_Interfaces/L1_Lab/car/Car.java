package U4_Interfaces.L1_Lab.car;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();

    String getColor();

    int getHorsePower();

    String countryProduced();
}
