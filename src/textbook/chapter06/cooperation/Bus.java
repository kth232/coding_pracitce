package textbook.chapter06.cooperation;

public class Bus {
    int busNum; // 버스 번호
    int passengerCnt; // 승객 수
    int money; // 버스 소득

    public Bus(int busNum) // 버스 번호를 매개변수로 받는 생성자
    {
        this.busNum = busNum;
    }

    public void take(int money) // 승객이 낸 돈을 받음
    {
        this.money += money; // 버스의 수입 증가
        passengerCnt++; // 승객 수 증가
    }

    public void showInfo() { // 버스 정보를 출력하는 함수
        System.out.printf("Bus number: %d, passenger count: %d, Bus income: %d%n", busNum, passengerCnt, money);
    }
}
