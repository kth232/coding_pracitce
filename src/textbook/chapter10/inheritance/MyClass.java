package textbook.chapter10.inheritance;

public class MyClass implements Z{
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
}
