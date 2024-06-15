package textbook.chapter11;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc"); //문자열 객체 생성
        String str2 = new String("abc");

        System.out.println("str1 == str2: " + (str1 == str2)); //false->서로 다른 객체라 주소값 다름
        System.out.println("str1.equals(str2): " + str1.equals(str2)); //true->서로 다른 객체지만 객체 값은 같음

        String str3 = "abc"; //문자열 상수 가리킴
        String str4 = "abc";

        System.out.println("str3 == str4: " + (str3 == str4)); //true ->상수 풀(상수 값 저장하는 메모리)에 저장된 상수 메모리 주소를 가리킴
        System.out.println("str3.equals(str4): " + str3.equals(str4)); //true ->값 같음

        System.out.println("===concat===");
        String javaStr = new String("java"); //string클래스의 문자 상수 배열 값에 저장->한번 생성되면 변경 불가=문자열 불변
        String adrStr = new String("android");
        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(adrStr); //java와 android 문자열의 연결=새로운 문자열 생성 후 대입

        System.out.println(javaStr); //javaandroid
        System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr)); //주소 값 달라짐


        System.out.println("===builder and buffer===");
        //버퍼와 빌더는 변경 가능한 문자 배열/버퍼는 동시에 문자열 변경 시 안전성 보장, 빌더는 안전성 보장 x, 실행속도는 더 빠름
        StringBuilder buffer = new StringBuilder(javaStr); //String으로 부터 StringBuilder 생성
        System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
        buffer.append(" and"); // 문자열 추가
        buffer.append(" android"); // 문자열 추가
        buffer.append(" programming is fun!!!"); //문자열 추가
        System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
        //버퍼라는 하나의 메모리에 문자열 계속 연결함=주소 같음

        javaStr = buffer.toString(); //String 클래스로 반환
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소 :" +System.identityHashCode(javaStr)); //새로 생성된 메모리 주소
    }
}
