package hw1;

public class MainApp {
     public static void printWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int i, int j) {

        int sum = i + j;
        System.out.println(sum>=0 ? "Сумма положительная" :  "Сумма отрицательная");
    }

    public static void printColor(int i) {
         if (i <= 0) {
             System.out.println("Красный");
         } else if (i <= 100 ) {
             System.out.println("Желтый");
         } else {
             System.out.println("Зеленый");
         }
    }

    public static void compareNumbers(int i, int j) {
         if (i>=j) {
             System.out.println(i + " " + ">=" + " " + j);
         } else {
             System.out.println(i + " " + "<" + " " + j);
         }

    }

    public static void main(String[] arg) {
         printWords();
         int a =7;
         int b = 20;
         checkSumSign(a,b);

         int value = 57;
         printColor(value);

         compareNumbers(a,b);
    }
    
}
