package U3_Inheritance.L2_Exercise.animals;

public class Frog extends Animal{
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound(){
        return "Ribbit";
    }
}

