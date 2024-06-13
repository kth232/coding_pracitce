package textbook.chapter10.inheritance;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass mClass = new MyClass();
        X xClass = mClass;
        xClass.x();
        xClass.xx(); //디폴트 메서드, 실제 객체인 mclass에 재정의된 mm이 출력된다

        Y yClass = mClass;
        yClass.y();

        Z zClass = mClass;
        zClass.z();
        zClass.y();
        zClass.x();


        if(xClass instanceof Z) { //xClass를 하위 클래스형인 Z로 형변환
            Z zclass = (Z) xClass;
            zclass.xx(); //실제 객체는 mclass이기 때문에 myclass에 재정의한 mm이 출력됨
        }

        if(xClass instanceof MyClass) { //xClass를 하위 클래스형인 MyClass로 형변환
            MyClass mclass = (MyClass) xClass;
            mclass.mmm(); //다운 캐스팅, myclass에 정의된 mmm() 호출 가능
        }
    }
}
