package Lesson6;

public class Dog extends Animal {


    final int RUN_MAX = 500;
    final int SWIM_MAX = 10;

    @Override
    public void run(int distance) {
        if (distance > RUN_MAX)
            System.out.println(name + " не может пробежать " +distance+ " метров");
        else System.out.println(name + " может пробежать " +distance+ " метров");
    }

    @Override
    public void swim(int distance) {
        if (distance > RUN_MAX)
            System.out.println(name + " не может проплыть " +distance+ " метров");
        else System.out.println(name + " может проплыть " +distance+ " метров");

    }
    public Dog(String name){
        super(name);
    }
}

