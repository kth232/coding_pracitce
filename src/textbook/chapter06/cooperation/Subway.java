package textbook.chapter06.cooperation;

public class Subway {
    public String lineNum; // 지하철 노선 번호
    public int passengerCnt; // 승객 수
    public int money; // 소득

    public Subway(String lineNum) { // 지하철 노선 초기화
        this.lineNum = lineNum;
    }

    public void take(int money) { // 승객 탑승
        this.money += money; // 수입 증가
        passengerCnt++; // 승객 수 증가
    }

    public void showInfo() // 지하철 정보 출력
    {
        System.out.printf("Line number: %s, passenger count: %d, Subway income: %d%n", lineNum, passengerCnt, money);
    }
}
