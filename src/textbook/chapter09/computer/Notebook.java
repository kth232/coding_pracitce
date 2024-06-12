package textbook.chapter09.computer;

public abstract class Notebook extends Computer{ // 추상 클래스, Computer 추상 클래스 상속
    //메서드 재정의로 공통으로 구현할 추상 메서드 구현 ->모든 추상 메서드를 구현하지 않음(diplay()와 typing() 중 하나만 구현함)-> 추상 클래스가 됨
    @Override
    public void display() {
        System.out.println("NoteBook Display()");
    }
}
