package textbook.chapter09.computer;

public class MyNotebook extends Notebook { //Notebook 추상 클래스 상속
    // 구현되어야 할 모든 추상 메서드가 구현됨->concrete 클래스
    // Notebook 추상 클래스에서 display() 추상 쿨래스 구현
    // ->상속 받아 나머지 하나만 구현해도 전부 구현한 클래스가 됨
    @Override
    public void typing() {
        System.out.println("MyNoteBook Typing()");
    }
}
