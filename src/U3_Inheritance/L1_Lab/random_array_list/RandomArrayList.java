package U3_Inheritance.L1_Lab.random_array_list;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private final Random random;

    public RandomArrayList() {
        super();

        this.random = new Random();
    }

    public T getRandomElement() {
        int index = random.nextInt(super.size());

        T result = super.get(index);
        super.remove(index);

        return result;
    }
}
