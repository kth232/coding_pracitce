package textbook.chapter08;

public class VIPCustomer extends Customer{ //Customer 클래스 상속
    double saleRatio; //지불금액 할인률
    String coupon; //쿠폰명

    public VIPCustomer() //기본 생성자, 기본값 초기화
    {
        grade = "VIP";
        ratio = 0.05; //5% 적립
        saleRatio = 0.1; //할인률 10%
    }

    public VIPCustomer(int customerID, String customerNM, String coupon){ //ID, NM, coupon 매개변수로 받는 생성자
        super(customerID, customerNM); //ID, NM을 매개변수로 가지는 상위 클래스 생성자 호출
        grade = "VIP"; //멤버 변수 초기화
        ratio = 0.05; //5% 적립
        saleRatio = 0.1; //할인률 10%
        this.coupon = coupon;
    }

    @Override
    public int calcPrice(int price){ //지불 금액 계산하는 메서드, 메서드 오버라이딩
        point += price * ratio; //포인트는 금액 * 적립 비율의 값만큼 적립됨
        return price - (int)(price * saleRatio); //할인률 적용된 가격
    }

    public String getCoupon() {
        return coupon;
    }

    @Override
    public String showCustomerInfo() { //고객 정보 호출 메서드 재정의
        //Customer의 showCustomerInfo()를 호출하여 정보를 받아옴
        return super.showCustomerInfo() + " / 보유 쿠폰: " + coupon;
    }
}
