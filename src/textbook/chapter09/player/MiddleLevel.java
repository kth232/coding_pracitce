package textbook.chapter09.player;

public class MiddleLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void jump() {
        System.out.println("jump high");
    }

    @Override
    public void turn() {
        System.out.println("No turning");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==MIDDLE LEVEL==");
    }
}
