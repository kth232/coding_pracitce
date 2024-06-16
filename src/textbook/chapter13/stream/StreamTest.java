package textbook.chapter13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        System.out.println("==number list==");
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).forEach(n->System.out.print(n + "/"));
        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "/");
        }
        System.out.println();

        int sum  = Arrays.stream(arr).sum();
        System.out.println("sum: "+ sum);

        int count = (int) Arrays.stream(arr).count(); //count() 반환값이 long이므로 int으로 형변환
        System.out.println("count: " + count); //요소 개수 출력


        System.out.println("==string list==");
        List<String> sList = new ArrayList<String>();
        sList.add("Melon");
        sList.add("Apple");
        sList.add("Orange");

        Stream<String> stream = sList.stream(); //스트림 생성(자료 처리 기능 클래스)
        stream.forEach(s->System.out.print(s + "/")); //배열 요소 하나씩 출력, 기존 자료에 영향x(별도 메모리 공간 존재)
        System.out.println();

        sList.stream() //스트림은 자료를 소모하며 연산 수행->한번 사용하면 재사용 불가
                .sorted() //중간연산: 여러 개 적용 가능-정렬
                .forEach(s->System.out.print(s+ "/")); //최종연산-마지막에 한번만 호출, 최종연산이 호출되어야 결과 만들어짐
        System.out.println();

        sList.stream()
                .map(s->s.toUpperCase())//map: 지정된 함수를 적용한 결과 추출
                .forEach(n->System.out.print(n + "/"));
        System.out.println();

        sList.stream()
                .filter(s->s.length() >= 6) //filter: 조건에 참인 경우만 추출
                .forEach(s->System.out.println(s)); //문자열 길이가 6자리 이상인 orange만 출력
        System.out.println();
    }
}
