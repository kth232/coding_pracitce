package textbook.chapter08.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer(10010, "lee"); //일반 등급 lee 인스턴스 생성
        customer1.point = 100;
        System.out.println(customer1.showCustomerInfo());

        VIPCustomer customer2 = new VIPCustomer(10020, "kim", "coffee coupon"); //VIP 등급 kim 인스턴스 생성
        customer2.point = 15000;
        System.out.println(customer2.showCustomerInfo()); //VIPCustomer는 쿠폰 출력 o

        Customer customer3 = new VIPCustomer(10030, "park", "bakery coupon"); //VIP park 인스턴스를 Customer 형으로 생성
        customer3.point = 10000;
        System.out.println(customer3.showCustomerInfo()); //Customer 형지만 메서드 재정의로 VIP 정보를 나타냄(쿠폰 출력 o)

        int price = 10000;

        System.out.printf("고객명: %s / 지불 금액: %d / 보유 point: %d%n", customer1.getCustomerNM(), customer1.calcPrice(price), customer1.getPoint());
        //lee / 지불 금액 10000 / 보유 point: 200 = 일반 등급 고객은 지불금 할인 x, 포인트는 지불 금액의 1%(100p) 적립
        System.out.printf("고객명: %s / 지불 금액: %d / 보유 point: %d%n", customer2.getCustomerNM(), customer2.calcPrice(price), customer2.getPoint());
        //kim / 지불 금액: 9000 / 보유 point: 15500 = VIP고객은 10% 할인된 금액인 9,000원 지불, 포인트는 지불 금액의 5%(500p) 적립
        System.out.printf("고객명: %s / 지불 금액: %d / 보유 point: %d%n", customer3.getCustomerNM(), customer3.calcPrice(price), customer3.getPoint());
        //park / 지불 금액: 9000 / 보유 point: 10500 = Customer 형이지만 메서드 재정의로 VIP 금액 출력
    }
}
