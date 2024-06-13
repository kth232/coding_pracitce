package textbook.chapter10.calculator;

public interface Calc { //인터페이스 정의
    //인터페이스에서 선언한 변수는 final 예약어를 쓰지 않아도 컴파일 과정에서 상수로 변환
    double PI = 3.14; //원주율 정의(public static final)
    int ERROR = -9999; //에러코드 정의(public static final)

    //인터페이스에서 선언한 메서드는 abstract 예약어를 쓰지 않아도 컴파일 과정에서 추상 메서드로 변환
    int add(int num1, int num2); //사칙연산 함수 정의
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    int square(int num); //제곱하는 함수 정의

    //default method: 인터페이스에서 완전 구현된 메서드, 클래스에서 따로 구현할 필요 없이 클래스가 생성되면 사용 가능, 재정의도 가능(반드시 x)
    default void description(){
        System.out.println("Implement an integer calculator");
        privateMethod(); //private 메서드 호출
    }

    //배열 요소 합계를 구하는 정적 메서드: 객체 생성과 상관없이 사용 가능
    static int total(int[] arr){
        int total = 0; //변수 초기화
        for(int i: arr){ //향상된 for문 arr에 담긴 정수 배열 요소 하나씩 꺼내서 반복
            total += i;
        }
        staticMethod(); //static 메서드 호출
        return total;
    }

    //private 메서드: 인터페이스 내부에서 사용할 목적으로 정의한 메서드(다른 클래스에서 사용 불가, 재정의 불가), 코드 재사용성 증가
    private void privateMethod() {
        System.out.println("private method");
    }

    private static void staticMethod() { //정적 메서드: 객체 생성과 상관없이 사용 가능
        System.out.println("private static method");
    }
}
