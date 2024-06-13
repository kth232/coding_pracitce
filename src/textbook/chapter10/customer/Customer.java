package textbook.chapter10.customer;

public class Customer implements Buy, Sell{ //인터페이스 동시 구현 가능(구현코드나 멤버변수 x)
    //인터페이스에 이름이 같은 메소드가 선언되어도 구현은 클래스에서 하기 때문에 상관x
    @Override
    public void buy() {
        System.out.println("buy order");
    }

    @Override
    public void sell() {
        System.out.println("sell order");
    }

    //다른 인터페이스에서 정의되었지만 메서드명이 같은 디폴트 메서드는 구현하는 클래스에서 재정의 해야함
    @Override
    public void order() {
        System.out.println("customer SELL order");
    }
}
