package textbook.chapter11;

public class WrapperTest {
    public static void main(String[] args) {
        //integer클래스의 value는 final 변수(한번 생성되면 변경 불가)
        
        Integer number1 = Integer.valueOf("10"); //생성자 사용하지 않고 정수나 문자열을 바로 Integer 형으로 반환
        int pnum = Integer.parseInt("20"); //숫자 문자열을 int 값으로 반환
        
        Integer num = 100; //Integer(클래스)는 인스턴스 생성해야 함
        int iNum = num.intValue();  //Integer 클래스에서 정수 값만 가져옴, 기본형으로 꺼냄(언박싱), 변환은 컴파일러가 담당
        int jNum = 200; //기본 자료형

        int sum = iNum + jNum;
        System.out.println(sum);

        int total = num + jNum;   //num.inValue() + jNum로 변환(언박싱) = 객체형->기본형
        System.out.println(total);

        Integer i = jNum; //Integer.valueOf(j)로 변환(오토박싱) = 기본형->객체형
        System.out.println(i); 
    }
}
