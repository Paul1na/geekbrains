package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        task1();
    }

static Scanner scanner = new Scanner(System.in);

    public static void task1() {
        int answer = 0;
        do {
            game();
            System.out.println("Повторить игру еще раз?");
            answer = scanner.nextInt();
        } while (answer == 1);
    }
    public static void game(){
        Random random = new Random();
        int i2 = random.nextInt(10);

        for (int i = 0; i < 3 ; i++) {
            int i1 = scanner.nextInt();
            if (i2 > i1){
                System.out.println("Это число больше");
            }
            else if (i2<i1){
                System.out.println("Это число меньше");
            }
            else {
                System.out.println("Вы победили");
                break;
            }
            if (i == 2)
            System.out.println("Вы проиграли");
        }
    }
}
