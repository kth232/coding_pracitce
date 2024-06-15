package textbook.chapter11.object;

public class Point { //원점 클래스
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + ", " + "y = " + y;
    }
}
