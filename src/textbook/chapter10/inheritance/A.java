package textbook.chapter10.inheritance;

public abstract class A {
    int a; // 일반 변수 정의

    abstract void aa(); //추상 메서드 정의

    void aaa(){ //일반 메서드
        System.out.println("aaa");
    };
    
    void oa(){ //하위 클래스 재정의용 일반 메서드
        System.out.println("oa");
    }
}
