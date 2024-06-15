package textbook.chapter11.object;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10, 20, 30);
        Circle copyCircle = (Circle)circle.clone(); //Object.clone()를 사용해서 circle 인스턴스 복제

        System.out.println(circle);
        System.out.println(copyCircle); //멤버변수가 동일한 인스턴스를 다른 메모리에 새롭게 생성

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(copyCircle)); //실제 주소값 다름
    }
}
