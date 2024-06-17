package textbook.chapter13.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        System.out.println("===number===");
        MaxNo max = (x, y) -> (x >= y) ? x : y; // 람다식을 인터페이스 자료형 max 변수에 대입
        System.out.println("max func: " + max.getMax(10, 20));// 인터페이스 자료형 변수로 함수 호출

        Add addfunc = (a, b) -> a + b;
        System.out.println("add func: " + addfunc.add(10, 20));

        System.out.println("===concat===");
        String s1 = "Hello";
        String s2 = "World";
        //람다식으로 인터페이스 구현 시 클래스 생성 없이 바로 메서드 구현=익명 내부 클래스
        Concat concat1 = (s, v) -> System.out.println("concat: " + s + "," + v); //메서드 구현부를 변수에 concat1 대입
        concat1.makeString(s1, s2); //변수 사용하여 메서드 호출


        Concat concat2 = new Concat() { //익명 내부 클래스
            @Override
            public void makeString(String s1, String s2) {
                System.out.println("concat2: " + s1 + "," + s2);
            }
        };
        concat2.makeString(s1, s2);

        System.out.println("===string===");
        PrintStr str = s -> System.out.println(s); //람다식을 인터페이스형 변수에 대입
        str.showStr("hello lambda_1"); //람다식 구현부 호출

        showStr(str); //메서드 매개변수로 람다식 대입한 변수 전달

        PrintStr reStr = returnStr(); //변수로 반환받기
        reStr.showStr("hello"); //메서드 호출
    }
    public static void showStr (PrintStr p){ //정적 메서드, 인터페이스형 매개변수 받음
        p.showStr("hello lambda_2");
    }

    public static PrintStr returnStr () { //람다식 반환
        return s -> System.out.println(s + " world");
//        }
    }
}