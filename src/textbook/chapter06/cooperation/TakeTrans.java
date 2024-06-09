package textbook.chapter06.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        // 승객 2명 생성
        Passenger person1 = new Passenger("Kim", 5000);
        Passenger person2 = new Passenger("Lee", 10000);
        Passenger person3 = new Passenger("Park", 8000);
        Passenger person4 = new Passenger("Choi", 7000);
        Passenger person5 = new Passenger("Yoon", 12000);

        Bus bus100 = new Bus(100);
        person1.takeBus(bus100); // Kim이 100번 버스 탑승
        person1.showInfo(); // Kim 정보 출력
        bus100.showInfo(); // 버스 정보 출력

        person3.takeBus(bus100); // Park이 100번 버스 탑승
        person3.showInfo(); // Park 정보 출력
        bus100.showInfo();

        System.out.println("---------------");

        Subway subway2L = new Subway("Line2");
        person2.takeSubway(subway2L);  // Lee가 2호선 탑승
        person2.showInfo(); // Lee 정보 출력
        subway2L.showInfo();

        person4.takeSubway(subway2L);  // Choi가 2호선 탑승
        person4.showInfo(); // Choi 정보 출력
        subway2L.showInfo();

        System.out.println("---------------");

        Taxi taxi = new Taxi("kakao taxi");
        person5.takeTaxi(taxi);  //Yoon이 택시를 탐
        person5.showInfo(); // Yoon 정보 출력
        taxi.showInfo();
    }
}
