package textbook.chapter10.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int[] arr = {1,2,3,4,5};

        CompleteCalc calc = new CompleteCalc(); //CompleteCalc 클래스 객체 생성
        System.out.println("add: " + calc.add(num1, num2)); //구현한 추상 메서드 호출
        System.out.println("substract: " + calc.substract(num1, num2));
        System.out.println("times: " + calc.times(num1, num2));
        System.out.println("divide: " + calc.divide(num1, num2));
        System.out.println("square: "  + calc.square(num1)); //제곱 함수
        calc.showInfo(); //completeCalc에서 정의한 함수 호출

        //디폴트 메서드: 인터페이스에서 완전 구현된 메서드로 클래스에서 따로 구현할 필요 없이 사용 가능
        System.out.println("===default method===");
        calc.description(); //디폴트 메소드 호출: 실제 객체의 메서드 호출

        //정적 메서드: 객체 생성과 상관없이 사용 가능
        System.out.println("===static method===");
        System.out.println("sum total: "+ Calc.total(arr)); //정적 메소드 total 호출 + static 메서드 호출, 인터페이스명으로 접근

        //ArithmeticException challenge..
        System.out.println("===ArithmeticException challenge===");
        int num3 = 0;
        try {
            int result = num1 / num3;
            System.out.println("Try dividing by zero: "+ result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 불가/현재 입력된 나누는 수: "+num3);
        }
    }
}
