package textbook.chapter06.singleton;

public class Car {
    private static int serialNo = 10000; //
    private int carNo;

    public Car() { //car 객체 생성
        serialNo++; //car가 생성되면 serial no 증가
        carNo = serialNo; //car no에 대입
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }
}
