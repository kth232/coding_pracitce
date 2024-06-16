package textbook.chapter06.singleton;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance(); //생성된 인스턴스 호출
        Car car1 = factory.createCar("lee");
        Car car2 = factory.createCar("lee");
        car1.showCarInfo();
        car2.showCarInfo();
        System.out.println("car1==car2: " + (car1==car2));


        Car car3 = factory.createCar("kim");
        Car car4 = factory.createCar("kim");
        car3.showCarInfo();
        car4.showCarInfo();
        System.out.println("car3==car4: " + (car3==car4));
        System.out.println("car1==car3: " + (car1==car3));

        Car car5 = factory.createCar("park");
        car5.showCarInfo();

        System.out.println("==All Car Info==");
        factory.showAllInfo();

    }
}
