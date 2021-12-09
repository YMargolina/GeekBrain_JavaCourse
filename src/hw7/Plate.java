package hw7;

public class Plate {
    private int food = 100;
    private final int FOOD_SIZE = 5;

    public Plate(int size) {
        this.food = size;
    }

    public boolean isFoodAvailable(int i) {
        return this.food - i > 0;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public boolean removeFood(int amount) {
        if (isFoodAvailable(amount)) {
            food -= amount;
            return true;
        } else {
            System.out.println("Добавьте еды в миску!");
            return false;
        }
    }

    public void foodFree() {
        System.out.println("Food amount: " + food);
    }

}


