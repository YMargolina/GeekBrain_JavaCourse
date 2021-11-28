package hw_3;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] arg) {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

        int[] n = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < n.length; i++) {
            if (n[i] < 6) {
                n[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(n));

        int[][] twoarr = ArrToFill(9);
        for (int i = 0; i < twoarr.length; i++) {
            System.out.println(Arrays.toString(twoarr[i]));
        }

        System.out.println(Arrays.toString(MakeArray(5, 42)));
    }

    public static int[][] ArrToFill(int n){
        int [][] twoarr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (i == j || i + j == n - 1) {
                    twoarr[i][j] = 1;
                }
            }

        }
        return twoarr;
    }

    public static int[] MakeArray(int len, int initialValue) {
        int[] nn = new int[len];
        for (int i = 0; i < nn.length; i++) {
            nn[i] = initialValue;
        }
        return nn;
    }

}
