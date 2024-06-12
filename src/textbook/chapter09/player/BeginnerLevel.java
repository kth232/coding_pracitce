package textbook.chapter09.player;

public class BeginnerLevel extends PlayerLevel{ //추상 클래스 상속
    @Override
    public void run() {
        System.out.println("run slowly");
    }

    @Override
    public void jump() {
        System.out.println("No jumping");
    }

    @Override
    public void turn() {
        System.out.println("No turning");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("==BEGINNER LEVEL==");
    }
}
