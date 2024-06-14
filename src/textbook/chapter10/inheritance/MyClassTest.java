package textbook.chapter10.inheritance;

public class MyClassTest {
    public static void main(String[] args) {

        MyClass mClass = new MyClass();

        System.out.println("--X--");
        X xClass = mClass;
        xClass.x();
        xClass.xx(); //디폴트 메서드, 실제 객체인 mclass에 재정의된 mm이 출력된다

        System.out.println("--Y--");
        Y yClass = mClass;
        yClass.y();

        System.out.println("--Z--");
        Z zClass = mClass;
        zClass.z();
        zClass.y();
        zClass.x();
        zClass.xx(); //디폴트 메서드, 실제 객체인 mclass에 재정의된 mm이 출력된다
        int z = zClass.z; //z 인터페이스에 정의된 상수 호출
        System.out.println(z);

        System.out.println("--A--");
        A aClass = mClass;
        aClass.oa();
        aClass.aa();
        aClass.a = 5;
        System.out.println(aClass.a);

        System.out.println("--M--");
        mClass.a = 10;
        System.out.println(mClass.a);
        mClass.aa();
        mClass.aaa();
        mClass.oa();

        System.out.println("--ZX--");
        if(xClass instanceof Z) { //xClass를 하위 클래스형인 Z로 형변환
            Z zclass = (Z) xClass;
            zclass.xx(); //실제 객체는 mclass이기 때문에 myclass에 재정의한 mm이 출력됨
        }

        System.out.println("--MX--");
        if(xClass instanceof MyClass) { //xClass를 하위 클래스형인 MyClass로 형변환
            MyClass mclass = (MyClass) xClass;
            mclass.xx(); //실제 객체는 mclass이기 때문에 myclass에 재정의한 mm이 출력됨
            mclass.mmm(); //다운 캐스팅, myclass에 정의된 mmm() 호출 가능
        }
    }
}
