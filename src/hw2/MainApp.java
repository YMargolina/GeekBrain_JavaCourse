package hw2;

public class MainApp {

    //1
    public static boolean checkSum(int a, int b) {
        return 10 <= a + b && a + b <= 20;
    }

    //2
    public static void checkSign (int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        }
         else System.out.println("The number is negative");
    }

    //3
    public static boolean checkSignBoolean(int a) {
        return 0 <= a;
    }

    //4
    public static void printNtimes(String s, int n) {
        for (int i=0; i < n; i++) {
            System.out.println(s);
        }
    }

    //5
    public static boolean isYearLeap(int i) {
        return  ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) ;
    }

    /** public static void main(String[] args) {
        System.out.println(checkSum(0, 3));
        checkSign(-1000000);
        System.out.println(checkSignBoolean(50));
        System.out.println(checkSignBoolean(-50));
        printNtimes("Bravo", 3);
        System.out.println(isYearLeap(2020));
        System.out.println(isYearLeap(2021));
        System.out.println(isYearLeap(100));
        System.out.println(isYearLeap(400));
    }
     */

}

