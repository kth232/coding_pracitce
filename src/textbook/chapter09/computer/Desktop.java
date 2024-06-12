package textbook.chapter09.computer;

public class Desktop extends Computer { //concrete class, Computer 추상 클래스 상속
    //메서드 재정의로 공통으로 구현할 추상 메서드 모두 구현->구체적인 클래스가 됨
    @Override
    public void display() {
        System.out.println("DeskTop Display()"); //추상 메서드의 구현 코드 작성
    }

    @Override
    public void typing() {
        System.out.println("DeskTop Typing()");
    }
}
