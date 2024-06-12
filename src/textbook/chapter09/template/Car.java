package textbook.chapter09.template;

public abstract class Car { //추상 클래스 정의->상속 목적
    public abstract void drive(); //추상 메서드 정의: 하위 클래스마다 다르게 구현할 메서드 선언
    public abstract void stop(); //추상 메서드 정의
    public abstract void light(); //추상 메서드 정의 추가
    public void startCar() //구현 코드가 있는 메서드 정의: 하위 클래스도 공통으로 사용할 메서드 구현, 재정의 가능
    {
        System.out.println("start up");
    }

    public  void turnOff()
    {
        System.out.println("turn off");
    }

    final public void run() //템플릿 메서드: 메서드 실행 순서, 시나리오 정의-> 상속 받은 하위 클래스에서 재정의 할 수 없도록 final 예약어로 선언
    // car가 수행할 동작 순서대로 구현, 순서는 바꿀 수 없으나 차종에 따라 구현 내용 재정의 가능
    {
        startCar();
        light();
        drive();
        stop();
        turnOff();
    }
}
