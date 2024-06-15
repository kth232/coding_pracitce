package textbook.chapter12.rectangle;

public class Point <T, V>{
    T x; //T 자료형 변수 x
    V y; //Y 자료형 변수 y

    Point(T x, V y){
        this.x = x;
        this.y = y;
    }

    public  T getX() { //제네릭 메서드
        return x;
    }

    public V getY() { //제네릭 메서드
        return y;
    }
}
