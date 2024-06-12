package textbook.chapter09.template;

public class AICar extends Car{ //car 추상 클래스 상속
    //추상 메서드 구현
    @Override
    public void drive() {
        System.out.println("autonomous driving");
        System.out.println("turns on its own");
    }

    @Override
    public void stop() {
        System.out.println("stop on its own");
    }
}
