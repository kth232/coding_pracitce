package textbook.chapter10.inheritance;

public class MyClass  extends A implements Z{
    //추상 메서드 모두 구현
    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    @Override
    public void z() {
        System.out.println("z()");
    }

    @Override
    public void xx() { //x 인터페이스의 디폴트 메서드 재정의
        //Z.super.xx(); // z 클래스의 zz 출력
        System.out.println("mm");
    }

    public void mmm() {
        System.out.println("mmm");
    }

    @Override
    void aa() { //A 추상 클래스의 추상 메서드 재정의
        System.out.println("aa");
    }

    @Override
    void oa() { //A 추상 클래스의 일반 메서드 재정의
        System.out.println("oo");
    }
}
