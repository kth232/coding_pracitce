package textbook.chapter09.player;

public abstract class PlayerLevel { //추상 클래스 정의
    public abstract void run(); //추상 메서드, 하위 클래스에서 레벨 별로 다르게 구현함
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void act(int count) //템플릿 메서드, 메서드 호출 순서 변경 불가(final)
    {
        run();
        for(int i=0; i < count; i++){ // run 후 count 수만큼 jump, turn
            jump();
            turn();
        }

    }
}
