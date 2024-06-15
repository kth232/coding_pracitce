package textbook.chapter12.printer;

public class GenericPrinter<T extends Material> { //material 추상클래스를 상속받은 자료형만 가능하도록 제한함
    private T material; //T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() { //T 자료형 변수를 반환하는 메서드
        return material;
    }

    public String toString(){
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
