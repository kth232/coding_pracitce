package textbook.chapter10.customer;

public interface Sell {
    void sell(); //추상 메서드

    default void order(){ //디폴트 메서드: 구현한 클래스 객체가 생성되어야 사용 가능
        System.out.println("sell");
    }

    static void pay() { //정적 메서드, 인터페이스명으로 호출
        System.out.println("S pay");
    }
}
