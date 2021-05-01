package Level2.Lesson1;

public class Robot implements Runnable {
    public int jumplimit;
    public int runlimit;

    public Robot(int jimplimit, int runlimit) {
        this.jumplimit = jimplimit;
        this.runlimit = runlimit;
    }

    @Override
    public int run() {
        System.out.println("Робот умеет бегать");
        return runlimit;
    }

    @Override
    public int jump() {
        System.out.println("Робот умеет прыгать");
        return jumplimit;
    }
}
