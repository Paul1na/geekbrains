package Lesson6;

public class Cat extends Animal {
    final int RUN_MAX = 200;

    @Override
    public void run(int distance) {
        if (distance > RUN_MAX)
            System.out.println(name + " не может пробежать " +distance+ " метров");
        else System.out.println(name + " может пробежать " +distance+ " метров");
    }

    @Override
    public void swim(int distance) {

        System.out.println("Кошка не умеет плавать");

    }
    public Cat(String name){
        super(name);
    }
}



