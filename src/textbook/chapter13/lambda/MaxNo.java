package textbook.chapter13.lambda;

@FunctionalInterface //함수형 인터페이스임을 알리는 애노테이션
public interface MaxNo {
    int getMax(int num1, int num2); //람다식으로 구현할 추상 메서드 선언
    //람다식: 익명함수, 한 인터페이스에 오직 하나의 메서드만 선언한다
}
