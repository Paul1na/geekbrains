package Level2.Lesson1;

public class Cat implements Runnable {
    public int jumplimit;
    public int runlimit;

    public Cat(int jimplimit, int runlimit) {
        this.jumplimit = jimplimit;
        this.runlimit = runlimit;
    }

    @Override
    public int run() {
        System.out.println("Кошка умеет бегать");
        return runlimit;
    }

    @Override
    public int jump() {
        System.out.println("Кошка умеет прыгать");
        return jumplimit;
    }
}
