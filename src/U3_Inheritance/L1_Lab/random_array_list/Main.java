package U3_Inheritance.L1_Lab.random_array_list;

public class Main {

    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        randomArrayList.add(5);
        randomArrayList.add(6);
        randomArrayList.add(7);
        randomArrayList.add(8);
        randomArrayList.add(9);

        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
        System.out.println(randomArrayList.getRandomElement());
    }
}
