package textbook.chapter06.cooperation;

public class Taxi {
    String taxiNm; // 택시 이름
    int passengerCnt; // 승객 수
    int money; // 택시 소득

    public Taxi(String taxiNm) // 택시 이름을 매개변수로 받는 생성자
    {
        this.taxiNm = taxiNm;
    }

    public void take(int money) // 승객이 낸 돈을 받음
    {
        this.money += money; // 택시 수입 증가
        passengerCnt++; // 승객 수 증가
    }

    public void showInfo() { // 택시 정보를 출력하는 함수
        System.out.printf("Taxi name: %s, passenger count: %d, Taxi income: %d%n", taxiNm, passengerCnt, money);
    }
}
