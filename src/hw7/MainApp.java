package hw7;

public class MainApp {

    public static void main(String[] srt) {
        Cat[] cat = new Cat[]{new Cat("Mуся", 15), new Cat("Феликс Эдмундович", 35), new Cat("Федя", 70)};
        Plate plate = new Plate(110);
        //System.out.println("Cat " );
        for (int i = 0; i < cat.length; i++) {
            cat[i].eatFood(plate);
            cat[i].printHunger();
        }
        plate.foodFree();

    }

}
