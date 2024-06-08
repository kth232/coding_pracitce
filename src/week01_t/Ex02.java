package week01_t;

public class Ex02 {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderNum="202405020001";
        order.id="a123";
        order.date="2024년 5월 2일";
        order.name="kim";
        order.productsNum="PD0502-12";
        order.address="서울시 마포구 신촌로 176";
        System.out.println(order);
    }
}
