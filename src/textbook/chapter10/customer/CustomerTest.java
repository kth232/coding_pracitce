package textbook.chapter10.customer;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer(); //customer 클래스 객체 생성

        Buy buyer = customer; //customer를 buy형으로 형변환, buyer는 buy 인터페이스의 메서드만 호출 가능
        buyer.buy();
        buyer.order(); //customer에서 재정의된 메서드 호출, 가상 메서드 원리

        Sell seller = customer; //customer를 sell형으로 형변환, seller는 sell 인터페이스의 메서드만 호출 가능
        seller.sell();
        seller.order(); //customer에서 재정의된 메서드 호출, 가상 메서드 원리

        if( seller instanceof Customer){ //instanceof 연산자로 형 확인
            Customer customer2 = (Customer)seller; //다운 캐스팅, 명시적 형변환(오류 방지)
            customer2.buy(); //customer의 재정의된 메서드 호출
            customer2.sell();
        }

        customer.order(); //customer에서 재정의된 메서드 호출

        //각 인터페이스의 정적 메서드 호출
        Buy.pay();
        Sell.pay();
    }
}
