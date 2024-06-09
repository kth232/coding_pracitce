package textbook.chapter06.singleton;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); //생성된 인스턴스 호출
        Car car1 = factory.createCar();
        Car car2 = factory.createCar();

        System.out.println(car1.getCarNo());
        System.out.println(car2.getCarNo()); //get함수로 car no 가져오기

    }
}
