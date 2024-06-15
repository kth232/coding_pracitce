package textbook.chapter11.object;

public class EqualsTest {
    public static void main(String[] args) {
        Person person1 = new Person(1000, "kim", 20);
        Person person2 = person1; //주소 복사, 같은 객체를 가리킴
        Person person3 = new Person(1001, "kim", 20); //동명이인

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("p1 == p2: " + (person1 == person2)); //같은 객체이므로 주소값 같음
        System.out.println("p2 == p3: "+ (person2 == person3));//두 객체 주소값 비교->각각 다른 객체이기 때문에 주소값 다름
        System.out.println("p1.equals(p2): " + person1.equals(person2)); //두 객체 주민번호 값 비교 -> 주민번호가 같으므로 같은 객체
        System.out.println("p1.equals(p3): " + person1.equals(person3)); //두 객체 주민번호 값 비교 -> 주민번호가 다르므로 같은 객체

        System.out.println("person1 hashcode: " + person1.hashCode()); //hashcode로 주민번호 반환
        System.out.println("person2 hashcode: " + person2.hashCode());
        System.out.println("person3 hashcode: " + person3.hashCode());

        System.out.println("person1 adress: " + System.identityHashCode(person1)); //객체 실제 주소값
        System.out.println("person2 adress: " + System.identityHashCode(person2));
        System.out.println("person3 adress: " + System.identityHashCode(person3));
    }
}
