package Level2.Lesson1;

public class Wall implements Competition {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean act(Runnable player) {
        if (player.run() >= height) {
            System.out.println("Игрок успешно перепрыгнул");
            return true;
        }
        System.out.println("Игрок не смог перепрыгнуть");
        return false;
    }

}
