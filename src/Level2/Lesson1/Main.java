package Level2.Lesson1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Runnable[] passing = new Runnable[10];
        Competition[] competitions = new Competition[10];

        for (int i = 0; i < competitions.length; i++) {
            int randRange = getRandRange(1, 2);
            if (randRange > 1) {
                competitions[i] = new Wall(getRandRange(1, 3));
            } else {
                competitions[i] = new Treadmill(getRandRange(20, 30));
            }
        }


        for (int i = 0; i < passing.length; i++) {
            int randRange = getRandRange(1, 3);
            if (randRange == 1) {
                passing[i] = new Human(getRandRange(1, 3), getRandRange(20, 30));
            } else if (randRange == 2) {
                passing[i] = new Cat(getRandRange(1, 3), getRandRange(20, 30));
            } else if (randRange == 3) {
                passing[i] = new Robot(getRandRange(1, 3), getRandRange(20, 30));
            }
        }

        for (Competition competition : competitions) {
            for (int i = 0; i < passing.length; i++) {
                if (passing[i] != null && competition.act(passing[i])) {
                    System.out.println("Pass");
                } else {
                    passing[i] = null;
                }
            }
        }
        System.out.println("Победители:");
        for (Runnable runnable : passing) {
            System.out.println(runnable);
        }

    }

    public static int getRandRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
