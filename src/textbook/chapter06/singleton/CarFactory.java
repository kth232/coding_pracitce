package textbook.chapter06.singleton;

public class CarFactory {
    private static CarFactory instance = new CarFactory(); //factory 인스턴스 객체 생성

    private CarFactory() {} //기본 생성자, private로 외부 접근 제어

    public static CarFactory getInstance() { //생성한 인스턴스를 외부에서 사용하도록 반환하는 함수
        if(instance == null) { //singleton pattern: factory 인스턴스 객체 없을 시 생성->필요할 때 한번만 생성한다
            instance = new CarFactory();
        }
        return instance; //인스턴스 반환, 공유
    }

    public Car createCar() { //car 객체 생성
        Car car = new Car();
        return car;
    }
}
