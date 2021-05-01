package Level2.Lesson1;

public class Treadmill implements Competition {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean act(Runnable participant) {
        if (participant.run() >= length) {
            System.out.println("Игрок успешно пробежал");
            return true;
        }
        System.out.println("Игрок не смог пробежать");
        return false;
    }
}
