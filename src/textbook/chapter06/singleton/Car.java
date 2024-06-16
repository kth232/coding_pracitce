package textbook.chapter06.singleton;

public class Car {
    private static int serialNo = 10000; //
    private int carNo;
    private String ownerNm;

    public Car(String ownerNm) { //car 객체 생성
        serialNo++; //car가 생성되면 serial no 증가
        carNo = serialNo; //car no에 대입
        this.ownerNm = ownerNm;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }
    public void showCarInfo() {
        System.out.printf("serialNo: %d, carNo: %d, ownerName: %s%n", serialNo, getCarNo(), ownerNm); //get함수로 car no 가져오기
    }
}
