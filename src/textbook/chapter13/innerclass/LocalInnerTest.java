package textbook.chapter13.innerclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){ //runnable 자료형 객체 생성 후 반환해야 함
        int num = 100; //지역 변수

        class MyRunnable implements Runnable{ //지역 내부 클래스로 runnable 인터페이스 구현
            int localNum = 10; //지역 내부 클래스의 인스턴스 변수

            @Override
            public void run() { //run() 구현
                //num = 200;   //지역변수는 상수로 바뀜->값 변경 불가(오류 발생)
                //i = 100;     //매개 변수도 지역변수처럼 상수로 바뀜->값 변경 불가(오류 발생)
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable(); //지역 내부 클래스 이름은 클래스 생성 후 반환 시에만 사용함
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer(); //외부 클래스 객체 생성
        Runnable runner = out.getRunnable(10); //메서드 호출을 통해 생성된 객체 반환
        runner.run(); //getRunnable 메서드의 지역변수가 사용됨->지역 내부 클래스의 지역 변수는 상수 처리됨
    }
}
