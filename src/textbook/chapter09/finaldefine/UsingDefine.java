package textbook.chapter09.finaldefine;

public class UsingDefine {
    public static void main(String[] args) {
        System.out.println(Define.HELLOWORLD); //static 으로 선언되었기 때문에 클래스 이름으로 참조
        System.out.printf("minimum: %d%n", Define.MIN);
        System.out.printf("maximum: %d%n", Define.MAX);
        System.out.printf("math subject code: %d%n", Define.MATH);
        System.out.printf("english subject code: %d%n", Define.ENG);

    }
}
