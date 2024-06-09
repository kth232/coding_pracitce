package textbook.chapter06.cooperation;

public class Passenger {
    public String passengerNm; //승객 이름
    public int money; // 승객이 가지고 있는 돈

    public Passenger(String passengerNm, int money)  // 이름과 돈 초기화하기
    {
        this.passengerNm = passengerNm;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    } // 버스 비용 지불

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    } //지하철 비용 지불

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    } //택시 비용 지불

    public void showInfo() {
        System.out.println(passengerNm + "님의 남은 돈은 " + money + "입니다.");
    } //승객 정보 출력
}
