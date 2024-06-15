package textbook.chapter12.rectangle;

public class RectangleTest {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) { //사각형 넓이 구하는 제네릭 메서드
        //T, V는 제네릭 메서드 내에서만 유효하게 사용 가능
        double left = ((Number)p1.getX()).doubleValue(); //입력받은 숫자를 numger형으로 변환 후 실수값으로 꺼내기
        double right =((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left; //가로 길이
        double height = bottom - top; //세로 길이

        return width * height;
    }
    public static void main(String[] args) {

        Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0); //선언된 자료형을 보고 컴파일러가 생성되는 인스턴스의 자료형 유추 가능

        double rect = RectangleTest.<Integer, Double>makeRectangle(p1, p2);
        System.out.println("사각형의 넓이: " + rect);
    }
}
