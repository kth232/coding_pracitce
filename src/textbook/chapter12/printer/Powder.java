package textbook.chapter12.printer;

public class Powder extends Material { //material 추상클래스 상속
    public void doPrinting() {
        System.out.println("Powder printing");
    }

    public String toString() {
        return "Material: Powder";
    }
}
