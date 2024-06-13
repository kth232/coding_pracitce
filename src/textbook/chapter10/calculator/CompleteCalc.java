package textbook.chapter10.calculator;

public class CompleteCalc extends Calculator { //calculator 추상 클래스 상속
    // 미구현된 추상 메서드 구현하여 concrete 클래스가 됨
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0)
            return num1 / num2;
        else
            return Calc.ERROR; //나누는 수가 0인 경우 에러 코드 반환
    }

    @Override
    public int square(int num) {
        return num*num;
    }

    @Override
    public void description() {
        System.out.println("Complete Calculator");
        //super.description(); //calc 인터페이스의 description() 호출
    }

    public void showInfo(){ //추가로 정의한 메서드
        System.out.println("implement Calc Interface");
    }
}
