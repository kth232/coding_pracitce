package textbook.chapter08.customer;

public class GoldCustomer extends Customer{ //Customer 클래스 상속
    double saleRatio; //지불금액 할인률

    public GoldCustomer(int customerID, String customerName){ //ID, NM 매개변수로 받는 생성자
        super(customerID, customerName); //ID, NM을 매개변수로 가지는 상위 클래스(Customer) 생성자 호출

        grade = "GOLD";
        ratio = 0.02; //2% 적립
        saleRatio = 0.1; //10% 할인
    }

    @Override
    public int calcPrice(int price){ //지불 금액 계산하는 메서드, 메서드 오버라이딩
        point += price * ratio; //포인트는 금액 * 적립 비율의 값만큼 적립됨
        return price - (int)(price * saleRatio); //할인률 적용된 가격
    }
}
