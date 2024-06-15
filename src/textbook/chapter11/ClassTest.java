package textbook.chapter11;

import textbook.chapter11.object.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //forName() 메서드에서 발생하는 예외 처리(이름과 일치하는 클래스가 없는 경우)
        //Clas 클래스: 클래스 정보를 찾기 위함
        Person person = new Person(); //person 인스턴스 생성
        Class pClass1 = person.getClass(); //Object의 getClass() 메소드 사용(클래스형으로 반환)
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; //직접 class 파일 대입
        System.out.println(pClass2.getName());

        String className = "textbook.chapter11.object.Person"; //동적 로딩: 변수값만 바꾸면 다른 클래스 로딩 가능(오타 주의)
        Class pClass3 = Class.forName(className); // 클래스 이름(문자열)으로 가져오기, forName()은 정적 메서드
        System.out.println(pClass3.getName()); //이름과 일치하는 클래스가 없는 경우 ClassNotFoundException 발생함

        System.out.println("===reflection==="); 
        //reflection: class 클래스로 가져온 클래스 정보를 활용하여 코딩
        //리플렉션 프로그래밍: 컴파일 시점에 알 수 없는 클래스를 로딩할 때 사용(예외 처리 필요+코드 복잡성 증가+속도 감소)

        //java.lang.reflect 패키지에 정의된 constructor, method, field 클래스
        Constructor[] cons = pClass3.getConstructors(); //모든 생성자 가져오기
        for(Constructor c : cons){
            System.out.println(c);
        }
        System.out.println();
        Field[] fields = pClass3.getFields(); //모든 멤버 편수(필드) 가져오기
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println();
        Method[] methods = pClass3.getMethods(); //모든 메서드 가져오기
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println("===new instance===");
        System.out.println(person);

        Person person2 = (Person)pClass3.newInstance(); //Class 클래스의 newInstance()로 인스턴스 생성(Person 클래스의 기본 생성자 호출)
        //newInstance()는 항상 Object형으로 반환->생성된 객체형으로 형변환 필수
        System.out.println(person2);
    }
}
