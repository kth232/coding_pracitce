package textbook.chapter09.player;

public class Player {
    private PlayerLevel level; //레벨 변수 선언

    public Player() //기본 생성자, 첫 생성 시 beginner로 시작하며 level 메세지 출력
    {
        level= new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) { //레벨 변경 메서드, 현재 자신의 레벨을 매개변수로 받은 level로 변경, 메세지 출력
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.act(count); //템플릿 메서드 act() 호출
    }
}
