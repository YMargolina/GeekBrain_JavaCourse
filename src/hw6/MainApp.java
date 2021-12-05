package hw6;

public class MainApp {
    public static void main(String[] arg) {
        Dog dog = new Dog("Бобик");
        //Dog anotherdog = new Dog("Тузик");
        dog.run(150);
        dog.swim(100);

        Cat cat = new Cat("Васёк");
        cat.run(15);
        cat.swim(7);
        System.out.println("Количество животных:" + " " + Animal.countAnimal);
        System.out.println("Количество котов:" + " " + Cat.countCats);
        System.out.println("Количество собак:" + " " + Dog.countDogs);
    }
}
