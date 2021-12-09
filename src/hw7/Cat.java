package hw7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    //private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eatFood(Plate p) {
        if (p.removeFood(appetite)) {
            //System.out.println(name + " покушал(а)");
            fullness = true;
        }
    }

    public void printHunger() {
        if (fullness) {
            System.out.println(name + " сытый(ая)");
        } else {
            System.out.println(name + " голодный(ая)");
        }
    }

}

