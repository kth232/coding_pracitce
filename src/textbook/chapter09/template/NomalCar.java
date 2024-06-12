package textbook.chapter09.template;

public class NomalCar extends Car{ //car 추상 클래스 상속
    //추상 메서드 구현
    @Override
    public void drive() {
        System.out.println("person driving");
        System.out.println("person operating the steering wheel");
    }

    @Override
    public void stop() {
        System.out.println("stop with brake");
    }

    @Override
    public void light() {
        System.out.println("turn on light");
    }
}
