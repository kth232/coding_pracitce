package textbook.chapter13.stream;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args) {

        String[] greetings = {"bye", "hello", "good!", "hi"};

        //reduce 연산: 내부적으로 스트림 요소를 하나씩 소모하며 사용자가 직접 지정한 기능 수행
        //초기값: "", 각 요소가 수행해야 하는 기능(람다식), apply() 필수 호출
        //내부적으로 반복문이 호출되면서 람다식 부분이 리스트 요소만큼 호출
        System.out.println(Arrays.stream(greetings)
                .reduce("", (s1, s2)-> {if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else return s2;}));
        //두 문자열을 비교해서 가장 긴 문자열을 반환
    }
}
