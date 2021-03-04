package Lesson2;

import java.util.Arrays;

public class Iteration {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void task2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;

        }
    }

    private static void task4() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i+j==matrix.length-1)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 0;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

    }

}


