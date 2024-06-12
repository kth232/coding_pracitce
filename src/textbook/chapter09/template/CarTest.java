package textbook.chapter09.template;

public class CarTest {
    public static void main(String[] args) {

        System.out.println("=== self-driving car ===");
        Car aiCar = new AICar();
        aiCar.run();

        System.out.println("=== car driven by a person ===");
        Car nomalCar = new NomalCar();
        nomalCar.run();
    }
}
