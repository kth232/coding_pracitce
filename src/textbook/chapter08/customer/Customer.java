package textbook.chapter08.customer;

public class Customer {
    protected int customerID; //상속 관계 클래스에서 접근할 수 있게 protected 접근 제어자 사용
    protected String customerNM;
    protected String grade;
    int point; //포인트
    double ratio; //포인트 적립 비율

    public Customer() { //기본 생성자 / 등급, 적립률 기본값 초기화
        initCustomer();
    }

    public Customer(int customerID, String customerNM){ //ID, NM 매개변수로 받는 생성자
        this.customerID = customerID;
        this.customerNM = customerNM;
        initCustomer(); // 등급, 적립률 기본값 초기화
    }

    private void initCustomer() { //멤버변수 초기화 메서드, 생성자에서만 호출하므로 private
        grade = "SILVER"; //기본 등급 = 실버
        ratio = 0.01; // 적립 기본 비율 = 1%
    }

    public int calcPrice(int price){ //지불 금액 계산하는 함수
        point += price * ratio; //포인트는 금액 * 적립 비율의 값만큼 적립됨
        return price; //할인되지 않으면 금액 그대로 반환
    }

    public String showCustomerInfo(){ //고객 정보 출력하는 함수
        //String 타입으로 반환해야 VIPInfo()에서 출력값을 사용할 수 있음
        //void: 반환값이 없다
        return "Customer ID: " + customerID + " / Customer Name: " + customerNM + " / Grade: " + grade + " / Point: " +point;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerNM() {
        return customerNM;
    }

    public void setCustomerNM(String customerNM) {
        this.customerNM = customerNM;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }
}
