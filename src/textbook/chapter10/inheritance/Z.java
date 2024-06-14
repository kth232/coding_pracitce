package textbook.chapter10.inheritance;

public interface Z extends X, Y{ //인터페이스 상속
    void z();
    
    int z = 20; //인터페이스 변수 정의: 상수화

    @Override
    default void xx() {
        System.out.println("zz"); //X 인터페이스의 디폴트 메서드 재정의
    }
}
