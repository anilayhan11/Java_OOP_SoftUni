package U5_Polymorphism.L1_Lab.animals;

public class Cat extends Animal {
    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + "\nMEEOW";
    }

}
