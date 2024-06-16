package textbook.chapter13.innerclass;

class OutClass { //외부 클래스 정의
    private int num = 10;
    private static int sNum = 20; //외부 클래스 정적 변수
    
    private InClass inClass; //내부 클래스 자료형 변수 선언
    
    public OutClass() { //외부 클래스 기본 생성자, 외부 클래스가 생성된 후에 내부 클래스 생성 가능함
        inClass = new InClass(); // 내부 클래스 생성
    }
    class InClass{ //인스턴스 내부 클래스: 외부 클래스에서만 사용하기 위함(단 private로 선언하지 않으면 다른 클래스에서도 사용 가능함)

        int inNum = 1000; //내부 클래스의 인스턴스 변수
        //static int sInNum = 200; //인스턴스 내부 클래스에 객체 생성과 상관없이 사용 가능한 정적변수는 선언 불가(오류 발생)
    
        void inTest(){
            //외부 클래스 내부에 있기 때문에 private로 선언한 외부 클래스 변수 사용 가능
            System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

        //static void sTest(){ //정적 메서드도 인스턴스 내부 클래스에 정의 불가(오류 발생)
        //}
    }
    public void usingClass(){
        System.out.println("inclass 변수: " + inClass.inNum); //내부 클래스 변수를 사용하여 변수 출력
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출
    }

    static class InStaticClass{ //정적 내부 클래스
        int inNum = 100; //정적 내부 클래스의 인스턴슨 변수
        static int sInNum = 200; //정적 내부 클래스의 정적 변수

        void inTest(){   //정적 클래스의 일반 메서드
            //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            System.out.println("InStaticClass inNum = " + inNum + "(정적 내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(정적 내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        static void sTest(){  // 정적 클래스의 static 메서드
            //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

        }
    }
}

public class InnerTest {
    public static void main(String[] args){
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass(); // 내부 클래스 기능 호출
        System.out.println();

	    OutClass.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();

		System.out.println();

		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();

		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();
    }
}
