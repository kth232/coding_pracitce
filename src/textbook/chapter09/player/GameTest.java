package textbook.chapter09.player;

public class GameTest {
    public static void main(String[] args) {
        Player player = new Player(); //player 인스턴스 생성, 첫 생성 시 beginner 레벨
        player.play(1);

        MiddleLevel mLevel = new MiddleLevel();
        player.upgradeLevel(mLevel); //생성된 player 객체에 middlelevel 대입->레벨 변경
        player.play(2);

        PlayerLevel sLevel = new SuperLevel(); //playerlevel 형으로 생성 가능(다형성 가능)
        player.upgradeLevel(sLevel); //생성된 player 객체에 superlevel 대입->레벨 변경
        player.play(3);
    }
}
