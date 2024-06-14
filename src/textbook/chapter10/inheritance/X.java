package textbook.chapter10.inheritance;

public interface X {
    void x();

    default void xx() {
        System.out.println("xx"); //디폴트 메서드
    }
}
