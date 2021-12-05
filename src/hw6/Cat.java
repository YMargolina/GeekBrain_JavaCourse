package hw6;

public class Cat extends Animal {
    static int countCats;

    public Cat(String catname) {
        super(catname);
        countCats = countCats + 1;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " не в состоянии пробежать " + distance + "м.");
        } else {
            System.out.println(name + " пробежал " + distance + "м.");
        }
    }

    public void swim(int distance) {
        if (distance > 0) {
            System.out.println(name + " не умеет плавать!");
        } else {
            System.out.println(name + " проплыл " + distance);
        }
    }
}
