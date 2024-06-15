package textbook.chapter11.object;

public class Circle implements Cloneable{ //객체 복제 허용의 의미로 cloneable 인터페이스 함께 선언
    //clone() 사용하기 위해 cloneable 인터페이스 구현
    // cloneable 인터페이스=마커 인터페이스: 구현해야 할 메서드가 없는 인터페이스
    Point point;
    int radius;

    Circle(int x, int y, int radius){
        this.radius = radius;
        point = new Point(x, y);
    }

    public String  toString(){
        return "원점: " + point + " / 반지름: " + radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //clone() 사용 시 발생할 수 있는 오류 예외 처리
        return super.clone();
    }
}
