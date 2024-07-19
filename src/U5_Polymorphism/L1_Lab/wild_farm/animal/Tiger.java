package U5_Polymorphism.L1_Lab.wild_farm.animal;

import U5_Polymorphism.L1_Lab.wild_farm.food.Food;
import U5_Polymorphism.L1_Lab.wild_farm.food.Meat;

public class Tiger extends Feline {
    public Tiger(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Tiger);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Meat;
    }
}
