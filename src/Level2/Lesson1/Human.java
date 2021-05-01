package Level2.Lesson1;

public class Human implements Runnable {
    public int jumplimit;
    public int runlimit;

    public Human(int jimplimit, int runlimit) {
        this.jumplimit = jimplimit;
        this.runlimit = runlimit;
    }

    @Override
    public int run() {
        System.out.println("Человек умеет бегать");
        return runlimit;
    }

    @Override
    public int jump() {
        System.out.println("Человек умеет прыгать");
        return jumplimit;
    }
}
