package textbook.chapter13.innerclass;

class Outter2{

    Runnable getRunnable(int i){ //익명 내부 클래스(클래스 이름을 빼고 클래스를 바로 생성), runnable 인터페이스 생성
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                //num = 200;   //에러
                //i = 10;      //에러
                System.out.println(i);
                System.out.println(num);
            }
        }; //클래스 끝에 ; 사용
    }

    Runnable runner = new Runnable() { //익명 내부 클래스를 변수에 대입
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    }; //클래스 끝에 ; 사용
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outter2 out = new Outter2();

        Runnable runnerble = out.getRunnable(10);
        runnerble.run();

        out.runner.run();
    }
}
