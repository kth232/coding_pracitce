package textbook.chapter08.customer;

import java.util.ArrayList;

public class CustomerListTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>(); //Customer 형으로 ArrayList 객체 배열 생성
        //arrayList의 add 속성으로 객체 배열에 고객 추가
        customerList.add(new Customer(10010, "lee")); //일반 등급 고객
        customerList.add(new Customer(10020, "kim")); //일반 등급 고객
        customerList.add(new GoldCustomer(10030, "park")); //gold 등급 고객
        customerList.add(new GoldCustomer(10040, "choi")); //gold 등급 고객
        customerList.add(new VIPCustomer(10050, "kang", "coffee coupon")); //VIP 고객

        System.out.println("====== 고객 정보 출력 ======");
        for(Customer customer : customerList){ //customerList의 각 요소를 customer에 담아 출력 반복(향상된 for문)
            System.out.println(customer.showCustomerInfo()); // 메서드 오버라이딩(VIP 고객)으로 각 고객에 맞는 정보 출력
        }

        System.out.println("====== 할인율, 포인트 계산 ======");
        int price = 10000;
        for(Customer customer : customerList){ //customerList의 각 요소를 customer에 담아 출력 반복(향상된 for문)
            int cost = customer.calcPrice(price); //고객 등급별 금액 계산<-메서드 재정의
            System.out.printf("고객명: %s / 지불 금액: %d / 보유 point: %d%n", customer.getCustomerNM(), cost, customer.getPoint());
        }
    }
}
