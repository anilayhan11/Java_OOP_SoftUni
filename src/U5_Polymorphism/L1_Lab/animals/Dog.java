package U5_Polymorphism.L1_Lab.animals;

public class Dog extends Animal {
    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s\nDJAAF", super.explainSelf());
    }
}
