package hw6;

public class Animal {
    String name;
    static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal = countAnimal + 1;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance);
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance);
    }

}
