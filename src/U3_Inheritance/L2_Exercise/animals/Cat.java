package U3_Inheritance.L2_Exercise.animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Meow meow";
    }
}
