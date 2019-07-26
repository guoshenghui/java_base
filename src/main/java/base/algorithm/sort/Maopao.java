package base.algorithm.sort;

import java.util.Arrays;

public class Maopao {
    public static void main(String[] args) {
        int[] arr = {11, 21, 23, 41, 1, 3, 4, 5, 7, 33, 45, 343, 3432, 2, 89};
        for (int i = 0; i < arr.length - 1; i++) {
            int temp;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
