package textbook.chapter08;

public class Customer {
    private int customerID;
    private String customerNM;
    private String grade;
    int bonusPoint; //보너스 포인트
    double bonusRatio; //포인트 적립 비율

    public Customer() //기본 생성자
    {
        grade = "SILVER"; //기본 등급 = 실버
        bonusRatio = 0.01; // 적립 기본 비율 = 1%
    }

    public Customer(int customerID, String customerNM){ //ID, NM 매개변수로 받는 생성자
        this.customerID = customerID;
        this.customerNM = customerNM;
        grade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){ //지불 금액 계산하는 함수
        bonusPoint += price * bonusRatio; //보너스 포인트는 금액 * 적립 비율의 값만큼 적립됨
        return price;
    }

    public void showCustomerInfo(){
        System.out.printf("Customer Name: %s / Grade: %s / Point: %d", customerNM, grade, bonusPoint);
    }


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getcustomerNM() {
        return customerNM;
    }

    public void setcustomerNM(String customerNM) {
        this.customerNM = customerNM;
    }

    public String getgrade() {
        return grade;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }
}
