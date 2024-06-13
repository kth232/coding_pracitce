package textbook.chapter10.inheritance;

public interface Z extends X, Y{ //인터페이스 상속
    void z();

    @Override
    default void xx() {
        System.out.println("zz");
    }
}
