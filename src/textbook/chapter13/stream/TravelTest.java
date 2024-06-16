package textbook.chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        TravelCustomer customer1 = new TravelCustomer("lee", 40, 100);
        TravelCustomer customer2 = new TravelCustomer("kim", 20, 100);
        TravelCustomer customer3 = new TravelCustomer("park", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        System.out.println("== 고객 명단에 추가된 순서대로 출력 ==");
        customerList.stream()
                .map(c->c.getName()) //고객명만 추출
                .forEach(s->System.out.println(s));

        int total = customerList
                .stream()
                .mapToInt(c->c.getPrice()) //비용 값을 정수로 반환
                .sum();
        System.out.println("* 총 여행 비용 :" + total);

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream()
                .filter(c->c.getAge() >= 20)
                .map(c->c.getName())
                .sorted()
                .forEach(s->System.out.println(s));
    }
}
