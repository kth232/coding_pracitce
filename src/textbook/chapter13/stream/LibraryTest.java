package textbook.chapter13.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>( );

        bookList.add(new Book("java", 25000));
        bookList.add(new Book("python", 15000));
        bookList.add(new Book("android", 30000));

        System.out.println("==전체 책 목록==");
        bookList.stream().forEach(s-> System.out.printf("subject: %s, price: %d%n", s.getSubject(), s.getPrice()));

        //스트림 생성하고 출력하기
        System.out.println("==전체 책 가격==");
        int totalPrice = bookList.stream()
                .mapToInt(b->b.getPrice())
                .sum();
        System.out.println("total price: " + totalPrice + "원");

        System.out.println("==가격이 2만원 이상인 책의 이름(정렬o)==");
        bookList.stream()
                .filter(b->b.getPrice() >= 20000)
                .map(b->b.getSubject())
                .sorted()
                .forEach(s->System.out.println(s));
    }
}
