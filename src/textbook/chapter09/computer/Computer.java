package textbook.chapter09.computer;

public abstract class Computer { //추상 클래스 정의->상속 목적
    public abstract void display(); //추상 메서드 정의: 하위 클래스마다 다르게 구현할 메서드 선언
    public abstract void typing(); //구현 코드 없음
    public void turnOn() //구현 코드가 있는 메서드 정의: 하위 클래스도 공통으로 사용할 메서드 구현, 재정의 가능
    {
        System.out.println("turn on");
    }
    public void turnOff()
    {
        System.out.println("turn off");
    }
}
