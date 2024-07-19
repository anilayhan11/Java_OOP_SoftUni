package U5_Polymorphism.L1_Lab.wild_farm.animal;

import U5_Polymorphism.L1_Lab.wild_farm.food.Food;
import U5_Polymorphism.L1_Lab.wild_farm.food.Vegetable;

public class Mouse extends Mammal {
    public Mouse(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Mouse);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return food instanceof Vegetable;
    }
}
