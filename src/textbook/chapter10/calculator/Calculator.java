package textbook.chapter10.calculator;

public abstract class Calculator implements Calc { //인터페이스를 구현한 추상 클래스
    //Cal 인터페이스에 정의된 추상 메서드 5개 중 2개만 구현
    //-> 모든 추상 메서드를 구현하지 않음=추상 클래스
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
