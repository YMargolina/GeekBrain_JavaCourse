package hw6;

public class Dog extends Animal {
    static int countDogs;

    public Dog(String dogname) {
        super(dogname);
        countDogs = countDogs + 1;
    }

    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " не в состоянии пробежать " + distance + "м.");
        } else {
            System.out.println(name + " пробежал " + distance + "м.");
        }
    }

    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не в состоянии проплыть " + distance + "м.");
        } else {
            System.out.println(name + " проплыл " + distance + "м.");
        }
    }

}
