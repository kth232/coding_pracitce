package textbook.chapter10.inheritance;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass mClass = new MyClass();
        X xClass = mClass;
        xClass.x();

        Y yClass = mClass;
        yClass.y();

        Z zClass = mClass;
        zClass.z();
        zClass.x();
        zClass.y();
    }
}
