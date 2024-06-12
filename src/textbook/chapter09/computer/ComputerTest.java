package textbook.chapter09.computer;

public class ComputerTest {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); //추상 클래스는 모든 메서드가 구현되지 않아 인스턴스 생성 불가(구현 코드 x=수행할 내용 x)
        Computer c2 = new Desktop(); //추상 클래스도 형 변환은 가능함
        //Computer c3 = new NoteBook(); // 추상 클래스라 인스턴스 생성 불가
        Computer c4 = new MyNotebook(); // concrete 클래스이기 때문에 인스턴스 생성 가능
    }
}
