package textbook.chapter12.printer;

public class Plastic extends Material{ //material 추상클래스 상속
    public void doPrinting() {
        System.out.println("Plastic printing");
    }

    public String toString() {
        return "Material: Plastic";
    }
}
