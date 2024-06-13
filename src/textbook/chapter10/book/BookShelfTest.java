package textbook.chapter10.book;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue shelfQueue = new BookShelf(); //큐 인터페이스형 bookshelf 객체 생성
        System.out.println("넣은 책: " + shelfQueue.enQueue("book1"));
        System.out.println("넣은 책: " + shelfQueue.enQueue("book2"));
        System.out.println("넣은 책: " + shelfQueue.enQueue("book3"));
        //순서대로 요소 추가
        System.out.println("현재 책 권 수: " + shelfQueue.getSize());

        System.out.println("꺼낸 책: " + shelfQueue.deQueue());
        System.out.println("꺼낸 책: " + shelfQueue.deQueue());
        System.out.println("꺼낸 책: " + shelfQueue.deQueue());
        //입력 순서대로 요소를 꺼내서 출력

        System.out.println("현재 책 권 수: " + shelfQueue.getSize());

    }
}
